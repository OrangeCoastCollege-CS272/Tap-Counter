package edu.orangecoastcollege.cs273.sbadajoz.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String tag = MainActivity.class.getSimpleName();

    private TextView mCountTextView;

    private Counter mCounter;

    /**
     * Called whenever teh TapCounter app is redrawn
     *
     * @param savedInstanceState A bundle of information from which previously saved state can be restored
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCounter = new Counter();
        mCountTextView = (TextView) findViewById(R.id.countTextView);

        Log.i(tag, "onCreate successfully terminated");
    }

    public void tapButton(View view) {
        mCounter.setCount(mCounter.incrementCount());
        mCountTextView.setText(String.valueOf(mCounter.getCount()));
    }
}

