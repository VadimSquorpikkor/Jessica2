package com.squorpikkor.app.jessica2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/**Версия адаптера с двумя лисенерами.
 * Если задан ItemClickListener, то клик по пункту списка возвращает номер позиции;
 * если задан DeviceClickListener, то клик по пункту списка возвращает номер позиции возвращает
 * объект Nuclide соответствующий позиции в списке.
 *
 * Сам адаптер использую так (в onCreateView):
 *      RecyclerView recyclerView = view.findViewById(R.id.list);
 *      adapter = new AdapterTemplate();
 *      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
 *      recyclerView.setAdapter(adapter);
 *      adapter.setOnDeviceClickListener(this::connectTo);
 *      mViewModel.getNuclideList().observe(this, list -> adapter.setList(list));
 */
public class AlgorithmAdapter extends RecyclerView.Adapter<AlgorithmAdapter.AdapterViewHolder>{


    /**Альтернативный вариант конструктора, надо попробовать, тогда инициализация в фрагменте:
     //selectedAdapter = new SelectedNucAdapter(view.findViewById(R.id.basic_nuc_recycler), getActivity());
     //mViewModel.getSelectedNuclidesList().observe(getViewLifecycleOwner(), list1 -> selectedAdapter.setList(list1));*/
    public AlgorithmAdapter(RecyclerView recyclerView, Activity activity) {
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(this);
    }

    /**Лисенер, который будет возвращать позицию выбранного элемента*/
    private OnItemClickListener onItemClickListener;

    /**Лисенер, который будет возвращать объект Nuclide по позиции выбранного элемента*/
    private OnDeviceClickListener onNuclideClickListener;

    /**Список объкетов Nuclide для отображения в Recycler*/
    private ArrayList<Algorithm> list = new ArrayList<>();

    /**Конструктор*/
    public AlgorithmAdapter() {
    }

    /**Сеттер. После того, как список передан в адаптер, адаптер автоматом обновляет Recycler, для отображения изменений*/
    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<Algorithm> list) {
        if (list==null) list = new ArrayList<>();//Если list == null, то в ресайклер будет передан пустой лист
        this.list = list;
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public interface OnDeviceClickListener {
        void onDeviceClick(Algorithm algorithm);
    }

    /**Сеттер на лисенер1*/
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    /**Сеттер на лисенер2*/
    public void setOnNuclideClickListener(OnDeviceClickListener onNuclideClickListener) {
        this.onNuclideClickListener = onNuclideClickListener;
    }

    /**Лэйаут для элемента списка*/
    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_template, parent, false);
        return new AdapterViewHolder(view);
    }

    /**Каждый итем ресайклера заполняется данными из списка объектов ArrayList<Nuclide> list*/
    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Algorithm algorithm = list.get(position);

        holder.algorithm.setText(algorithm.getAlgorithm());
        holder.image.setImageResource(algorithm.getImage());
    }

    /**Размер списка*/
    @Override
    public int getItemCount() {
        return list.size();
    }

    /**Для итема устанавливаем ссылки на вью и лисенер*/
    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        private final TextView algorithm;
        private final ImageView image;


        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            algorithm = itemView.findViewById(R.id.algorithm);
            image = itemView.findViewById(R.id.image);

            /**Если задан ItemClickListener, то клик по пункту списка возвращает номер позиции;
             * если задан DeviceClickListener, то клик по пункту списка возвращает номер позиции возвращает объект BluetoothDevice соответствующий позиции в списке*/
            itemView.setOnClickListener(view -> {
                if (onItemClickListener != null) onItemClickListener.onItemClick(getAdapterPosition());
                if (onNuclideClickListener != null) onNuclideClickListener.onDeviceClick(list.get(getAdapterPosition()));
            });

        }
    }
}

