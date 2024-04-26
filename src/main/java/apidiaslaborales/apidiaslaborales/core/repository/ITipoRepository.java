package apidiaslaborales.apidiaslaborales.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apidiaslaborales.apidiaslaborales.core.entities.tipo;

@Repository
public interface ITipoRepository extends JpaRepository<tipo, Long> {

}
