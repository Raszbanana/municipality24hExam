package exam.backend.services.PartyService;

import exam.backend.entities.Party;
import exam.backend.repositories.PartyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyServiceImpl implements PartyService {

  @Autowired
  PartyRepo partyRepo;

  @Override
  public List<Party> findAllParties() { return partyRepo.findAll(); }

  @Override
  public Party findPartyById(Long id) {
    return partyRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);

  }

  @Override
  public Party findPartyByName(String name) {
    return partyRepo
            .findByName(name)
            .orElseThrow(
                    RuntimeException::new);
  }

  @Override
  public void addParty(Party party) { partyRepo.save(party); }

  @Override
  public void deletePartyById(Long id) { partyRepo.deleteById(id); }
}
