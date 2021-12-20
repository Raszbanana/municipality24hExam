package exam.backend.controllers;

import exam.backend.entities.Candidate;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
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
}
