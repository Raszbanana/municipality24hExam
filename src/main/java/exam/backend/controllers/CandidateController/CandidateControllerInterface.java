package exam.backend.controllers.CandidateController;

import exam.backend.entities.Candidate;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/candidates")
public interface CandidateControllerInterface {

  @ApiOperation(
          value = " - Returns all of the Candidates",
          notes = "Execute to retrieve all <b>Candidates</b>."
  )
@GetMapping
public List<Candidate> findAllCandidates();

  @GetMapping("{party}")
  public List<Candidate> findAllCandidatesByParty(@PathVariable String party);

  @ApiOperation(
          value = " - Updates a candidate by the his id",
          notes = "Execute to update a <b>Candidate</b>."
  )
  @PutMapping("/{id}")
  public void updateCandidateByPartyId(@RequestBody Candidate candidate, @PathVariable Long id);

  @PostMapping
  public void addCandidate(@RequestBody Candidate candidate);

  @DeleteMapping
  public void deleteCandidateById(Long id);
}
