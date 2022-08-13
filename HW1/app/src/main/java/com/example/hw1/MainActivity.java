package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Gradecalculater = (TextView)findViewById(R.id.text1);
        TextView result = (TextView)findViewById(R.id.text7);
        EditText quizes = (EditText)findViewById(R.id.text3);
        EditText homework = (EditText)findViewById(R.id.text4);
        EditText midterm = (EditText)findViewById(R.id.text5);
        EditText final30 = (EditText)findViewById(R.id.text6);
        Button calculate = (Button)findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(quizes.getText().toString());
                int n2 = Integer.parseInt(homework.getText().toString());
                int n3 = Integer.parseInt(midterm.getText().toString());
                int n4 = Integer.parseInt(final30.getText().toString());
                int total = n1 + n2 + n3 + n4 ;
                result.setText(String.valueOf(total));


            }
        });

    }

}
