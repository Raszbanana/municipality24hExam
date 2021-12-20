package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;
import exam.backend.entities.Party;

import java.util.List;

public interface CandidateService {

  public List<Candidate> findAllCandidates();

  public Candidate findCandidateById(Long id);

  public void updateCandidateById(Long id);

  public void updateCandidatePartyById(Long id, Party party);

  public void updateCandidateSloganById(Long id, String string);

  public void addCandidate(Candidate candidate);

  public void deleteCandidateById(Long id);

}
