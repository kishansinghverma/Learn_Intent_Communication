package com.example.intent_communication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    String[] subject={"Computer Networks","DAA", "Python", "Unix"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<String> friends=new ArrayList<>();
                friends.add("Amit");
                friends.add("Rahul");
                friends.add("Sachin");
                Intent intent=new Intent(MainActivity.this, Next.class);
                intent.putExtra("Roll_No", 1234);
                intent.putExtra("Name", "Kishan");
                intent.putExtra("IsHostler", false);
                intent.putExtra("Age", (float)21.7);
                intent.putExtra("Subjects", subject);
                intent.putExtra("Friends", friends);
                startActivity(intent);
            }
        });
    }
}
