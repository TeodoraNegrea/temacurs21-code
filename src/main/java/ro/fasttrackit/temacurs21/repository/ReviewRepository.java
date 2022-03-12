package ro.fasttrackit.temacurs21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.temacurs21.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
