package apidiaslaborales.apidiaslaborales.aplication;

import java.util.List;

import org.springframework.stereotype.Service;

import apidiaslaborales.apidiaslaborales.core.entities.tipo;
import apidiaslaborales.apidiaslaborales.core.repository.ITipoRepository;
import apidiaslaborales.apidiaslaborales.core.service.ITipoService;

@Service
public class TipoServicio implements ITipoService {

    private ITipoRepository repository;

    public TipoServicio(ITipoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<tipo> listar() {
        return repository.findAll();
    }

    @Override
    public tipo obtener(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<tipo> buscar(String tipo) {

        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

}
