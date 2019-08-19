package pl.sdacademy.java16poz.klasy;

import pl.sdacademy.java16poz.Obiekty.Kanapka;

public class Main {
    public static void main(String[] args) {

        String tekst = "Przykładowy tekst...";

        // typ_zmiennej nazwa_zmiennej = wartosc
        Kanapka kanapkaZPomidorem;  //deklaracja

        //wykorzystanie konstruktora
        kanapkaZPomidorem = new Kanapka();
        String kartkaZeSklademKanapki = kanapkaZPomidorem.podajSklad();

        //wypisanie zaratości kartki na konsole
        System.out.println(kartkaZeSklademKanapki);

        //Utwóz kanapkę z sałatą wykorzystując konstruktor argumentowy, wypisz na konmsole

        Kanapka kanapkaZSalata;

        String skladKanapkiZSalata = "Bułka, sałata";
        kanapkaZSalata = new Kanapka(skladKanapkiZSalata);

        System.out.println(kanapkaZSalata.podajSklad());


    }

}
