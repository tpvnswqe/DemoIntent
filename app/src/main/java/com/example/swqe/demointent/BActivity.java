package com.example.swqe.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;


public class BActivity extends AppCompatActivity {

    private static final int REQUEST_CODE =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

//        Intent intent = getIntent();
//        String book_name  = intent.getStringExtra("book_name");
//        Log.d("mar", "book_name:  "+ book_name);


        Button btn_B=findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra("book_isbn", "123456789");
                setResult(REQUEST_CODE, intent);
                finish();
            }
        });
        //test
    }
}
