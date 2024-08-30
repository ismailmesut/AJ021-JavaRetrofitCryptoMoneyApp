package com.ismailmesutmujde.javaretrofitcryptomoneyapp.service;

import com.ismailmesutmujde.javaretrofitcryptomoneyapp.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    // GET, POST, UPDATE, DELETE

    // URL BASE -> www.website.com
    // GET -> price?key=xxx

    // base : https://api.nomics.com/v1/
    // key  : prices?key=2187154b76945f2373394aa34f7dc98a

    // base : https://raw.githubusercontent.com/
    // key  : atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();

}
