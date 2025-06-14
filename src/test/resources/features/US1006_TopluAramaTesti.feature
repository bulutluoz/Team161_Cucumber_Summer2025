
  @paralel2
  Feature: US1006 kullanici testotomasyonu sayfasinda liste olarak verilen urunleri aratir

    Scenario Outline: TC13 kullanici listedeki herbir urunu aratip bulundugunu test eder

      Given kullanici "toUrl" anasayfaya gider
      When arama kutusuna "<aranacakUrun>" yazip aratir
      And senkronizasyon icin 1 saniye bekler
      Then arama sonucunda urun bulunabildigini test eder


      Examples:
      |aranacakUrun|
      |apple       |
      |java        |
      |samsung     |
      |baby        |
      |dress       |
      |cokoprens   |
      |nutella     |