package com.squorpikkor.app.jessica2.adapter;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.jessica2.Algorithm;
import com.squorpikkor.app.jessica2.R;

import java.util.ArrayList;

public class AlgorithmAdapter extends RecyclerView.Adapter<AlgorithmAdapter.AdapterViewHolder>{

    private OnItemClickListener onItemClickListener;

    private ArrayList<Algorithm> list = new ArrayList<>();

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<Algorithm> list) {
        Log.e("TAG", "setList: ");
        if (list==null) list = new ArrayList<>();//Если list == null, то в ресайклер будет передан пустой лист
        this.list = list;
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_template, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Algorithm algorithm = list.get(position);
        holder.image.setImageResource(algorithm.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);

            itemView.setOnClickListener(view -> {
                if (onItemClickListener != null) onItemClickListener.onItemClick(getAdapterPosition());
            });
        }
    }
}

