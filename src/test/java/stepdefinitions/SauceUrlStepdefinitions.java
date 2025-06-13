package stepdefinitions;

import io.cucumber.java.en.*;
import pages.SauceUrlPage;

public class SauceUrlStepdefinitions {
    SauceUrlPage sauceUrlPage = new SauceUrlPage();

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String direktUsername) {
        sauceUrlPage.usernameKutusu.sendKeys(direktUsername);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String direktPassword) {
        sauceUrlPage.passwordKutusu.sendKeys(direktPassword);
    }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        sauceUrlPage.loginButonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        String ilkUrunIsmi = sauceUrlPage.ilkUrunIsimElementi.getText();

        sauceUrlPage.ilkUrunIsimElementi.click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

    }
}
