package ro.fasttrackit.temacurs21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.temacurs21.entity.Movie;
import ro.fasttrackit.temacurs21.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository){
        this.repository =repository;
    }

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
