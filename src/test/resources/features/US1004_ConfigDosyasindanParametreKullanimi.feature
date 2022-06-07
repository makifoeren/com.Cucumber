Feature: Us1004 Kullanici parametre ile configuration file i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dsoyasindan parametre kullanimi

    Given kullanici "brcUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "blue" icerdigini test eder
    Then schließt die Seite