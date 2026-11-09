# Rapor

**Ad Soyad:** Merza Züleyha Kulus
**Numara:** 690

## 1. Problemin Açıklaması
Kullanıcının asansor ile hangi yonde , kac kat gidecegini hesaplayan veya hareketin olmadıgını hesaplayan veya hatalı girisleri hesaplayan programi yapiniz


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
hkat(hedefkat) , mkat(mevcutkat)

**İşlemler:**
hkat mkattan buyukse hkat-mkat
mkat hkattan buyukse mkat-hkat

**Çıktılar:**
hareket yok / hatali mevcut/hedef kat / x yonunde y kat gideceksiniz

## 3. Sözde Kod (Pseudocode)

```
1. Başla
2. Kullanıcıdan buludugu katı  ve hedef katını alır
3. Eger Hedef veya mevcut katı hatalıysa ya "gecersiz mevcut kat" yada "gecersiz hedef kat" cıktısını verir(degilse 4.adıma gidin)
4. Degilse EgerHedef kat mevcut kattan büyükse kac kat gidecegini ogrenmek icin hkat-mkat islemini yol degiskenine atar yon degiskeninede "yukarı" yı atar.(degilse 6.adıma gidin)
5. Kullanıcıya kac kat gidecegini ve ne yonde gidecegini soyler.
6. Degilse Eger Mevcut kat hedef kattan buyukse kac kat gidecegini ogrenmek icin mkat-hkat islemini yol degiskenine atar yon degiskeninede "asagi" yi atar.(degilse 8.adıma gidin)
7. Kullanıcıya kac kat gidecegini ve ne yonde gidecegini soyler.
8. Degilse Eger mevcut kat ve hedef kat esitse "Hareket yok" cıktısını verir
9. Bitir
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı |5 Kat yukari gideceksiniz |evet |
| 9 | 2 | 7 kat aşağı |7 Kat asagi gideceksiniz |evet |
| 5 | 5 | Hareket yok |Hareket yok |evet |
| 1 | 10 | 9 kat yukarı |9 Kat yukari gideceksiniz |evet |
| 10 | 1 | 9 kat aşağı |9 Kat asagi gideceksiniz |evet |
| 0 | 5 | Geçersiz mevcut kat |Gecersiz mevcut kat |evet |
| 5 | 11 | Geçersiz hedef kat |Gecersiz hedef kat |evet |
| -2 | 4 | Geçersiz mevcut kat |Gecersiz mevcut kat |evet |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

