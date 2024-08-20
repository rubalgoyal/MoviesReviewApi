package com.example.moviesAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired  //Automatically initialize the repository instance
    private MovieRepository movieRepository; //To interact with MongoDB database
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

//    public Optional<Movie> singleMovie(ObjectId id){  //Optional is used if there is any null value exist
//        return movieRepository.findById(id);
//    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
