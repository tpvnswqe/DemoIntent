package com.example.swqe.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {

    private static final int REQUEST_CODE =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);


        Button btn_A=findViewById(R.id.btn_A);
        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this,BActivity.class);
                //intent.putExtra("book_name", "測試");
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode){
            case  REQUEST_CODE:
                String result = data.getStringExtra("book_isbn");
                Log.d("mar","rrr"+result);
                break;
        }
    }
}
