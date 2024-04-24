package presentation;

import org.springframework.web.bind.annotation.RestController;

import apidiaslaborales.apidiaslaborales.core.interfaces.service.ITipoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import apidiaslaborales.apidiaslaborales.core.entities.Tipo;

@RestController
@RequestMapping("/api/tipo")
public class TipoController {

    private ITipoService service;

    public TipoController(ITipoService service) {
        this.service = service;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Tipo> listar() {
        return service.listar();
    }
}
