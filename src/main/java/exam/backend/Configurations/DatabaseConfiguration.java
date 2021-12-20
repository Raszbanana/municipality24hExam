package exam.backend.Configurations;

import exam.backend.entities.Candidate;
import exam.backend.entities.Municipality;
import exam.backend.entities.Party;
import exam.backend.services.CandidateService.CandidateService;
import exam.backend.services.MunicipalityService.MunicipalityService;
import exam.backend.services.PartyService.PartyService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Component
public class DatabaseConfiguration implements CommandLineRunner {

  @Autowired
  private CandidateService candidateService;

  @Autowired
  private PartyService partyService;

  @Autowired
  private MunicipalityService municipalityService;

  @Override
  public void run(String... args) throws Exception {
    createParties();
    createMunicipalities();
    createCandidates();
  }

  private void createParties() {
    if (partyService.findAllParties().isEmpty()) {
      partyService.addParty(new Party("Liberal Alliance", "LA"));
      partyService.addParty(new Party("Enhedslisten", "Ø"));
      partyService.addParty(new Party("Radikale Venstre", "B"));
      partyService.addParty(new Party("Det Konservative Folkeparti", "C"));
      partyService.addParty(new Party("Nye Borgerlige", "D"));
      partyService.addParty(new Party("Socialistisk Folkeparti", "SF"));
      partyService.addParty(new Party("Veganerpartiet", "G"));
      partyService.addParty(
              new Party("Frie Grønne, Danmarks Nye Venstrefløjsparti", "Q")
      );
      partyService.addParty(new Party("Kristendemokraterne", "K"));
      partyService.addParty(new Party("Dansk Folkeparti", "O"));
      partyService.addParty(new Party("Venstre, Danmarks Liberale Parti", "V"));
      partyService.addParty(new Party("Alternativet", "Å"));
      partyService.addParty(new Party("Socialdemokratiet", "A"));
    }
  }

  public void createMunicipalities() {
    if (municipalityService.findAllMunicipalities().isEmpty()) {
     municipalityService.addMunicipality(new Municipality(741l, "Samsø"));
    }
  }
  private void createCandidates() {
    if (candidateService.findAllCandidates().isEmpty()) {

      Party party = partyService.findPartyByName("Socialdemokratiet");
      Municipality municipality = municipalityService.findMunicipalityById(1l);
      candidateService.addCandidate(new Candidate("Marcel Meijer",
              LocalDate.of(1996, 12, 12),
              22334455l,
              "DenVej",
              "2300",
              "enmail@gmail.com",
              2323230202l,
              party,
              "Vejen er frem",
              municipality));
    }
  }
}
