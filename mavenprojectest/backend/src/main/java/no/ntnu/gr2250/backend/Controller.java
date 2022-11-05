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
        return "This text confirms that the backend server is running";
    }

    @GetMapping("/things")
    String things() {
        return "This text was returned from a get request";
    }
}
