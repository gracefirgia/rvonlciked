package com.jequinn.submitagain.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jequinn.submitagain.R;
import com.jequinn.submitagain.model.Iphone;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_IPHONE = "extra_iphone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail_activity);
        TextView tvName = findViewById(R.id.tv_name_detail);
        TextView tvDetail = findViewById(R.id.tv_detail_detail);
        TextView tvHarga = findViewById(R.id.tv_harga_detail);
        TextView tvVarian = findViewById(R.id.tv_varian_detail);
        TextView tvWarna = findViewById(R.id.tv_warna_detail);

        Iphone iphone = getIntent().getParcelableExtra(EXTRA_IPHONE);

        Glide.with(this)
                .load(iphone.getPhoto())
                .into(imageView);
        tvName.setText(iphone.getName());
        tvDetail.setText(iphone.getRilis());
        tvHarga.setText(iphone.getHarga());
        tvVarian.setText(iphone.getVarian());
        tvWarna.setText(iphone.getWarna());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.back:
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
