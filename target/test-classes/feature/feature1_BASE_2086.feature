Feature: Methods on JSON server
Background:
Given  user sets base URI of JSON server
	@tag1
  Scenario: GET operation
    When user performs GET for post  number "2"
    Then author name must say "Rakshith G"

  Scenario: Obtain collection of data from JSON server
    Then author names must be seen
@tag2
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
@tag3
  Scenario Outline: Deleting a post using DELETE Method
    When user performs DELETE for deleting ost
    Then post with "<id>" must be deleted
  Examples: | id |
            | 4 |