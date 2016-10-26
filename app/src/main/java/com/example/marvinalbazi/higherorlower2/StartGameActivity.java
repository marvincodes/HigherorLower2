package com.example.marvinalbazi.higherorlower2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class StartGameActivity extends AppCompatActivity {

    int randomNumber;
    EditText numberGuessed;
    int numberEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        Toast.makeText(getApplicationContext(), "Please guess the number", Toast.LENGTH_LONG).show();

        Random generateNumber = new Random();
        randomNumber = generateNumber.nextInt(11);
        numberGuessed = (EditText) findViewById(R.id.et_numberEntered);
    }

    public void guessNumber(View view) {
        numberEntered = Integer.parseInt(numberGuessed.getText().toString());

        //if the number is to high, do the following
        if (numberEntered > randomNumber) {

            Toast.makeText(getApplicationContext(), "Number is to High", Toast.LENGTH_LONG).show();
            //if the number is too low, do the following
        } else if (numberEntered < randomNumber) {

            Toast.makeText(getApplicationContext(), "Number is too low", Toast.LENGTH_LONG).show();


            //if the number is correct do the following
        } else if (numberEntered == randomNumber) {

            Toast.makeText(getApplicationContext(), "Guessed Right", Toast.LENGTH_LONG).show();

            Random generateNumber = new Random();
            randomNumber = generateNumber.nextInt(11);
            numberGuessed = (EditText) findViewById(R.id.et_numberEntered);




        }

    }
}