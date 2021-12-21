package exam.backend.services.CandidateService;

import exam.backend.entities.Candidate;
import exam.backend.repositories.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
  public Long getVoteCountByCandidateId(Long id) {
    return candidateRepo.findById(id).get().getVoteCount();
  }

  @Override
  public Long getVoteCountByParty(String party) {
    int numberOfCandidates = candidateRepo.findAll().size();
    ArrayList<Long> votes = new ArrayList<>();

    for (long i = 1; i < numberOfCandidates + 1; i++) {
      Optional<Candidate> candidate = candidateRepo.findById(i);

      if (candidate.get().getParty().equals(party)) {
        votes.add(candidate.get().getVoteCount());
      }
    }
    long sum = 0;

    for (long i = 0; i < votes.size(); i++) {
      sum += (votes.get((int) i));

    }

    return sum;
  }

  @Override
  public void updateCandidateById(Candidate candidate, Long id) {
    Candidate candidateToUpdate = candidateRepo
            .findById(id)
            .orElseThrow(
                    NullPointerException::new);

    candidateToUpdate.setMunicipality(candidateToUpdate.getMunicipality());
    candidateToUpdate.setName(candidate.getName());
    candidateToUpdate.setParty(candidate.getParty());
    candidateToUpdate.setZip(candidate.getZip());

    candidateRepo.save(candidateToUpdate);

  }

  @Override
  public void addCandidate(Candidate candidate) { candidateRepo.save(candidate); }

  @Override
  public void deleteCandidateById(Long id) { candidateRepo.deleteById(id); }
}
