package com.example.testphonefirebase.fragment;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.testphonefirebase.R;
import com.example.testphonefirebase.model.Recipe;
import com.example.testphonefirebase.model.User;
import com.example.testphonefirebase.base.BaseFragment;
import com.example.testphonefirebase.databinding.FragmentTestBinding;

import java.util.ArrayList;

public class TestFragment extends BaseFragment<FragmentTestBinding, Fragviewmodel> {
    @Override
    public Class<Fragviewmodel> getViewmodel() {
        return Fragviewmodel.class;
    }

    @Override
    public int getLayoutID() {
        return R.layout.fragment_test;
    }

    @Override
    public void setBindingViewmodel() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerview.setLayoutManager(layoutManager);
        binding.recyclerview.setAdapter(viewmodel.recipeAdapter);
    }

    @Override
    public void ViewCreated() {
        viewmodel.getRecipe().observe(this, new Observer<ArrayList<Recipe>>() {
            @Override
            public void onChanged(ArrayList<Recipe> recipes) {
                viewmodel.recipeAdapter.setList(recipes);
            }
        });

    }
}
