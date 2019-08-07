package pl.sdacademy.java16poz;
//generate test
//alt + enter

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.10.2018 10:00
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");


        //deklaracja
        int zmiennaLiczbowa;
        String zmiennaTekstowa;

        //inicjalizacja - nadaliśmy wartość
        zmiennaLiczbowa = 0;

        // 2 in 1 - deklaracja i inicjalizacja w jednej lini
        int liczbaUczestnikow = 18;


        //Zadanie
        //Zainicjuj zmienną tekstową i wypisz ją na konsoli

        String tekst = "Tekst tekst tekst";
        System.out.println(tekst);

        int number = 10;
        System.out.println(number);

        System.out.print(number + tekst);

        zmiennaTekstowa = "Przykładowy tekst";
        System.out.println(zmiennaTekstowa);




        //użycie metody
        int liczbaZwracana = 234;
        zwracaLiczbeJakoTekst(liczbaZwracana);

        System.out.println(proszeHasloDoWIFI());

        int a = 10, b = 10;
        System.out.println("Wynik: " +zwracaWynik(a,b));
    }

    public static String proszeHasloDoWIFI()
        {
            return "1245dd2";
        }
    public static String zwracaLiczbeJakoTekst(int liczbe){
        return "Liczba: " +liczbe;
    }

    public static void wyswietlLiczbe(String tekst){
        System.out.println(tekst);
    }

    public static int zwracaWynik(int a, int b){
        int suma = a+b;
        return suma;
    }

}
