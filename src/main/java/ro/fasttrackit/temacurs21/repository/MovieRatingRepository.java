package ro.fasttrackit.temacurs21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.temacurs21.entity.MovieRating;

public interface MovieRatingRepository extends JpaRepository<MovieRating,Integer> {
}
