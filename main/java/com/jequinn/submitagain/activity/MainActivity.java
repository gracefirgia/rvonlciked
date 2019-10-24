package com.jequinn.submitagain.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jequinn.submitagain.R;
import com.jequinn.submitagain.adapter.ItemCardViewAdapter;
import com.jequinn.submitagain.adapter.ItemGridAdapter;
import com.jequinn.submitagain.adapter.ItemListAdapter;
import com.jequinn.submitagain.model.Iphone;
import com.jequinn.submitagain.model.IphoneData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Iphone> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_iphone);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
//        list.addAll(IphoneData.getListData());
//        showRecyclerList();

        if (savedInstanceState == null){
            setActionBarTitle("List Mode");
            list.addAll(IphoneData.getListData());
            showRecyclerList();
            mode = R.id.action_list;
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Iphone> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId){
            case R.id.action_list:
                title = "List Mode";
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                title = "Grid Mode";
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                title = "CardView Mode";
                break;
            case R.id.action_user:
                title = "User Mode";
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
                break;
        }
        mode = itemId;
        setActionBarTitle(title);
    }

    private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(this);
        cardViewAdapter.setListIphone(list);
        recyclerView.setAdapter(cardViewAdapter);
    }

    private void showRecyclerGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        ItemGridAdapter gridAdapter = new ItemGridAdapter(this);
        gridAdapter.setListIphone(list);
        recyclerView.setAdapter(gridAdapter);
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemListAdapter listAdapter = new ItemListAdapter(this);
        listAdapter.setListIphone(list);
        recyclerView.setAdapter(listAdapter);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }
}
