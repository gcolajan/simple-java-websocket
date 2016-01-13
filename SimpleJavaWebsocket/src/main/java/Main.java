package main.java;

import javax.websocket.DeploymentException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, DeploymentException {

        WebSocketServer server = new WebSocketServer("localhost", 8085, "/websocket");
        server.start();

        System.out.println("Press any key to quit.");
        System.in.read();

        server.stop();
    }
}
