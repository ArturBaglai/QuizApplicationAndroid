package com.example.quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class startActivity  extends AppCompatActivity implements View.OnClickListener {
    Button startButton;

    final String Tag = "lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startquiz);
        Log.d(Tag," Start Activity created");
        startButton =(Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(this);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag," Start Activity is getting visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"Start Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"Start Activity Pased");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"Start Activity  Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"Start Activity destroyed");
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.startButton:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);

                break;
                default:
                    break;
        }
    }
}
