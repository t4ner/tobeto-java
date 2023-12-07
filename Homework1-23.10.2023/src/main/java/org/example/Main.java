package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, Tobeto !");

        //Değişken isimlendirmeleri camelCase yapılır.

        //metinsel veri türü : String
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        //tamsayı veri türü : integer
        int vade = 12;

        //ondalıklı veri türleri : double, decimal, float
        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        //mantıksal veri türü : boolean (true OR false)
        boolean dolarDustuMu = false;

        //"if-else => şart bloğu
        String okYonu = "";
        if(dolarBugun < dolarDun) {
            okYonu = "down.swg";
            System.out.println(okYonu);
        }else if(dolarBugun == dolarDun) {
            okYonu = "equals.swg";
            System.out.println(okYonu);
        }else {
            okYonu = "up.swg";
            System.out.println(okYonu);
        }

        //Array (liste)
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbank'tan Alanlar", "Mutlu Emekli"};
        for(int i = 0; i < krediler.length; i++) {
            System.out.println((i+1) + ".Kredi: " + krediler[i]);
        }
    }
}