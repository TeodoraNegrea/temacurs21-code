package ro.fasttrackit.temacurs21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.temacurs21.entity.Movie;
import ro.fasttrackit.temacurs21.repository.MovieRepository;
import ro.fasttrackit.temacurs21.service.MovieService;


import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    List<Movie> getMovies() {
        return service.getAllMovies();
    }
}

