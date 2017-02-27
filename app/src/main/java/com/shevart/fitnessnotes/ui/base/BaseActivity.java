package com.shevart.fitnessnotes.ui.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @LayoutRes
    protected abstract int getLayoutResID();

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(getLayoutResID());
        ButterKnife.bind(this);
        onViewCreated();
    }

    protected void onViewCreated() {

    }

    @Override
    public final void setContentView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void setContentView(@LayoutRes int layoutResID) {
        throw new UnsupportedOperationException();
    }
}
