package czskola.swiapp1.repositories;

import czskola.swiapp1.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

    List<Location> findByCity(String city);

    Optional<Location> findByAddress(String address);

    boolean existsByAddress(String address);
}
