package presentation;

import org.springframework.web.bind.annotation.RestController;

import apidiaslaborales.apidiaslaborales.core.interfaces.service.ITipoService;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import apidiaslaborales.apidiaslaborales.core.entities.Tipo;

@RestController

public class TipoController {

    private ITipoService service;

    public TipoController(ITipoService service) {
        this.service = service;
    }

    @GetMapping(value = "/listar")
    public List<Tipo> listar() {
        return service.listar();
    }
}
