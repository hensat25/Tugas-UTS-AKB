package com.example.myapplication8;

// Hendri Satya Nugraha
// 10117225
// IF-7
// 12-05-2020

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavigationView=findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ProfilFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod=new
            BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;
            switch (menuItem.getItemId()) {
                case R.id.profil:
                    fragment=new ProfilFragment();
                    break;
                case R.id.kontak:
                    fragment=new KontakFragment();
                    break;
                case R.id.teman:
                    fragment=new TemanFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();




            return true;
        }
    };
}
