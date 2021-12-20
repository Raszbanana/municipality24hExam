package exam.backend.services.PartyService;

import exam.backend.entities.Party;

import java.util.List;

public interface PartyService {

  public List<Party> findAllParties();

  public Party findPartyById(Long id);

  public Party findPartyByName(String name);

  public void addParty(Party party);

  public void deletePartyById(Long id);

}
