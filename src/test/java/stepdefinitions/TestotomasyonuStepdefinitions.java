package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String istenenKelime) {
        testotomasyonuPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configdenIstenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(configdenIstenenUrl));
    }
    @Then("account butonuna basar")
    public void account_butonuna_basar() {
        testotomasyonuPage.accountLinki.click();
    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String configdenIstenenMail) {
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty(configdenIstenenMail));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String configdenIstenenPassword) {
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty(configdenIstenenPassword));
    }
    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {
        testotomasyonuPage.loginButonu.click();
    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        Assertions.assertTrue(testotomasyonuPage.logoutButonu.isDisplayed());

    }

    @Then("logout olur")
    public void logoutOlur() {
        testotomasyonuPage.logoutButonu.click();
    }

    @And("basarili giris yapilamadigini test eder")
    public void basariliGirisYapilamadiginiTestEder() {
        Assertions.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
    }

    @And("email olarak listede verilen {string} girer")
    public void emailOlarakListedeVerilenGirer(String listedekiEmail) {

        testotomasyonuPage.emailKutusu.sendKeys(listedekiEmail);
    }

    @And("password olarak listede verilen {string} girer")
    public void passwordOlarakListedeVerilenGirer(String listedekiPassword) {
        testotomasyonuPage.passwordKutusu.sendKeys(listedekiPassword);

    }


}
