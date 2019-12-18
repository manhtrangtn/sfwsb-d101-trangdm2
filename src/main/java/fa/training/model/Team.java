package fa.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private int id;
  @Column(name = "Team_Name", columnDefinition = "VARCHAR(200)", nullable = false)
  private String teamName;
  @Column(name = "Coach_Name", columnDefinition = "VARCHAR(200)")
  private String coach;
  @Column(name = "National_Name", columnDefinition = "VARCHAR(200)")
  private String national;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getCoach() {
    return coach;
  }

  public void setCoach(String coach) {
    this.coach = coach;
  }

  public String getNational() {
    return national;
  }

  public void setNational(String national) {
    this.national = national;
  }

  public Team() {
    super();
  }

  public Team(String teamName, String coach, String national) {
    super();
    this.teamName = teamName;
    this.coach = coach;
    this.national = national;
  }

  @Override
  public String toString() {
    return "Team [id=" + id + ", teamName=" + teamName + ", coach=" + coach
        + ", national=" + national + "]";
  }

}
