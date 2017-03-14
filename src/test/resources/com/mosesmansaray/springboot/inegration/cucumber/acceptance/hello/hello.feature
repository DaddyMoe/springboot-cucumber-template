Feature: the message can be retrieved

  Scenario: client makes call to GET /hello
    Given the client calls /hello
    When the client receives status code of 200
    Then the client receives content "Hello World... Testing 123!"