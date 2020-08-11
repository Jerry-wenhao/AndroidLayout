package com.thoughtworks.hello;

import android.app.Activity;
import android.os.Bundle;

public class FrameActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }
}

