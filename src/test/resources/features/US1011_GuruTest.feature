Feature: US1011 web tablosundaki istenen sutunu yazdirma

  @grupa
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And kullanici 2 sn bekler
    And cookies sorulursa kabul eder
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir
