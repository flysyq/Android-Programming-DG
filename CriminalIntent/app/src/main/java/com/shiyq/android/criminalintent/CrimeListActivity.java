package com.shiyq.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shiyq on 15-8-30.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
