package com.rasikagayan.android.viewpagerexample;

import android.app.Fragment;

public class DataListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new DataListFragment();
    }
}
