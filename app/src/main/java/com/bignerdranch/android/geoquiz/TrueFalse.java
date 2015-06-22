package com.bignerdranch.android.geoquiz;

/**
 * Created by KeerthanaS on 6/20/2015.
 */
public class TrueFalse {


    private int mQuestion;
    private boolean mTrueQuestion;


    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
    public void setQuestion(int question) {
        mQuestion = question;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }
}
