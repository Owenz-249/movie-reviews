package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.repository.MovieRepo;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepo movieRepo;

    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepo.findMovieByImdbId(imdbId);
    }

    public Optional<Movie> movie(ObjectId id) {
        return movieRepo.findById(id);
    }

}
