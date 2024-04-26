package apidiaslaborales.apidiaslaborales.core.service;

import java.util.List;

import apidiaslaborales.apidiaslaborales.core.Dto.CalendarioDto;
import apidiaslaborales.apidiaslaborales.core.entities.calendario;

public interface ICalendarioService {
    public List<CalendarioDto> buscar(int año);

    public List<calendario> listar();

    public calendario obtener(Long id);

}
