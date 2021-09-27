package repository;

import domain.movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<movie,Integer> {
}
