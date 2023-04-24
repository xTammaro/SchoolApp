package com.example.readyforhighschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class first_login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_login);

        Button button = (Button) findViewById(R.id.assessbutton);
        // Register the onClick listener with the implementation above
        button.setOnClickListener(myListener);
    }
    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // do something when the button is clicked.
            Intent intent = new Intent(getApplicationContext(), executive_function.class);
            startActivity(intent);
        }
    };
}
