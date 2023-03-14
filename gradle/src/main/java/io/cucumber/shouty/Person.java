package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final Network network;
    private final List<String> messagesHeard = new ArrayList<>();


    public Person(Network network) {
        this.network = network;
        network.subscribe(this);

    }

    public void shout(String message) {
        network.broadcast(message);
    }

    public void hear(String message) {
        messagesHeard.add(message);
    }

    public List<String> getMessagesHeard() {
        return messagesHeard;
    }

}