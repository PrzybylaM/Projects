package pl.sdacademy.java16poz.klasy;

import pl.sdacademy.java16poz.Obiekty.Osoba;

public class OsobaMain {
    public static void main(String[]args){
        Osoba nowaOsoba = new Osoba ("Janusz", "Kiepski");
        System.out.println(nowaOsoba.imie + " "+ nowaOsoba.nazwisko);

        System.out.println(nowaOsoba.pobierzNazwisko());
    //zmiana nazwiska
        nowaOsoba.zmienNazwisko("Nowak");

    //wyświetlnienie nowego nazwiska
        System.out.println(nowaOsoba.pobierzNazwisko());

    }
}
