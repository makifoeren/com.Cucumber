# Amazon sayfasina gidip sirasiyla Nutelle,Java,Elma,Armut aratip
  #sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

Feature: US1007 Kullanici amazonda istedıgı kelımeyı aratır.

  @negative
  Scenario Outline: TC12 amazonda listedeki kelımelerı aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella             |
      |java         |java                |
      |elma         |elma                |
      |armut        |armut               |


