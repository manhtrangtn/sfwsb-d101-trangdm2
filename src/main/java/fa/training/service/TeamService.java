package fa.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.training.model.Team;
import fa.training.repository.TeamRepository;
@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;
  
  public Team register(Team team) {
    return teamRepository.save(team);
  }
  public List<Team> getTeams(){
    return teamRepository.findAll();
  }
}
