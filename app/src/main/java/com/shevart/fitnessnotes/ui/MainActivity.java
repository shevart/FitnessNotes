package com.shevart.fitnessnotes.ui;

import android.os.Bundle;

import com.shevart.fitnessnotes.R;
import com.shevart.fitnessnotes.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
