package pl.sdacademy.java16poz.Obiekty;

public class Osoba {

    //pola, imie, nazwisko, wiek

       public String imie;
       public String nazwisko;
        int wiek;

        //konstruktor
    //*bezargumentowy (imie - brak, nazwisko - brak, wiek - 0 )

    public Osoba(){
        imie = "Brak";
        nazwisko = "Brak";
        wiek = 0;
    }

    //* argumentowy (imie, nazwisko, wiek = 0)

    public Osoba(String podaneImie, String podaneNazwisko){
        imie = podaneImie;
        nazwisko = podaneNazwisko;
        wiek = 0;
    }


    //* argumentowy (imie nazwisko, wiek)

    public Osoba(String podaneImie, String podaneNazwisko, int podanyWiek){
        imie = podaneImie;
        nazwisko = podaneNazwisko;
        wiek = podanyWiek;
    }

    //metody
    // pobierz imie()
        public String pobierzImie(){

            return imie;
        }

    //pobierzNazwisko()
        public String pobierzNazwisko(){
            return nazwisko;
        }

    //pobierzWiek()
        public int pobierzWiek(){
            return wiek;
        }

    //zmienNazwisko(String noweNazwisko)
        public void zmienNazwisko(String noweNazwisko){
            nazwisko = noweNazwisko;
        }

    //zmienWiek(int nowyWiek)




}
