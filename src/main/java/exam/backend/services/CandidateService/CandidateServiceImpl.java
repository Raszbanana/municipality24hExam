package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;
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
  public List<Candidate> findAllCandidatesByParty(String party) {
    List<Candidate> foundCandidates = candidateRepo.findByParty(party);
    return foundCandidates;
  }


  @Override
  public void updateCandidateById(Candidate candidate, Long id) {
    Candidate candidateToUpdate = candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);

    candidateToUpdate.setName(candidate.getName());
    candidateToUpdate.setZip(candidate.getZip());

    candidateRepo.save(candidateToUpdate);

  }


  @Override
  public void addCandidate(Candidate candidate) { candidateRepo.save(candidate); }

  @Override
  public void deleteCandidateById(Long id) { candidateRepo.deleteById(id); }
}
