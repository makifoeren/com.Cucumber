Feature:Amazon Search

  Scenario: T01 Nutzer sucht bei Amazon nach Nutella

    Given Benutzer auf der Amazon-Homepage
    Then Benutzer sucht nach Nutella
    And Testergebnisse enthalten Nutella
    And schließt die Seite

  Scenario: T02 Nutzer sucht bei Amazon nach Java

    Given Benutzer auf der Amazon-Homepage
    Then Benutzer sucht nach Java
    And Testergebnisse enthalten Java
    And schließt die Seite

  Scenario: T03 Nutzer sucht bei Amazon nach iphone

    Given Benutzer auf der Amazon-Homepage
    Then Benutzer sucht nach iphone
    And Testergebnisse enthalten iphone
    And schließt die Seite

