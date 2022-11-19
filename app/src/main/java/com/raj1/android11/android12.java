package com.raj1.android11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class android12 extends AppCompatActivity {


    EditText width,height;
    Button enter;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android12);

        width=findViewById(R.id.widht);
        height=findViewById(R.id.height);
        enter=findViewById(R.id.btnenter);
        txt=findViewById(R.id.txtanswer);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float w=Float.parseFloat(width.getText().toString());
                float h=Float.parseFloat(height.getText().toString());

                
                float ans=(w/((h)+(h)))*10000;

                txt.setText(""+ans);

            }
        });
    }
}