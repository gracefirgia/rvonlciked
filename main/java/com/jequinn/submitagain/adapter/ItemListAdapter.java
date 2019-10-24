package com.jequinn.submitagain.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jequinn.submitagain.R;
import com.jequinn.submitagain.activity.DetailActivity;
import com.jequinn.submitagain.model.Iphone;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Iphone> listIphone;

    public ItemListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Iphone> getListIphone() {
        return listIphone;
    }

    public void setListIphone(ArrayList<Iphone> listIphone) {
        this.listIphone = listIphone;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListIphone().get(position).getName());
        holder.tvDetail.setText(getListIphone().get(position).getRilis());

        Glide.with(context)
                .load(getListIphone().get(position).getPhoto())
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_IPHONE, listIphone.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListIphone().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;
        ImageView imgPhoto;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            relativeLayout = itemView.findViewById(R.id.relative);
        }
    }
}
