package org.kisio.labs.navitiasdk.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class DataFetcher<T> {
    final Class<T> typeParameterClass;
    private String token;

    public DataFetcher(Class<T> typeParameterClass, String token) {
        this.typeParameterClass = typeParameterClass;
        this.token = token;
    }

    public T fetch(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", token)
                .build();

        Response response = client.newCall(request).execute();
        String jsonResponse = response.body().string();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        return gson.fromJson(jsonResponse, typeParameterClass);
    }
}
