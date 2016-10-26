package com.example.marvinalbazi.higherorlower2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method called when button is clicked
    public void startGame (View view){
        //We create a new object (StartGamePage) of type Intent
        // In order to create a new object of type intent, we must pass in 2 arguments-
        //1.'this' is the activity we're going from.
        //2.'StartGameActivity.class' is the activity we are going to.
        Intent startGamePage = new Intent(this, StartGameActivity.class);

        //startActivity method is called which takes in an instance/object of Intent
        startActivity(startGamePage);
    }
}
