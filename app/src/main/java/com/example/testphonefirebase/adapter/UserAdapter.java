package com.example.testphonefirebase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testphonefirebase.BR;
import com.example.testphonefirebase.R;
import com.example.testphonefirebase.base.BaseAdapter;
import com.example.testphonefirebase.databinding.ItemRectclerviewBinding;
import com.example.testphonefirebase.model.User;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter<User,ItemRectclerviewBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.item_rectclerview;
    }

    @Override
    public int getIdVariable() {
        return com.example.testphonefirebase.BR.user;
    }
}
