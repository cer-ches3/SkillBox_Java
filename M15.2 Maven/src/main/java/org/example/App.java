package org.example;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        Request request = new Request.Builder().url("https://ya.ru").build();
        Call call = new OkHttpClient().newCall(request);
        Response response = call.execute();

        System.out.println(response.body().string());

    }
}
