package main.java;

import javax.websocket.Session;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SessionHandler {

    private static final List<Session> list = Collections.synchronizedList(new ArrayList<Session>());

    public void addSession(Session session) {
        list.add(session);
    }

    public void removeSession(Session session) {
        list.remove(session);
    }

    public void broadcast(String message) {
        for (Session session : list)
            try {
                session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
