package ders26_inheritance;

public class DToyota {
    /*
        Bir objenin data türü constructor olarak kullanılan class veya
        o class'ın parent class'ları olabilir.
        Data türü olarak parent class seçilmesindeki amaç
        child class'dan oluşturulan objenin parent class'in tüm child class'larinin
        taşıdığı özellikleri vurgulamaktır.
        (personel toplantisina katilan doktor kemal, bashemsire ayse gibi)

        Data türü ile constructor farkli olduğunda
        variable ile method'lar farklı davranirlar

        Variable'ların alacağı değeri bulmak için aramaya data türü olan class'dan
        başlarız, o class'da yok ise sırasıyla parentlerine bakarız.
        Ve ilk bulduğumuz değeri atama yapariz.
        Data turu olan class parentlerinde bulunumazsa CTE olur.
     */
    String marka="Toyota";
    String model="Model belirtilmedi";
    String motor="Motor belirtilmedi";
    String yakit="Yakit belirtilmedi";
}
