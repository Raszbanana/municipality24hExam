package exam.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "candidates", schema = "municipality")
public class Candidate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  private String name;

  private String zip;

  private String party;

  private String municipality;

  private Long voteCount = 0l;

  public Candidate(String name, String zip, String party, String municipality) {
    this.name = name;
    this.zip = zip;
    this.party = party;
    this.municipality = municipality;
  }
}
