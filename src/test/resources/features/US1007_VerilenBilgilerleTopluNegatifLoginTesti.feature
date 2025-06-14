

  Feature: US1007 kullanici verilen kullanici adi ve sifrelerle giris yapamaz

    Scenario Outline: TC14 Kullanici verilen yanlis bilgilerle giris yapilamadigini test eder

    # toplu olarak verilen email ve sifrelerle giris yapilamadigini test edin

    Given kullanici "toUrl" anasayfaya gider
    Then account butonuna basar
    And email olarak listede verilen "<email>" girer
    And password olarak listede verilen "<password>" girer
    And signIn butonuna basar
    Then basarili giris yapilamadigini test eder


      Examples:
      |email            |password |
      |mertcan@mmail.com|345678   |
      |yusuf@ymail.com  |90898    |
      |servet@smail.com |234534   |
      |enes@email.com   |56745    |