//NIM : 10118037
//Nama : Muhammad Ihsan
//Kelas : IF-1/S1/VI
//copyright 2021

package com.app.ihsan946.latihan2_10118037_IF1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void pindahRegister(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);

    }


}