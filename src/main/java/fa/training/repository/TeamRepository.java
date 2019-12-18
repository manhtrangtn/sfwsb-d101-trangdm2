package fa.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.training.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
