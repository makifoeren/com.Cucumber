Feature: US1012 kullanici register yapabilmeli
  @auto
  Scenario: TC17 kullanici uygun data larla register olabilmeli



    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And sayfayi kapatir