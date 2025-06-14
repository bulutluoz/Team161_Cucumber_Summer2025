
  @paralel2
  Feature: US1004 sadece gecerli bilgilere sahip kullanicilar giris yapar


    Scenario: TC08 Kullanici gecerli bilgilerle giris yapabilmeli
      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilabildigini test eder
      And senkronizasyon icin 2 saniye bekler
      Then logout olur
      And senkronizasyon icin 2 saniye bekler

    @wip
    Scenario: TC09 Kullanici gecersiz email yazdiginda giris yapamamali
      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilamadigini test eder
      And senkronizasyon icin 2 saniye bekler

    @smoke
    Scenario: TC10 Kullanici gecersiz password yazdiginda giris yapamamali
      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilamadigini test eder
      And senkronizasyon icin 2 saniye bekler


    Scenario: TC11 Kullanici gecersiz email gecersiz password yazdiginda giris yapamamali
      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And senkronizasyon icin 2 saniye bekler
      And email olarak "toGecersizEmail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilamadigini test eder
      And senkronizasyon icin 2 saniye bekler


