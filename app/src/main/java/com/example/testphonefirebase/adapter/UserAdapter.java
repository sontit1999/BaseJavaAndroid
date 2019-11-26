package com.example.testphonefirebase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testphonefirebase.R;
import com.example.testphonefirebase.model.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
    ArrayList<User> datalist = new ArrayList<>();

    public UserAdapter() {
    }

    public void setList(ArrayList<User> list){
        this.datalist = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rectclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindata(datalist.get(position));
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_username;
        TextView tv_password;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_username = (TextView) itemView.findViewById(R.id.tv_username);
            tv_password = (TextView) itemView.findViewById(R.id.tv_pass);
        }
        public void bindata(User user){
            tv_username.setText(user.getUsername());
            tv_password.setText(user.getPassword());
        }
    }
}
