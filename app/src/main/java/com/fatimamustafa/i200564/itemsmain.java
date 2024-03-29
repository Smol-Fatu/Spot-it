package com.fatimamustafa.i200564;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
import android.annotation.SuppressLint;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationBarView;

public class itemsmain extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemsmain);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.home);

        LinearLayout item1 = findViewById(R.id.item1);
        LinearLayout item2 = findViewById(R.id.item2);
        LinearLayout item3 = findViewById(R.id.item3);
        LinearLayout item4 = findViewById(R.id.item4);
        LinearLayout item5 = findViewById(R.id.item5);
        LinearLayout item6 = findViewById(R.id.item6);
        LinearLayout item7 = findViewById(R.id.item7);
        LinearLayout item8 = findViewById(R.id.item8);


        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });
        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemsmain.this, itemdetails.class);
                startActivity(intent);
            }
        });

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.home) {
                    Intent intent = new Intent(itemsmain.this,itemsmain.class);
                    startActivity(intent);
                    finish();
                    return true;
                } else if (id==R.id.search) {
                    Intent intent = new Intent(itemsmain.this,search.class);
                    startActivity(intent);
                    finish();
                    return true;
                } else if (id==R.id.plus) {
                    Intent intent = new Intent(itemsmain.this,itembuy.class);
                    startActivity(intent);
                    finish();
                    return true;

                } else if (id==R.id.chat) {
                    Intent intent = new Intent(itemsmain.this,peoplechat.class);
                    startActivity(intent);
                    finish();
                    return true;

                } else if (id==R.id.profile) {
                    Intent intent = new Intent(itemsmain.this,profile.class);
                    startActivity(intent);
                    finish();
                    return true;

                }
                return false;
            }
        });
    }
}