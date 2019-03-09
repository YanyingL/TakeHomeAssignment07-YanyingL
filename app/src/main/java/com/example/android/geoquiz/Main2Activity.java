package com.example.android.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String EXTRA_ANSWER_IS_TRUE="t";
    public static final String EXTRA_ANSWER_SHOWN="i";
    public boolean mAnswerIsTrue;
    public TextView mAnswerTextView;
    public Button mShowAnswerButton;


    public static Intent newIntent(Context packageContext, boolean AnswerIsTrue){
        Intent intent=new Intent(packageContext,Main2Activity.class);
        intent.putExtra(EXTRA_ANSWER_IS_TRUE, AnswerIsTrue);
        return intent;
    }

    public static boolean wasAnswerShown(Intent result){
        return result.getBooleanExtra(EXTRA_ANSWER_SHOWN,false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mAnswerIsTrue=getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE,false);

        mAnswerTextView=(TextView)findViewById(R.id.answer_text_view);
        mShowAnswerButton=(Button)findViewById(R.id.show_answer_button);
        mShowAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAnswerIsTrue){
                    mAnswerTextView.setText(R.string.true_button);
                }else {mAnswerTextView.setText(R.string.false_button);
                }
                setAnwerShowResult(true);
                }
            });

    }

    public void setAnwerShowResult(boolean isAnswerShown){
        Intent data=new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN,isAnswerShown);
        setResult(RESULT_OK,data);
    }
}