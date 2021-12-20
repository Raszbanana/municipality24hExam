package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;
import exam.backend.entities.Party;
import exam.backend.repositories.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

  @Autowired
  private CandidateRepo candidateRepo;

  @Override
  public List<Candidate> findAllCandidates() { return candidateRepo.findAll(); }

  @Override
  public Candidate findCandidateById(Long id) {
    return candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);
  }

  @Override
  public void updateCandidateById(Long id) {

  }

  @Override
  public void updateCandidatePartyById(Long id, Party party) {
    Candidate candidate = candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);

    candidate.setParty(party);
    candidateRepo.save(candidate);
  }

  @Override
  public void updateCandidateSloganById(Long id, String string) {
    Candidate candidateToUpdate = candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);

    candidateToUpdate.setSlogan(string);
    candidateRepo.save(candidateToUpdate);

  }

  @Override
  public void addCandidate(Candidate candidate) { candidateRepo.save(candidate); }

  @Override
  public void deleteCandidateById(Long id) { candidateRepo.deleteById(id); }
}
