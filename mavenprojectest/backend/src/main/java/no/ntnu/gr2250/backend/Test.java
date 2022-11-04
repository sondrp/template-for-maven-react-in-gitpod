package no.ntnu.gr2250.backend;

public class Test {
    

    public static void main(String[] args) {
        String workspaceUrl = System.getenv("GITPOD_WORKSPACE_URL");

        String origin = workspaceUrl.substring(0, 8) + "3000-" + workspaceUrl.substring(8);
        System.out.println(origin);

        // actual
        // https://3000-sondrp-gitpodtesting-5cobtnvpwe0.ws-eu73.gitpod.io/
    }
}
