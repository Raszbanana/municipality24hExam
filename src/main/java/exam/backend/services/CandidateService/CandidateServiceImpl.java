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
  public Candidate findCandidateById(Long id) {
    return candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);
  }

  @Override
  public void updateCandidateById(Candidate candidate, Long id) {
    Candidate candidateToUpdate = candidateRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);

    candidateToUpdate.setName(candidate.getName());
    candidateToUpdate.setBirthDate(candidate.getBirthDate());
    candidateToUpdate.setPhoneNumber(candidate.getPhoneNumber());
    candidateToUpdate.setAddress(candidate.getAddress());
    candidateToUpdate.setZip(candidate.getZip());
    candidateToUpdate.setEmail(candidate.getEmail());
    candidateToUpdate.setCpr(candidate.getCpr());

    candidateRepo.save(candidateToUpdate);

  }


  @Override
  public void addCandidate(Candidate candidate) { candidateRepo.save(candidate); }

  @Override
  public void deleteCandidateById(Long id) { candidateRepo.deleteById(id); }
}
