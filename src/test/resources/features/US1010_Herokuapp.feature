Feature: US1010 herokuapp Delete testi

  @heroku @ikisi
  Scenario: TC15 herokuapp dan delete butonu calismali
    Given kullanici "herokuApp" anasayfasinda
    And add element butonuna basar
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test edin
    Then Delete butonuna basar
    And Delete butonunun gorunmedigini test edin
    And sayfayi kapatir




