package ro.fasttrackit.temacurs21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.temacurs21.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
