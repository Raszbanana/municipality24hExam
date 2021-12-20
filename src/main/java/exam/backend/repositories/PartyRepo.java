package exam.backend.repositories;

import exam.backend.entities.Party;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface PartyRepo extends JpaRepository<Party, Long> {
public Optional<Party> findById(Long id);

public Optional<Party> findByName(String name);
        }
