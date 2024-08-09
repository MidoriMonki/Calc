package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
/*
    private float equation(float i, float j, char type){
        float result = 0;
        switch(type){
            case '+':
                result = i+j;
                break;
            case '-':
                result = i-j;
                break;
            case '*':
                result = i*j;
                break;
            case '/':
                result = i/j;
                break;
            default:
                break;
        }
        return result;
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        TextView result = findViewById(R.id.result);


        addButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,StandingsActivity.class));
                try{
                    float i = Float.parseFloat(String.valueOf(input1.getText()));
                    float j = Float.parseFloat(String.valueOf(input2.getText()));
                    result.setText(String.valueOf(i+j));
                }catch(Exception e){
                    result.setText("Error");
                }
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,StandingsActivity.class));
                try{
                    float i = Float.parseFloat(String.valueOf(input1.getText()));
                    float j = Float.parseFloat(String.valueOf(input2.getText()));
                    result.setText(String.valueOf(i-j));
                }catch(Exception e){
                    result.setText("Error");
                }
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,StandingsActivity.class));
                try{
                    float i = Float.parseFloat(String.valueOf(input1.getText()));
                    float j = Float.parseFloat(String.valueOf(input2.getText()));
                    result.setText(String.valueOf(i*j));
                }catch(Exception e){
                    result.setText("Error");
                }
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this,StandingsActivity.class));
                try{
                    float i = Float.parseFloat(String.valueOf(input1.getText()));
                    float j = Float.parseFloat(String.valueOf(input2.getText()));
                    result.setText(String.valueOf(i/j));
                }catch(Exception e){
                    result.setText("Error");
                }
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}