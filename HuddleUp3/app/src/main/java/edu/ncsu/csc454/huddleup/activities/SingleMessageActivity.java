package edu.ncsu.csc454.huddleup.activities;

import android.app.Activity;
import android.os.Bundle;

import edu.ncsu.csc454.huddleup.R;

public class SingleMessageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_message);
    }
}