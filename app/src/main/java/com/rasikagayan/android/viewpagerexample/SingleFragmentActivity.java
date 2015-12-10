package com.rasikagayan.android.viewpagerexample;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Rasika Gayan on 12/8/2015.
 */

// in here we can host any kind of fragment
// base component
public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // this layout will hold any kind of fragment
        // base layout
        setContentView(R.layout.activity_fragment);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.action_bar_default);
        //setSupportActionBar(myToolbar);
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }


    }
}
