
  Feature: US1002 kullanici ortak baslangic adimlarini Background olarak olusturur

    Background:anasayfaya gidis
      Given kullanici testotomasyonu anasayfaya gider

    Scenario: TC04 kullanici phone arattiginda urun bulabilmeli
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder


    Scenario: TC05  kullanici dress arattiginda urun bulabilmeli
      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder


    Scenario: TC06 kullanici Java arattiginda urun bulamamali
      When arama kutusuna Java yazip aratir
      Then arama sonucunda urun bulunamadigini test eder
