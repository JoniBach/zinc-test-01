package com.movie.phase1.Repository;

import com.movie.phase1.module.Movie;

public interface moviejdbc {
    Iterable<Movie> findAll();
    Movie findByid(int id);

   // Iterable<Actor> findCast(int movie_id);

}
