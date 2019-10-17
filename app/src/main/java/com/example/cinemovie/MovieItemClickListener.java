package com.example.cinemovie;

import android.widget.ImageView;

import com.example.cinemovie.models.Movie;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView);
}
