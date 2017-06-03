package com.example.shubhamtripathi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view) {
        EditText enterAmount = (EditText) findViewById(R.id.enterAmount);

        String shub = enterAmount.getText().toString();

        double dollar = Double.parseDouble(shub);

        double indianRupee = dollar * 60 ;

        TextView RandomMessage = (TextView) findViewById(R.id.RandomMessage);

        RandomMessage.setText("Indian Rupee:- " + indianRupee);





        Toast.makeText(this, "Indian Rupee :- " + indianRupee, Toast.LENGTH_SHORT).show();

        if (indianRupee > 1000){

            Toast.makeText(this, "Man! You are rich!! ", Toast.LENGTH_SHORT).show();
        }

        else {

            Toast.makeText(this, "You are Poor Dude", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
