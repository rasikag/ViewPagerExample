package com.rasikagayan.android.viewpagerexample;

import android.app.ListFragment;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rasika Gayan on 12/8/2015.
 */
public class DataLab {

    private static DataLab sDataLab;

    private ArrayList<DataObjectRoot> mDataObjects;

    private DataLab(Context context) {

        mDataObjects = new ArrayList<DataObjectRoot>();
        for (int i = 0; i < 100; i++) {
            DataObjectRoot root = new DataObjectRoot();
            root.setName("Data Object : " + i);
            mDataObjects.add(root);
        }
    }

    public static DataLab getsDataLab(Context context){
        if(sDataLab == null){
            sDataLab = new DataLab(context);
        }
        return sDataLab;
    }

    public List<DataObjectRoot> getRootObjects(){
        return mDataObjects;
    }

    public DataObjectRoot getDataObject(UUID id) {
        for (DataObjectRoot obj : mDataObjects) {
            if (obj.getId().equals(id)) {
                return obj;
            }
        }
        return null;
    }
}
