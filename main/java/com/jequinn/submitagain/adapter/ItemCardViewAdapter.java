package com.jequinn.submitagain.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jequinn.submitagain.R;
import com.jequinn.submitagain.activity.DetailActivity;
import com.jequinn.submitagain.model.Iphone;

import java.util.ArrayList;

public class ItemCardViewAdapter extends RecyclerView.Adapter<ItemCardViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Iphone> listIphone;

    public ItemCardViewAdapter(Context context) {
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
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tvName.setText(getListIphone().get(position).getName());
        holder.tvDetail.setText(getListIphone().get(position).getRilis());
        Glide.with(context)
                .load(getListIphone().get(position).getPhoto())
                .into(holder.imgPhoto);
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
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

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_view);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_card_detail);
            btnDetail = itemView.findViewById(R.id.button);
        }
    }
}
