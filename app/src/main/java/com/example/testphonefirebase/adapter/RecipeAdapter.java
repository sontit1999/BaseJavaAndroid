package com.example.testphonefirebase.adapter;

import com.example.testphonefirebase.BR;
import com.example.testphonefirebase.R;
import com.example.testphonefirebase.base.BaseAdapter;
import com.example.testphonefirebase.databinding.ItemRecipeBinding;
import com.example.testphonefirebase.model.Recipe;

public class RecipeAdapter extends BaseAdapter<Recipe, ItemRecipeBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.item_recipe;
    }

    @Override
    public int getIdVariable() {
        return com.example.testphonefirebase.BR.recipe;
    }
}
