package com.movie.phase1.Repository;

import com.movie.phase1.module.Review;

public interface reviewJdbc {
    Iterable<Review> findAll();
    Iterable<Review>  findBymovie(int movie_id);
    Iterable<Review>  findByuser(int user_id);

}
