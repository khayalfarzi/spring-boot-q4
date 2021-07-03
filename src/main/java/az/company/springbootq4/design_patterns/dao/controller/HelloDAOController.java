package az.company.springbootq4.design_patterns.dao.controller;

import az.company.springbootq4.design_patterns.dao.model.Person;
import az.company.springbootq4.design_patterns.dao.service.HelloDAOService;
import az.company.springbootq4.design_patterns.dto.PersonDTO;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class HelloDAOController {

    private final HelloDAOService service;

    public HelloDAOController(HelloDAOService service) {
        this.service = service;
    }

    public List<PersonDTO> get() {
        return service.get();
    }
}