Feature: Shout
  Some Shouty description here

  To do:
  - only shout to people within a certain distance

  Background:
    Given a person named Lucy
    And a person named Sean

  Rule: Shouts can be heard by other users

    Scenario: Listener hears a message
      When Sean shouts "free bagels at Sean's"
      Then Lucy heard Sean's message

    Scenario: Listener hears a different message
      When Sean shouts "free coffee!"
      Then Lucy heard Sean's message

  Rule: Shouts should only be heard if listener is within range

    Scenario: Listener is within range


    Scenario: Listener is out of range