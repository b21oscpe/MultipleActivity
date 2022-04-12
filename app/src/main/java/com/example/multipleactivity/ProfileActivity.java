package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private Button signout;
    private TextView usernameview;

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("==>", "Profile activity resumed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "Profile activity started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "Profile activity stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "Profile activity destroyed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d("==>", "ProfileActivity created!");

        signout = findViewById(R.id.signout_button);
        usernameview = findViewById(R.id.welcome_label);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>", "Username from intent:"+username);

        usernameview.setText(username);

        signout = findViewById(R.id.signout_button);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Signed out!");
                finish();
            }
        });
    }
}