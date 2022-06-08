
# hotel my camp sitesinde 3 adet negatif test senaryosu olusturalim
  #1- dogru username yanlis passwort
  #2- yanlis username dogru passwort
  #3- yanlis username yanlis passwort

Feature: US_1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis passwort ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And yanlis password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC10 yanlis username ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And yanlis username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC11 yanlis username ve passwort ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And yanlis username girer
    And yanlis password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir