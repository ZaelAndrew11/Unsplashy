package com.adacherSoft.unsplashy.background;

import android.os.AsyncTask;

import com.adacherSoft.unsplashy.models.Unsplash;
import com.adacherSoft.unsplashy.network.GetSplash;
import com.adacherSoft.unsplashy.network.UnsplashInterceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class GetDataSplash extends AsyncTask<Object, Object, List<Unsplash>> {
    private final GetSplash request = new UnsplashInterceptor().get();

    @Override
    protected List<Unsplash> doInBackground(Object... params) {
        Call<Unsplash[]> call = request.groupPhotos(10);
        try {
            Response<Unsplash[]> response = call.execute();
            if(response.code() == 200 && response.isSuccessful()){
                Unsplash[] arrayOfModel = response.body();
                List<Unsplash> listSplash = new ArrayList<>();
                for (Unsplash item : arrayOfModel){
                    listSplash.add(item);
                }
                return listSplash;
            }else {
                return null;
            }
        } catch (IOException e) {
        }
        return null;
    }


}



