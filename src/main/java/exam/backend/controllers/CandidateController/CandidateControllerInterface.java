package exam.backend.controllers.CandidateController;

import exam.backend.entities.Candidate;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @ApiOperation(
          value = " - Updates a candidate by the party id",
          notes = "Execute to update a <b>Candidate</b>."
  )
  @PutMapping("/{id}")
  public void updateCandidateByPartyId(@RequestBody Candidate candidate, @PathVariable Long id);
}
