package com.objectbright.daggerretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Restapi {

    @GET("/posts")
    Call<List<Post>> getPosts();
}
