package edu.orangecoastcollege.cs273.sbadajoz.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mCountTextView;

    private Counter mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCounter = new Counter();
        mCountTextView = (TextView) findViewById(R.id.countTextView);
    }

    public void tapButton(View view) {
        mCounter.setCount(mCounter.incrementCount());
        mCountTextView.setText(String.valueOf(mCounter.getCount()))



































        ;
    }
}

