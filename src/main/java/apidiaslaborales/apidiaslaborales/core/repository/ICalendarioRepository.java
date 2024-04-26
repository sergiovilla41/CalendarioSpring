package apidiaslaborales.apidiaslaborales.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apidiaslaborales.apidiaslaborales.core.entities.calendario;

@Repository
public interface ICalendarioRepository extends JpaRepository<calendario, Long> {

}
