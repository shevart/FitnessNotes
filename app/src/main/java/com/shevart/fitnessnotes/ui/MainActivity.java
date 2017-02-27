package com.shevart.fitnessnotes.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.shevart.fitnessnotes.R;
import com.shevart.fitnessnotes.ui.base.BaseActivity;
import com.shevart.fitnessnotes.ui.dashboard.MainDashboardFragment;
import com.shevart.fitnessnotes.utils.ActivityUtils;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.bnvMain)
    BottomNavigationView bnvMain;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewCreated() {
        bnvMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_main_dash:
                        showDashboard();
                }
                return true;
            }
        });
    }

    private void showDashboard() {
        ActivityUtils.addFragment(getSupportFragmentManager(),
                new MainDashboardFragment(),
                R.id.flMainContainer);
    }
}
