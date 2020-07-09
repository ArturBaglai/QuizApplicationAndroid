package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

import static com.example.quiz.Quiz.Questions;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView questionView;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    ImageButton imageButtonTip;

    TextView pointsTextView;
    private int points ;
    private int picture;
    String UserAnswer;
    final String Tag = "lifecycle";
    static final String SCORE = "score";
    ImageView imageView;
    String title;
    boolean tipsButtonIsCLicked ;
    Random rand = new Random();
    int number = rand.nextInt(4);

    String[] answersArray = Questions.get(number).getAnswers();
    int trueAnswer = Questions.get(number).getTrueAnswer();
    private int points1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipsButtonIsCLicked = false;
        Log.d(Tag,"Main Activity  создано");
        questionView = (TextView)findViewById(R.id.questionView);
        answer1= (Button)findViewById(R.id.answer1);
        answer1.setOnClickListener(this);
        answer2=(Button)findViewById(R.id.answer2);
        answer2.setOnClickListener(this);
        answer3=(Button)findViewById(R.id.answer3);
        answer3.setOnClickListener(this);
        answer4=(Button)findViewById(R.id.answer4);
        answer4.setOnClickListener(this);
        pointsTextView = (TextView)findViewById(R.id.pointsTextView);
        imageView=(ImageView)findViewById(R.id.imageView);

        //floatingActionButton =(FloatingActionButton)findViewById(R.id.floatingActionButton);
        //Question question = new Question();
        imageButtonTip = (ImageButton)findViewById(R.id.imageButtonTip);
        imageButtonTip.setOnClickListener(this);
       // for( Question question : Questions){
        if(Questions.get(number).getQuestionAsked()==false){
            //Questions.get(number).setQuestionAsked(true);
            title =  Questions.get(number).getTitle();
            questionView.setText(title);
            picture = Questions.get(number).getImage();
            imageView.setImageResource(picture);


            answer1.setText(answersArray[0]);
            answer2.setText(answersArray[1]);
            answer3.setText(answersArray[2]);
            answer4.setText(answersArray[3]);

        }




        //}
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"Main  Activity становится видимым");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"Main  Activity resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"Main  Activity приостановлено (состояние Pased)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"Main  Activity остановлено (состояние Stop)");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"Main  Activity унечтожено");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt("points",points);
        outState.putInt("picture",picture);
        outState.putString("arrayAnswers", String.valueOf(answersArray));
        outState.putString("questionTitle",title);

       // Log.d(Tag, "onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
         points = savedInstanceState.getInt("points");
        String score = new Integer(points).toString();
        pointsTextView.setText("Score: "+score);

        //picture = savedInstanceState.getInt("picture");
        imageView.setImageResource(picture);



        //answersArray=savedInstanceState.getStringArray("arrayAnswers");

       // answer1.setText(answersArray[0]);
      //  answer2.setText(answersArray[1]);
      //  answer3.setText(answersArray[2]);
       // answer4.setText(answersArray[3]);

        title = savedInstanceState.getString("questionTitle");
        //questionView.setText(title);
       // Log.d(Tag, points);
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){

            case R.id.answer1:
                 UserAnswer = (String) answer1.getText();

                if(findIndex(answersArray,UserAnswer) == trueAnswer){
                    if (tipsButtonIsCLicked==false){
                        points = points+5;
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        //Intent intent = new Intent(this,MainActivity.class);
                        // startActivity(intent);
                        recreate();
                    } else if (tipsButtonIsCLicked==true){
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        recreate();
                    }

                    //intent.putExtra("score",answer1.getText().toString());
                   // startActivity(intent);
                } else if (findIndex(answersArray,UserAnswer) != trueAnswer){
                    if(points >0){
                        points = points -5;
                    } else if(points<0){
                        points =0;
                    }
                    String score = new Integer(points).toString();
                    pointsTextView.setText("Score: "+score);
                    recreate();
                }
                break;

            case R.id.answer2:
                 UserAnswer = (String) answer2.getText();

                if(findIndex(answersArray,UserAnswer) == trueAnswer){
                    if (tipsButtonIsCLicked==false){
                        points = points+5;
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        //Intent intent = new Intent(this,MainActivity.class);
                        // startActivity(intent);
                        recreate();
                    } else if (tipsButtonIsCLicked==true){
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        recreate();
                    }
                }else if (findIndex(answersArray,UserAnswer) != trueAnswer){
                    if(points >0){
                        points = points -5;
                    } else if(points<0){
                        points =0;
                    }
                    String score = new Integer(points).toString();
                    pointsTextView.setText("Score: "+score);
                    recreate();
                }
                break;
            case R.id.answer3:
                UserAnswer = (String) answer3.getText();

                if(findIndex(answersArray,UserAnswer) == trueAnswer){
                    if (tipsButtonIsCLicked==false){
                        points = points+5;
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        //Intent intent = new Intent(this,MainActivity.class);
                        // startActivity(intent);
                        recreate();
                    } else if (tipsButtonIsCLicked==true){
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        recreate();
                    }
                }else if (findIndex(answersArray,UserAnswer) != trueAnswer){
                    if(points >0){
                        points = points -5;
                    } else if(points<0){
                        points =0;
                    }
                    String score = new Integer(points).toString();
                    pointsTextView.setText("Score: "+score);
                    recreate();
                }
                break;
            case R.id.answer4:
                UserAnswer = (String) answer4.getText();

                if(findIndex(answersArray,UserAnswer) == trueAnswer){
                    if (tipsButtonIsCLicked==false){
                        points = points+5;
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        //Intent intent = new Intent(this,MainActivity.class);
                        // startActivity(intent);
                        recreate();
                    } else if (tipsButtonIsCLicked==true){
                        String score = new Integer(points).toString();
                        pointsTextView.setText("Score: "+score);
                        recreate();
                    }
                }else if (findIndex(answersArray,UserAnswer) != trueAnswer){
                    if(points >0){
                        points = points -5;
                    } else if(points<0){
                        points =0;
                    }

                    String score = new Integer(points).toString();
                    pointsTextView.setText("Score: "+score);
                    recreate();
                }
                break;
            case R.id.imageButtonTip:
                tipsButtonIsCLicked = true;
                Toast toast = Toast.makeText(MainActivity.this,findTrueAnswer(answersArray, Questions.get(number).getTrueAnswer()),Toast.LENGTH_LONG);
                toast.show();
                break;
        }

    }
    public static int findIndex(String array[],String word){
        for (int i = 0;i <= array.length; i++ ){
            if(array[i]==word){
                return i;
            }
        }
        return -1;
    }
    public static String findTrueAnswer(String array[], int trueAnswer){
        for (int i = 0; i<=array.length;i++){
            if(i==trueAnswer){
                return array[i];
            }
        }
        return null;
    }

}
