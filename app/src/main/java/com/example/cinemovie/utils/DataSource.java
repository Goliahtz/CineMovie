package com.example.cinemovie.utils;

import com.example.cinemovie.R;
import com.example.cinemovie.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Movie> getPopularMovies() {
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Moana", R.drawable.moana, R.drawable.moanacover));
        lstMovies.add(new Movie("Black P", R.drawable.blackp, R.drawable.moanacover));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian));
        lstMovies.add(new Movie("Moana", R.drawable.moana));
        lstMovies.add(new Movie("Black P", R.drawable.blackp));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian));
        return lstMovies;
    }

    public static List<Movie> getWeekMovies() {
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Moana", R.drawable.moana, R.drawable.moanacover));
        lstMovies.add(new Movie("Moana", R.drawable.moana, R.drawable.moanacover));
        lstMovies.add(new Movie("Black P", R.drawable.blackp, R.drawable.moanacover));
        lstMovies.add(new Movie("Black P", R.drawable.blackp, R.drawable.moanacover));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian));

        return lstMovies;
    }
}
