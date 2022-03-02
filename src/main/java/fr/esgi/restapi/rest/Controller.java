package fr.esgi.restapi.rest;

import fr.esgi.restapi.service.FindStudent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final FindStudent service;

    public Controller(FindStudent service){
        this.service = service;
    }

    @GetMapping("/foo/{firstname}")
    public String foo(@PathVariable("firstname") String firstname){
        return service.findByFirstName(firstname).toString();
    }
}
