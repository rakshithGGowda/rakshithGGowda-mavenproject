Feature: Methods on JSON server
Background:
Given  user sets base URI of JSON server
<<<<<<< HEAD
	@tag15
=======
	@tag2
>>>>>>> 9c7d0c8a76df38f49e505cb5715e3e10ae251046
  Scenario: GET operation
    When user performs GET for post  number "2"
    Then author name must say "Rakshith G"
@tag17
  Scenario: Obtain collection of data from JSON server
    Then author names must be seen
<<<<<<< HEAD
@tag16
=======
@tag3
>>>>>>> 9c7d0c8a76df38f49e505cb5715e3e10ae251046
  Scenario: Path parameters
    Then path parameters must be passed

  Scenario: Query parameters
    Then query parameters must be passed

  Scenario Outline: Adding new post using POST Method
    When user performs POST for creating post
    And new "<id>","<name>" and "<author>" are passed
    Then new post has been created
    Examples:
      | id | title   | author     |
      | 4 | Transaction 800Rs | Indu |
<<<<<<< HEAD
@tag17
=======
@tag5
>>>>>>> 9c7d0c8a76df38f49e505cb5715e3e10ae251046
  Scenario Outline: Deleting a post using DELETE Method
    When user performs DELETE for deleting ost
    Then post with "<id>" must be deleted
  Examples: | id |
            | 4 |