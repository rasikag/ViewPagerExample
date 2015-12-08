package com.rasikagayan.android.viewpagerexample;

import java.util.UUID;

/**
 * Created by Rasika Gayan on 12/8/2015.
 */
public class DataObjectRoot {

    private UUID mId;
    private String mName;

    public DataObjectRoot(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
}
