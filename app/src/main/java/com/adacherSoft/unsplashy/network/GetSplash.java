package com.adacherSoft.unsplashy.network;

import com.adacherSoft.unsplashy.models.Unsplash;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetSplash{
    @GET("random")
    Call<Unsplash[]> groupPhotos(@Query("count") int count);
}
