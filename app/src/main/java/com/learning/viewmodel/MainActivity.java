package com.learning.viewmodel;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.learning.viewmodel.fragment.FirstFragment;
import com.learning.viewmodel.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements FirstFragment.ItemOnClickListener {

    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = FirstFragment.newInstance();
        firstFragment.setItemOnClickListener(this);
        secondFragment = SecondFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragmentContainerView, firstFragment)
                .commit();
    }

    @Override
    public void onclick(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainerView, secondFragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}