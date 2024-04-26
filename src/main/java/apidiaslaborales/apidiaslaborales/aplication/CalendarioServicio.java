package apidiaslaborales.apidiaslaborales.aplication;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import apidiaslaborales.apidiaslaborales.core.Dto.CalendarioDto;
import apidiaslaborales.apidiaslaborales.core.entities.calendario;
import apidiaslaborales.apidiaslaborales.core.service.ICalendarioService;

@Service
public class CalendarioServicio implements ICalendarioService {
    private CalendarioCliente calendarioCliente;

    public CalendarioServicio(CalendarioCliente calendarioCliente) {
        this.calendarioCliente = calendarioCliente;
    }

    @Override
    public List<CalendarioDto> buscar(int año) {
        List<CalendarioDto> calendarioDtos = new ArrayList<>();
        for (int month = 1; month <= 12; month++) {
            CalendarioDto calendarioDto = calendarioCliente.buscar(año);
            if (calendarioDto != null) {
                calendarioDtos.add(calendarioDto);
            }
        }
        return calendarioDtos;
    }

    @Override
    public List<calendario> listar() {
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public calendario obtener(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

}
