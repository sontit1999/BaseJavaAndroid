package com.example.testphonefirebase.test;

import android.util.Log;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import com.example.testphonefirebase.R;
import com.example.testphonefirebase.fragment.TestFragment;
import com.example.testphonefirebase.model.User;
import com.example.testphonefirebase.base.BaseActivity;
import com.example.testphonefirebase.databinding.ActivityTestBinding;

public class TestActivity extends BaseActivity<ActivityTestBinding,TestViewmodel>{
    @Override
    public Class<TestViewmodel> getViewmodel() {
        return  TestViewmodel.class;
    }

    @Override
    public int getLayoutID() {
        return R.layout.activity_test;
    }

    @Override
    public void setBindingViewmodel() {
          binding.setViewmodel(viewmodel);
          binding.setUser(new User("sonkoi","sontit99"));
          addFragment( new TestFragment());
    }
    public void addFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(binding.frameLayout.getId(), fragment).commit();
    }
}
