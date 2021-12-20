package exam.backend.controllers;

import exam.backend.entities.Candidate;
import exam.backend.services.CandidateService.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController implements CandidateControllerInterface {

  @Autowired
  CandidateServiceImpl candidateService;

  @Override
  public List<Candidate> findAllCandidates() {
    return candidateService.findAllCandidates();
  }
}
