package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@nutella" ,
        dryRun = false
)

public class TestRunner1 {

    public TestRunner1() {





/*
    Bir framework te bir tek Runner class i yeterli olabilir
    Runner class inda class icerisinde hic bir sey olmaz
    Runner classin da iki onmeli notasyon vardir
     @RunWith(Cucumber.class) notasyonu Runner class ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework umuze JUnit kullanmayi tercih ediyoru

    features: Runner dosyasinin feature dosyalarini neredn bulacagini tarif eder
    glue: step definations dosyalarini nerede bulacagini gosteriri
    tags: o an hangi tag i claistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun =true yazdigimizda testimizi calistirmadan sadece eksik adimlari bize veriyor
    dryRun =false yazdigimizda testleri calistirir
     */
    }

}
