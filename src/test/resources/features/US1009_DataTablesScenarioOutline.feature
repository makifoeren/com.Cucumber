Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @dataTable
  Scenario Outline: TC14 kullanici 5 farkli kayit giris yapabilmeli

    When kullanici "dataTableUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastname>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And office bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And starDate bolumune "<starDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    And kullanici 1 sn bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And kullanici 1 sn bekler
    And sayfayi kapatir

    Examples:
      | firstname | lastname | position | office   | extension | starDate   | salary  |
      | Alim      | Alim     | qa       | Ankara   | UI        | 2009-10-19 | 165000  |
      | Ahmet     | Yatar    | dev      | Bursa    | C#        | 2007-10-26 | 10000   |
      | Yildiz    | Sen      | tester   | Istanbul | api       | 2007-6-19  | 12000   |
      | hakan     | Sen      | BA       | Hamburg  | -         | 2022-10-19 | 1106000 |
      | Fasti     | GUr      | Po       | Van      | -         | 2022-03-19 | 44000   |
