package exam.backend.controllers.CandidateController;

import exam.backend.entities.Candidate;
import exam.backend.services.CandidateService.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController implements CandidateControllerInterface {

  @Autowired
  CandidateServiceImpl candidateService;

  @Override
  public List<Candidate> findAllCandidates() {
    return candidateService.findAllCandidates();
  }

  @Override
  public List<Candidate> findAllCandidatesByParty(String party) {
    return candidateService.findAllCandidatesByParty(party);
  }


  @Override
  public void updateCandidateById(Candidate candidate, Long id) {
    candidateService.updateCandidateById(candidate, id);
  }

  @Override
  public void addCandidate(Candidate candidate) {
      candidateService.addCandidate(candidate);
  }

  @Override
  public void deleteCandidateById(Long id) {
    candidateService.deleteCandidateById(id);
  }


}
