


Feature: US1008 kullanici farkli yanlis username ve password adiyla giris yapamaz

  Scenario Outline: TC13 kullanici yanlis username ve password adiyla giris yapamaz

    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And  gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

 Examples:

  |username|password|
  |Manager5| Manager5!|
  |Manager6 |Manager6!|
  |Manager7 |Manager7!|
  |Manager8 |Manager8!|
  |Manager9 |Manager9!|