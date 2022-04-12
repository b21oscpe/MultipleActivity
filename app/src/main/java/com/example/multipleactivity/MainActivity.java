package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainActivity created!");

        signIn.findViewById(R.id.signin_button);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Button clicked!");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity started!");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "MainActivity resumed!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity destroyed!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity stopped!");
    }
}