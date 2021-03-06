package exam.backend.repositories;

import exam.backend.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Long> {
  public Optional<Candidate> findById(Long id);

  public List<Candidate> findByParty(String party);
}
