package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;
import exam.backend.entities.Party;

import java.util.List;
import java.util.Optional;

public interface CandidateService {

  public List<Candidate> findAllCandidates();

  public Candidate findCandidateById(Long id);

  public void updateCandidateById(Candidate candidate, Long id);

  public void addCandidate(Candidate candidate);

  public void deleteCandidateById(Long id);

}
