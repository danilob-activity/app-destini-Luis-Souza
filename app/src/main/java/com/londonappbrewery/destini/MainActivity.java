package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView mStoryTextView;
    Button mAnswerTop;
    Button mAnswerBottom;
    // TODO: Declare as variaveis aqui:

    Story mT1 = new Story(R.string.T1_Story);
    Answer mA1 = new Answer(R.string.T1_Ans1);
    Answer mA2 = new Answer(R.string.T1_Ans2);

    Story mT2 = new Story(R.string.T2_Story);
    Answer mB1 = new Answer(R.string.T2_Ans1);
    Answer mB2 = new Answer(R.string.T2_Ans2);


    Story mT3 = new Story(R.string.T3_Story);
    Answer mC1 = new Answer(R.string.T3_Ans1);
    Answer mC2 = new Answer(R.string.T3_Ans2);

    Story mT4 = new Story(R.string.T4_End);
    Story mT5 = new Story(R.string.T5_End);
    Story mT6 = new Story(R.string.T6_End);

    //indice corrente da historia
    private Story mStorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO: Faça o link do layout com a activity
        mStoryTextView.findViewById(R.id.storyTextView);
        mAnswerTop.findViewById(R.id.buttonTop);
        mAnswerBottom.findViewById(R.id.buttonBottom);

        //TODO:faça o mapeamento da história
        mT1.setAnswerTop(mA1);
        mT1.setAnswerBottom(mA2);

        mT2.setAnswerTop(mB1);
        mT2.setAnswerBottom(mB2);


        // TODO: Coloque o evento do click do botão, caso precise colocar a visibilidade no botão invisivel utilize a função
        // do botão setVisibility(View.GONE):


    }

}
