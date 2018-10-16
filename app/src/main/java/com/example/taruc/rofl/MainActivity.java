package com.example.taruc.rofl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);
        //call super call to excecute the function

        //to display UI
        //R = resource class
        //layout = folder
        setContentView(R.layout.activity_main);
        textViewMsg = findViewById(R.id.textViewMessage);
    }

        // v = an instant of a class
        public void showMessage(View v)
        {
            //Linking UI to program
            textViewMsg.setText("Nani the fuck");

        }

        public void clearScreen(View v)
        {

            textViewMsg.setText("");


        }
}
