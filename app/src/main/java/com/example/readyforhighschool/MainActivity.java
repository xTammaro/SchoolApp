package com.example.readyforhighschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Capture our button from layout
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.loginButton);
        // Register the onClick listener with the implementation above
        button.setOnClickListener(myListener);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume!", Toast.LENGTH_LONG).show();
    }
    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // do something when the button is clicked.
            Intent intent = new Intent(getApplicationContext(), first_login.class);
            startActivity(intent);
        }
    };
 }