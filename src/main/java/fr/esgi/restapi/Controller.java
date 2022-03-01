package fr.esgi.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final MyService service;

    public Controller(MyService service){
        this.service = service;
    }

    @GetMapping("/foo")
    public String foo(){
        return service.getResponse();
    }
}
