package apidiaslaborales.apidiaslaborales.core.service;

import java.util.List;

import apidiaslaborales.apidiaslaborales.core.entities.tipo;

public interface ITipoService {

    public List<tipo> listar();

    public tipo obtener(Long id);

    public List<tipo> buscar(String tipo);

}
