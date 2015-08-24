package com.shiyq.android.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

/**
 * Created by flysy on 2015/8/24.
 */
public class CrimeListFragment extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
    }
}
