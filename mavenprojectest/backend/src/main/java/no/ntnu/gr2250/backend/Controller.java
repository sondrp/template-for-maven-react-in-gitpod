package no.ntnu.gr2250.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    String startup() {
        return "Hello this";
    }
}
