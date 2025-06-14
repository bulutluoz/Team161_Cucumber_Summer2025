  @paralel1
  Feature: US1003 kullanici testotomasyonu sayfasinda istedigi kelimeyi aratir

    Scenario: TC07 kullanici istedigi kelimeyi aratabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "samsung" yazip aratir
      And senkronizasyon icin 5 saniye bekler
      Then arama sonucunda urun bulunabildigini test eder
