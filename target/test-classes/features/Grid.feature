@grid
  Feature: Selenium Grid

    @grid_chome
    Scenario: TC01 Running Chrome
      * kullanici medunna sayfasina gider
      * sayfa tittle "MEDUNNA" oldugunu test eder
      * remote driver kapatir

    @grid_firefox
    Scenario: TC01 Running Chrome
      * kullanici firefox medunna sayfasina gider
      * sayfa tittle "MEDUNNA" oldugunu test eder
      * remote driver kapatir