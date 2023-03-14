package io.cucumber.shouty;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private Person lucy;
    private Person sean;
    private Network network;
    private HashMap<String, Person> people;
    private String messageFromSean;

    @Before
    public void createNetwork() {
        network = new Network();
        people = new HashMap<>();
    }


    @Given("a person named {word}")
    public void aPersonNamed(String name) {
        people.put(name, new Person(network));
    }

    @When("Sean shouts {string}")
    public void sean_shouts(String message) throws Throwable {
        people.get("Sean").shout(message);
        messageFromSean = message;
    }


    @Then("Lucy heard Sean's message")
    public void lucyHeardSeanSMessage() throws Throwable {
        people.get("Lucy").hear(messageFromSean);
        assertEquals(asList(messageFromSean), people.get("Lucy").getMessagesHeard());
    }
}
