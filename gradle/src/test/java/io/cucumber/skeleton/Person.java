package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public List<String> getMessageHeard(String message) {
        List<String> result = new ArrayList<>();
        result.add(message);
        return result;
    }

    public void moveTo(Integer distance) {
    }

    public void shout(String message) {
    }
}
