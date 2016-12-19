package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.dev.kunal.jokeactivityprovider.JokeActivity;
import com.example.kunal.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by Kunal on 12/20/2016.
 */

public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {

    private static MyApi myApiService = null;
    private Context context;

    public EndpointsAsyncTask( Context con){
        context = con;
    }

    @Override
    protected String doInBackground(Void... voids) {
        if(myApiService == null){
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://aerial-electron-153123.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        try{
            return myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            return  e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String s) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_KEY, s);
        context.startActivity(intent);
    }
}
