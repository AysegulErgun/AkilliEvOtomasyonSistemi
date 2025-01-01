Proje Senaryosu: Akıllı Ev Otomasyon Sistemi


Evdeki cihazlar (Işık, Klima, Güvenlik Sistemi gibi) yönetilir.
Ev, farklı modlarda (Örn. Tatil, Gece, Gündüz) çalışabilir. Bu modlar için cihaz ayarları Abstract Factory ile tanımlanır.
Kullanıcı, ev için farklı enerji tasarrufu stratejileri kullanabilir (Örn. Normal, Tasarruflu). Bu stratejiler Strategy ile tanımlanır.
Facade, kullanıcıya cihazları ve modları basit bir arayüzle kontrol etme olanağı sağlar.


Proje Yapısı
Abstract Factory: Ev modlarını oluşturur ve cihazları ayarlar.
Strategy: Enerji tasarrufu stratejilerini yönetir.
Facade: Kullanıcıya basit bir arayüz sağlar.