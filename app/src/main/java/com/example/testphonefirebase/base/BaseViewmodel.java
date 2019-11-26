package com.example.testphonefirebase.base;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public abstract class BaseViewmodel extends AndroidViewModel {
    public BaseViewmodel(@NonNull Application application) {
        super(application);
    }
}
