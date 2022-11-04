package no.ntnu.gr2250.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
public class Controller {

    private final String workspaceURL = System.getenv("GITPOD_WORKSPACE_URL");
    
    
    @GetMapping("/")
    String startup() {
        return "Hello this";
    }
}
