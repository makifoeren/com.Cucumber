@wip
Feature: US1002 Benutzer führt allgemeine Schritte mit Background aus

  Background: gemeinsame Schritte
    Given Benutzer auf der Amazon-Homepage

  Scenario : TC05 Nutzer sucht bei Amazon nach Nutella
    Then Benutzer sucht nach Nutella
    And Testergebnisse enthalten Nutella
    And schließt die Seite

  Scenario :TC06 Nutzer sucht bei Amazon nach Java
    Then Benutzer sucht nach Java
    And Testergebnisse enthalten Java
    And schließt die Seite

