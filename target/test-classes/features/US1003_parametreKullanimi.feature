
Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre

  Scenario: TC06 Nutzer sucht bei Amazon nach Nutella

    Given Benutzer auf der Amazon-Homepage
    Then Benutzer sucht nach "Nutella"
    And Testergebnisse enthalten "Nutella"
    And schließt die Seite

