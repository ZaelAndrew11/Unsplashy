package com.adacherSoft.unsplashy.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adacherSoft.unsplashy.R;
import com.adacherSoft.unsplashy.adapter.UnsplashyAdapter;
import com.adacherSoft.unsplashy.background.GetDataSplash;
import com.adacherSoft.unsplashy.models.Unsplash;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnsplashFragment extends Fragment  {

    private UnsplashyAdapter adapter;

    public UnsplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_unsplash, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new UnsplashyAdapter();
        recyclerView.setAdapter(adapter);

        new BackgroundPhotos().execute();
    }

    private class BackgroundPhotos extends GetDataSplash {
        @Override
        protected void onPostExecute(List<Unsplash> unsplashes) {
            super.onPostExecute(unsplashes);
            adapter.update(unsplashes);
        }
    }
}
