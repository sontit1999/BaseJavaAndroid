package com.example.testphonefirebase.fragment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.testphonefirebase.model.User;
import com.example.testphonefirebase.adapter.UserAdapter;
import com.example.testphonefirebase.base.BaseViewmodel;

import java.util.ArrayList;

public class Fragviewmodel extends BaseViewmodel {
    public UserAdapter adapter = new UserAdapter();
    MutableLiveData<ArrayList<User>> arr = new MutableLiveData<>();
    public Fragviewmodel(@NonNull Application application) {
        super(application);
    }
    public MutableLiveData<ArrayList<User>> getArr(){
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("sontit1","1"));
        arrayList.add(new User("sontit2","2"));
        arrayList.add(new User("sontit3","3"));
        arrayList.add(new User("sontit4","4"));
        arrayList.add(new User("sontit5","5"));

        arr.postValue(arrayList);
        return arr;
    }
}
