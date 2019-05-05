package com.example.intent_communication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent=getIntent();

        ArrayList friends=intent.getStringArrayListExtra("Friends");
        int roll_no=intent.getIntExtra("Roll_No", 0);
        String name=intent.getStringExtra("Name");
        Boolean isHostler=intent.getBooleanExtra("IsHostler", false);
        float age=intent.getFloatExtra("Age", 0);
        String[] subject=intent.getStringArrayExtra("Subjects");
    }
}
