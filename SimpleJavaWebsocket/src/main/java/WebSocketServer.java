package main.java;

import org.glassfish.tyrus.server.Server;

import javax.websocket.DeploymentException;

public class WebSocketServer {

    private Server server;

    public WebSocketServer(String host, int port, String path) {
        server = new Server(host, port, path, MyEndPoint.class);
    }

    public void start() throws DeploymentException {
        server.start();
    }

    public void stop() {
        server.stop();
    }
}