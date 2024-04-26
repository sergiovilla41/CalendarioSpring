package apidiaslaborales.apidiaslaborales.presentation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import apidiaslaborales.apidiaslaborales.core.Dto.CalendarioDto;

import apidiaslaborales.apidiaslaborales.core.service.ICalendarioService;

@RestController
@RequestMapping("/api/calendario")
public class CalendarioController {
    private ICalendarioService service;

    public CalendarioController(ICalendarioService service) {
        this.service = service;
    }

    @RequestMapping(value = "/listar/{año}", method = RequestMethod.GET)
    public List<CalendarioDto> buscar(@PathVariable int año) {
        return service.buscar(año);
    }
}
