package com.rasikagayan.android.viewpagerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rasika Gayan on 12/8/2015.
 */
public class DataListFragment extends Fragment {

    private RecyclerView mDataObjectRecyclerView;
    private DataObjectAdapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_object_list, container, false);

        mDataObjectRecyclerView = (RecyclerView) view.findViewById(R.id.data_recycler_view);
        mDataObjectRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;

    }

    private void updateUI() {

        DataLab dataLab = DataLab.getsDataLab(getActivity());
        List<DataObjectRoot> list = dataLab.getRootObjects();

        if(mAdapter == null){
            mAdapter = new DataObjectAdapter(list);
            mDataObjectRecyclerView.setAdapter(mAdapter);
        }else {
            mAdapter.notifyDataSetChanged();
        }


    }


    private class DataObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mDataObjedctId;
        private TextView mDataObjectName;

        private DataObjectRoot objectRoot;

        @Override
        public void onClick(View v) {

        }

        public DataObjectHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mDataObjectName = (TextView) itemView.findViewById(R.id.data_object_name);
            mDataObjedctId = (TextView) itemView.findViewById(R.id.data_object_id);
        }

        public void bindDataObjectRoot(DataObjectRoot root) {

            objectRoot = root;
            mDataObjectName.setText(objectRoot.getName());
            mDataObjedctId.setText(objectRoot.getId().toString());

        }

    }

    private class DataObjectAdapter extends RecyclerView.Adapter<DataObjectHolder> {

        private List<DataObjectRoot> mRoots;

        public DataObjectAdapter(List<DataObjectRoot> roots) {
            this.mRoots = roots;
        }

        @Override
        public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater.inflate(R.layout.list_item_data_object, parent, false);
            return new DataObjectHolder(view);

        }

        @Override
        public void onBindViewHolder(DataObjectHolder holder, int position) {
            DataObjectRoot root = mRoots.get(position);
            holder.bindDataObjectRoot(root);
        }

        @Override
        public int getItemCount() {
            return mRoots.size();
        }
    }


}
