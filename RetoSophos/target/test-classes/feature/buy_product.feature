Feature:  buy product
  I as transactional user
   need to buy a product
   in the web service

  Scenario: buy product
    Given the user was navigated in the web
    When the user select a product
    |product|email|
    |Porción de Papas Fritas Especiales x 300 g|deisy@gmail.com|
    Then the user should see the message successfull

