package fa.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fa.training.model.Team;
import fa.training.service.TeamService;

@RestController
@RequestMapping("api")
public class MainController {

  @Autowired
  private TeamService teamService;
  
  @PostMapping("register")
  public ResponseEntity<Team> register(@RequestBody Team team) {
    Team t  = teamService.register(team);
    return new ResponseEntity<Team>(t, HttpStatus.OK) ;  
  }
  
  @GetMapping("get-team")
  public ResponseEntity<List<Team>> getTeam(){
    List<Team> teams = teamService.getTeams();
    return new ResponseEntity<List<Team>>(teams, HttpStatus.OK);
  }
}
