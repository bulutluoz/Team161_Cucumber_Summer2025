
  Feature: US1004 sadece gecerli bilgilere sahip kullanicilar giris yapar

    Scenario: TC08 Kullanici gecerli bilgilerle giris yapabilmeli
      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilabildigini test eder
      And 3 saniye bekler
      And sayfayi kapatir


