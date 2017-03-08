package com.shevart.fitnessnotes.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.shevart.fitnessnotes.R;
import com.shevart.fitnessnotes.ui.base.BaseActivity;
import com.shevart.fitnessnotes.ui.dashboard.MainDashboardFragment;
import com.shevart.fitnessnotes.ui.inventory.InventoriesFragment;
import com.shevart.fitnessnotes.ui.trainings.TrainingsFragment;
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
                        break;
                    case R.id.action_trainings:
                        showTrainings();
                        break;
                    case R.id.action_inventories:
                        showInventories();
                        break;
                }
                return true;
            }
        });
    }

    private void showDashboard() {
        ActivityUtils.replaceFragment(getSupportFragmentManager(), new MainDashboardFragment(),
                R.id.flMainContainer);
    }

    private void showTrainings() {
        ActivityUtils.replaceFragment(getSupportFragmentManager(), new TrainingsFragment(),
                R.id.flMainContainer);
    }

    private void showInventories() {
        ActivityUtils.replaceFragment(getSupportFragmentManager(), new InventoriesFragment(),
                R.id.flMainContainer);
    }
}
