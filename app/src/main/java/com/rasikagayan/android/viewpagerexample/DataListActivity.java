package com.rasikagayan.android.viewpagerexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class DataListActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//        Toolbar myToolbar = (Toolbar) findViewById(R.id.action_bar_default);
//        setSupportActionBar(myToolbar);
//
//
//    }


    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.action_bar_default);
        //setSupportActionBar(myToolbar);
    //}

    @Override
    protected Fragment createFragment() {
        return new DataListFragment();
    }
}
