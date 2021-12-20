package exam.backend.services.MunicipalityService;

import exam.backend.entities.Municipality;

import java.util.List;

public interface MunicipalityService {

  public List<Municipality> findAllMunicipalities();

  public Municipality findMunicipalityById(Long id);

  public void addMunicipality(Municipality municipality);

  public void deleteMunicipalityById(Long id);

}

