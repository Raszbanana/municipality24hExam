package exam.backend.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

  private LocalDate birthDate;

  private Long phoneNumber;

  private String address;

  private String zip;

  @Column(unique = true)
  private String email;

  @Column(unique = true)
  private Long cpr;

  @ManyToOne
  private Party party;

  private String slogan;

  @ManyToOne
  private Municipality municipality;

  public Candidate(String name, LocalDate birthDate, Long phoneNumber, String address, String zip, String email, Long cpr, Party party, String slogan, Municipality municipality) {
    this.name = name;
    this.birthDate = birthDate;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.zip = zip;
    this.email = email;
    this.cpr = cpr;
    this.party = party;
    this.slogan = slogan;
    this.municipality = municipality;
  }
}
