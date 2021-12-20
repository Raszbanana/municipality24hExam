package exam.backend.Configurations;

import exam.backend.entities.Candidate;
import exam.backend.services.CandidateService.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfiguration implements CommandLineRunner {

  @Autowired
  private CandidateService candidateService;

  @Override
  public void run(String... args) throws Exception {
    createCandidates();
  }

  private void createCandidates() {
    if (candidateService.findAllCandidates().isEmpty()) {
      candidateService.addCandidate(new Candidate("Marcel Meijer", "8305", "Socialdemokratiet", "Samsø" ));
      candidateService.addCandidate(new Candidate("Michael Kristensen", "8305", "Socialdemokratiet", "Samsø" ));
      candidateService.addCandidate(new Candidate("Helle Hansen", "8305", "Socialdemokratiet", "Samsø" ));
      candidateService.addCandidate(new Candidate("Per Urban Olsen", "8305", "Det konservative Folkeparti", "Samsø" ));
      candidateService.addCandidate(new Candidate("Peter Askjær", "8305", "Det konservative Folkeparti", "Samsø" ));
      candidateService.addCandidate(new Candidate("Martin Sørensen", "8305", "Det konservative Folkeparti", "Samsø" ));
      candidateService.addCandidate(new Candidate("Søren Wiese", "8305", "Venstre", "Samsø" ));
      candidateService.addCandidate(new Candidate("Anita Elgaard Højholt Olesen", "8305", "Venstre", "Samsø" ));

    }
  }
}
