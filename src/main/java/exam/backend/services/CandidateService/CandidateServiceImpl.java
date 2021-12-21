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
    return candidateRepo.findByParty(party);
  }

  @Override
  public Long getVoteCountByParty(String party) {
    List<Candidate> numberOfCandidates = candidateRepo.findAll();
    ArrayList<Long> votes = new ArrayList<>();

    for (Candidate candidate : numberOfCandidates) {
      Long votecount = candidate.getVoteCount();
      String candidateParty = candidate.getParty();

      if (candidateParty.equals(party)) {
        votes.add(votecount);
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
