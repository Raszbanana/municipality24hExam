package exam.backend.Configurations;

import exam.backend.entities.Candidate;
import exam.backend.entities.Party;
import exam.backend.services.CandidateService.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatabaseConfiguration implements CommandLineRunner {

  @Autowired
  private CandidateService candidateService;

  @Override
  public void run(String... args) throws Exception {

  }

//  private void createCandidates() {
//    if (candidateService.findAllCandidates().isEmpty()) {
//
//      Party party;
//      candidateService.addCandidate(new Candidate("Marcel Meijer",
//              LocalDate.of(1996, 12, 12),
//              22334455l,
//              "DenVej",
//              "2300",
//              "enmail@gmail.com",
//              2323230202l,
//              "Socialdemokratiet",
//              "Vejen er frem",
//              ));
//    }
//  }
}
