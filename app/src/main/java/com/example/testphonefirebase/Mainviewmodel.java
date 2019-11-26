package com.example.testphonefirebase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.testphonefirebase.model.User;

public class Mainviewmodel extends AndroidViewModel {
    MutableLiveData<User> user = new MutableLiveData<>();
    MutableLiveData<Integer> number = new MutableLiveData<>();
    public Mainviewmodel(@NonNull Application application) {
        super(application);
        number.postValue(99999);
    }
    public MutableLiveData<User> getUser(){
        User us  = new User("son dz","sonkute");
        user.postValue(us);
        return user;
    }
    public void changeUser(){
        user.postValue(new User("titit","hihih"));
    }
    public MutableLiveData<Integer> getNumber(){
        return number;
    }
    public void tang(){
        number.postValue(number.getValue()+1);
    }
    public void giam(){
        number.postValue(number.getValue()-1);
    }
}
