package com.example.mad_wk3prac;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    int count = 1;
    private static final String TAG = "ListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

    }

    private int random() {
        Random ran = new Random();
        int value = ran.nextInt(999999999);
        return value;
    }

    private User createUser() {
        int ran1 = random();
        int ran2 = random();
        String name = "Name" + ran1;
        boolean followed = false;
        int id = count;
        String description = "Description " + ran2;
        count++;
        User newUser = new User(name, description, id, false);
        return newUser;
    }
}