package com.example.testphonefirebase.adapter;

import androidx.annotation.NonNull;

import com.example.testphonefirebase.base.BaseAdapter;
import com.example.testphonefirebase.databinding.ItemRectclerviewBinding;
import com.example.testphonefirebase.model.User;

public class testAdapter extends BaseAdapter<User, ItemRectclerviewBinding> {

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public int getIdVariable() {
        return 0;
    }
}
