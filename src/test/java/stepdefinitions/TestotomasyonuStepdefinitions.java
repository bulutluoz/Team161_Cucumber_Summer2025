package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestotomasyonuStepdefinitions {
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        // Write code here that turns the phrase above into concrete actions
        // yukardaki cumleyi(method adi) somut test adimlarina dondurecek kodlari buraya yazin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("arama kutusuna phone yazip aratir")

    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        String unExpectedAramaSonucu = ConfigReader.getProperty("toUnExpectedSonucYazisi");
        String actualAramaSonucu = testotomasyonuPage.aramaSonucYaziElementi.getText();

        Assertions.assertNotEquals(unExpectedAramaSonucu,actualAramaSonucu);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna Java yazip aratir")
    public void aramaKutusunaJavaYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {
        String expectedAramaSonucu = ConfigReader.getProperty("toUnExpectedSonucYazisi");
        String actualAramaSonucu = testotomasyonuPage.aramaSonucYaziElementi.getText();

        Assertions.assertEquals(expectedAramaSonucu,actualAramaSonucu);

    }
}
