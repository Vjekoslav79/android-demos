package com.novoda.demo.movies;

import android.app.Application;

public class MoviesApplication extends Application {

    private MovieService movieService;

    @Override
    public void onCreate() {
        super.onCreate();
        Dependencies dependencies = new Dependencies(getCacheDir());
        movieService = new MovieService(dependencies.providesMovieApi());
    }

    public MovieService movieService() {
        return movieService;
    }
}
