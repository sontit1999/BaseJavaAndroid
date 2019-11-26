package com.example.testphonefirebase.test;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.testphonefirebase.model.User;
import com.example.testphonefirebase.base.BaseViewmodel;

public class TestViewmodel extends BaseViewmodel {
    MutableLiveData<String> name = new MutableLiveData<>();
    public String name1 = "sontitdz";
    public TestViewmodel(@NonNull Application application) {
        super(application);
    }
    public void onButtonclick(){
        Log.d("test"," function on button click in viewmodel ");
    }
    public void onButtonclickwithparam(User user){
        Log.d("test"," function on button click in viewmodel :  " + user.getUsername() + user.getPassword());
    }
    public MutableLiveData<String> getName(){
        name.postValue("default name");
        return name;
    }
    public void changeName(){
        name.postValue("Change Name success!");
    }
}
