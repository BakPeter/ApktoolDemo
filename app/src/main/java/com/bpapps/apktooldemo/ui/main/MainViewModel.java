package com.bpapps.apktooldemo.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> msg = new MutableLiveData<>("Hello android hacking");

    public LiveData<String> getMsg() {
        return msg;
    }
}