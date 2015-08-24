package com.shiyq.android.criminalintent;

import android.content.Context;

import java.net.ContentHandler;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by flysy on 2015/8/24.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;

    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for(int i = 0;i<100;i++){
            Crime c = new Crime();
            c.setmTitle("Crime #" + i);
            c.setmSolved(i%2==0);
            mCrimes.add(c);
        }
    }
    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c: mCrimes){
            if(c.getMId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
