
  @paralel1
  Feature: US1005 Kullanici Saucedemo sayfasinda alisveris yapar

    @smoke @E2E @regression
    Scenario: TC12 kullanici sectigi urunun sepete eklendigini kontrol eder

      Given kullanici "sauceUrl" anasayfaya gider
      And senkronizasyon icin 2 saniye bekler
      Then saucedemo username kutusuna "standard_user" yazar
      And saucedemo password kutusuna "secret_sauce" yazar
      And senkronizasyon icin 2 saniye bekler
      Then saucedemo login tusuna basar
      And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
      When saucedemo add to Cart butonuna basar
      Then saucedemo alisveris sepetine tiklar
      And senkronizasyon icin 2 saniye bekler
      And sectigi urunun basarili olarak sepete eklendigini test eder
      And senkronizasyon icin 2 saniye bekler

