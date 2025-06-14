

  Feature:US1008 kullanici add ve remove butonlarini calistirir

    Scenario:TC15 kullanici butonlarin calistigini test eder

      Given kullanici "herokuUrl" anasayfaya gider
      When kullanici Add Element butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And Delete butonu’nun gorunur oldugunu test eder
      Then Delete tusuna basar
      And Add Remove Elements yazisinin gorunur oldugunu test eder
      And senkronizasyon icin 2 saniye bekler

