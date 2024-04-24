package apidiaslaborales.apidiaslaborales.core.interfaces.service;

import java.util.List;

import org.springframework.stereotype.Service;

import apidiaslaborales.apidiaslaborales.core.entities.Tipo;

@Service
public interface ITipoService {

    public List<Tipo> listar();

    public Tipo obtener(Long id);

    public List<Tipo> buscar(String tipo);

}
