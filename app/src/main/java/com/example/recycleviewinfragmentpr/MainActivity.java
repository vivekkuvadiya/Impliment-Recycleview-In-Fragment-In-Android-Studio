package com.example.recycleviewinfragmentpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mOpenFragBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOpenFragBtn = findViewById(R.id.openFrag_btn);

        mOpenFragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getSupportFragmentManager().beginTransaction().replace(R.id.container,new RecyclFrag()).addToBackStack(null).commit();

            }
        });

    }
}
