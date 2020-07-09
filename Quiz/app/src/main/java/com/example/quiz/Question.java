package com.example.quiz;

public class Question {
    private String title;
    public String answers [];
    private int trueAnswer;
    private int image;
    private boolean questionAsked ;

    public Question(String title, String[] answers, int trueAnswer, int image, boolean questionAsked) {
        this.title = title;
        this.answers = answers;
        this.trueAnswer = trueAnswer;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean getQuestionAsked() {
        return questionAsked;
    }

    public void setQuestionAsked(boolean questionAsked) {
        this.questionAsked = questionAsked;
    }
}
