package com.example.testphonefirebase.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class BaseAdapter<T ,VB extends ViewDataBinding> extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {
    protected ArrayList<T> datalist = new ArrayList<>();
    public abstract int getLayoutId();
    public abstract int getIdVariable();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        VB binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), getLayoutId(), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
    // cái onbindviewHolder này em ko override dc
    /*
    @Override
    public void onBindViewHolder(@NonNull ViewHolder<T,VB> holder, int position) {
            holder.binding.setVariable(getIdVariable(),datalist.get(position));
    }
    */
    class ViewHolder<T,VB extends ViewDataBinding> extends RecyclerView.ViewHolder{
        public VB binding;
        public ViewHolder(@NonNull VB binding) {
            super(binding.getRoot());
        }
        public void setVariable(int id,T t){
            binding.setVariable(id,t);
        }
    }
}
