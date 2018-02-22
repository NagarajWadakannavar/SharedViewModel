package com.nagaraj.sharedviewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by NAGARAJ on 2/22/2018.
 */

public class SharedViewModel extends ViewModel {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
