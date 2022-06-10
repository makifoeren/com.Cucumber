package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelStepDefinations {

    Workbook workbook;

    @Given("kullanici excel dosyayi kullanilabilir hale getirelim")
    public void kullanici_excel_dosyayi_kullanilabilir_hale_getirelim() throws IOException {

        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);


    }

    @Then("{int}.satirdaki {int}.hucreyi yazdiralim")
    public void satirdaki_hucreyi_yazdiralim(Integer satir, Integer sutun) {
        String istenenHucreYazisi = workbook.
                getSheet("Sayfa1").
                getRow(satir - 1).
                getCell(sutun - 1).
                toString();
        System.out.println(satir + " .satir " + sutun + " .sutundaki deger : " + istenenHucreYazisi);
    }

    @Then("baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {
// foorloop ile tum satirlari kontrol etmek gerekiyor bunun icinde satir sayisina ihtiyac var
        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= satirSayisi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) {

                System.out.println("BAskenti Jakrta olan ulke : " +
                        workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }

    }

    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int actualUlkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi == actualUlkeSayisi);
    }

    @Then("Fiziki olarak kullanilan satir sayisini {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisini_oldugunu_test_eder(Integer fizikiKullanilanSatir) {

        int fizikiActualKullanilanSatir = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir == fizikiActualKullanilanSatir);

    }


}