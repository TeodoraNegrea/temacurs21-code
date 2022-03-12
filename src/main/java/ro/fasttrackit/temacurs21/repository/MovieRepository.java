package ro.fasttrackit.temacurs21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.temacurs21.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
