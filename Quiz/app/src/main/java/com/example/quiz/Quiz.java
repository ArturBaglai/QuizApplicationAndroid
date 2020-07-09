package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    public static List<Question> Questions =new ArrayList <Question>();

    static {
        Questions.add(new Question("What is the capital of Estonia?",new String[] {"Tallinn","Tartu","Parnu","Narva"},0, R.drawable.tallinn_old_town, false));
        Questions.add(new Question("Select capital of Russia:", new String []{"Saint-Petersburg","Moscow","Samara","Ekaterenburg"},1,R.drawable.russia, false));
        Questions.add(new Question("Select capital of Finland:", new String []{"Helsinki","Kotka","Vaasa","Oulu"},0,R.drawable.finland, false));
        Questions.add(new Question("Select capital of Germany:", new String []{"Hamburg","Frankfurt","Nuremberg","Berlin"},3,R.drawable.germany,false));
        Questions.add(new Question("Select capital of Norway:", new String []{"Skien","Drammen","Oslo","Hamar"},2,R.drawable.norway,false));
        Questions.add(new Question("Select capital of Poland:", new String []{"Wroclaw","Gdansk","Warsaw","Lublin"},2,R.drawable.poland,false));
        Questions.add(new Question("Select capital of Slovenia:", new String []{"Ljubljana","Celje","Maribor","Ptuj"},0,R.drawable.slovenia,false));
        Questions.add(new Question("Select capital of Romania:", new String []{"Cluj-Napoca","Timisoara","Bucharest","Lasi"},2,R.drawable.romania,false));
        Questions.add(new Question("Select capital of U.S.A.:", new String []{"Philadelphia","New York","Pittsburgh","Washington"},3,R.drawable.usa,false));
        Questions.add(new Question("Select capital of Latvia:", new String []{"Riga","Jurmala","Jelgava","Valka"},0,R.drawable.latvia,false));


    }


}
