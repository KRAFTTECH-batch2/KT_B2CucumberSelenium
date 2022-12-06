@login
Feature: Krafttech Log in Test
  # Agile story : As a user, I should be able to log in so I can see my account
@Mike  @SDET
  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike credentials
    Then The user should be able to login
@Sebastian @smoke @QA
  Scenario: Login as Sebastian
    Given The user is on the login page
    When The user enters Sebastian credentials
    Then The user should be able to login

  @developer @db
  Scenario: Login as Jhon Nash
    Given The user is on the login page
    When The user enters Jhon Nash credentials
    Then The user should be able to login
  
  @SDET  @smoke  @db
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa credentials
    Then The user should be able to login


    Scenario: User should be abe to login with valid credentials
      Given User should be on the login page
      When User should input login information
      Then User should be on home page

       @wip
        Scenario: Login with parameters
          Given User should be on the login page
          When User should input "user22@test.com" and "Test123456"
          Then User should be on home page

