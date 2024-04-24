package apidiaslaborales.apidiaslaborales.core.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apidiaslaborales.apidiaslaborales.core.entities.Calendario;

@Repository
public interface ICalendarioRepository extends JpaRepository<Calendario, Long> {

}
