package exam.backend.services.MunicipalityService;

import exam.backend.entities.Municipality;
import exam.backend.repositories.MunicipalityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipalityServiceImpl implements MunicipalityService {

  @Autowired
  MunicipalityRepo municipalityRepo;

  @Override
  public List<Municipality> findAllMunicipalities() {
    return municipalityRepo.findAll();
  }

  @Override
  public Municipality findMunicipalityById(Long id) {
    return municipalityRepo
            .findById(id)
            .orElseThrow(
                    RuntimeException::new);
  }

  @Override
  public void addMunicipality(Municipality municipality) { municipalityRepo.save(municipality); }

  @Override
  public void deleteMunicipalityById(Long id) { municipalityRepo.deleteById(id); }
}
