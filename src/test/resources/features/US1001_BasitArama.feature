
  Feature: US1001 Kullanici testotomasyonu sayfasinda urun aratir

    Scenario: TC01 kullanici phone arattiginda urun bulabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir
