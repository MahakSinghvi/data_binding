package com.ps.agrostand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.ps.agrostand.databinding.ActivityBindBinding;

public class BindActivity extends AppCompatActivity {
    //todo yaha paar xml ka name and then binding
    ActivityBindBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_bind);

        //yaha paar initialization
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bind);

        //now directly we can call name using binding
        binding.imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}