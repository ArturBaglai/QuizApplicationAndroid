package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class finnish extends AppCompatActivity implements View.OnClickListener {
    TextView yourPoints;
    Button startQuizAgainBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yourPoints = (TextView)findViewById(R.id.yourPoints);
        startQuizAgainBtn= (Button)findViewById(R.id.startQuizAgainBtn);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.startQuizAgainBtn:

        }
    }
}
