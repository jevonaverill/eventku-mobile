package com.jevonaverill.rest;

import com.jevonaverill.response.DetailEventResponse;
import com.jevonaverill.response.EventResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jevon.averill on 14/10/17.
 */

public interface ApiInterface {

    @GET("Event/getAllEvent")
    Call<EventResponse> getAllEvent();

    @GET("Event/detail/{id}")
    Call<DetailEventResponse> getEventById(@Path("id") String id);


}
