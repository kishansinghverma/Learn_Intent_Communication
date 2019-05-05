package com.example.intent_communication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent=getIntent();

        ArrayList friends_list=intent.getStringArrayListExtra("Friends");
        int roll_no=intent.getIntExtra("Roll_No", 0);
        String name=intent.getStringExtra("Name");
        Boolean isHostler=intent.getBooleanExtra("IsHostler", false);
        float age=intent.getFloatExtra("Age", 0);
        String[] subject_Array=intent.getStringArrayExtra("Subjects");

        String subject=new String();
        String friends=new String();

        for(String x: subject_Array)
        {
            subject += "\n";
            subject += x;
        }

        Iterator<String> loop=friends_list.iterator();
        while (loop.hasNext())
        {
            friends += "\n";
            friends += loop.next();
        }


        ((TextView)findViewById(R.id.tv1)).setText("Roll No: "+roll_no);
        ((TextView)findViewById(R.id.tv2)).setText("Name: "+name);
        ((TextView)findViewById(R.id.tv3)).setText("Hostler: "+isHostler);
        ((TextView)findViewById(R.id.tv4)).setText("Age: "+age);
        ((TextView)findViewById(R.id.tv5)).setText("\nSubjects: "+subject+"\n");
        ((TextView)findViewById(R.id.tv6)).setText("Friends: "+friends);



    }
}
