package com.example.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public Question(int textResId, boolean answerTrue){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    @Override
    public String toString() {
        return "Question{" +
                "mTextResId=" + mTextResId +
                ", mAnswerTrue=" + mAnswerTrue +
                '}';
    }
}
