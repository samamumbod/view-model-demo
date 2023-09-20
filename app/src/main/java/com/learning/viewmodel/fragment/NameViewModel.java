package com.learning.viewmodel.fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Serves as the communication point between fragments
 * It receives the name given by the user and shares it to the other fragment.
 */
public class NameViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mName = new MutableLiveData<>();

    public LiveData<String> getName() {
        return mName;
    }

    public void setName(String name) {
        mName.setValue(name);
    }
}