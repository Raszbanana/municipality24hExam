package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;

import java.util.List;

public interface CandidateService {

  public List<Candidate> findAllCandidates();

  public List<Candidate> findAllCandidatesByParty(String party);

  public Long getVoteCountByCandidateId(Long id);

  public Long getVoteCountByParty(String party);

  public void updateCandidateById(Candidate candidate, Long id);

  public void addCandidate(Candidate candidate);

  public void deleteCandidateById(Long id);

}
