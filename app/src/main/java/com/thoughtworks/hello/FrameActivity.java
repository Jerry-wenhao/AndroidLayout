package com.thoughtworks.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrameActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

}
    }

