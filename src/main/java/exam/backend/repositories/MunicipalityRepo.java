package exam.backend.repositories;

import exam.backend.entities.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MunicipalityRepo extends JpaRepository<Municipality, Long> {
  public Optional<Municipality> findById(Long id);

  public Optional<Municipality> findByCode(Long code);
}
