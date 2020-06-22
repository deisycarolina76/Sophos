Feature: Process of rest service in the Web
  I as user of the platform Web
  I need to do a process of rest service
  for see a response of system

  Scenario: Rest service
    Given The user was navigated in the web
    When User is consuming a service
      |requestmethod|firstname|firstvalue|lastname|lastvalue|gender|gendervalue|email|emailvalue|
      |POS|first_name|Deisy|last_name  |Ossa|gender|female|email|deisy@gmail.com|
    Then The user will see a first name: Deisy