package pl.sdacademy.java16poz.Obiekty;

public class Kanapka {

    //właściwość - pola
    String sklad;

    //konstruktor bezargumentowy
    //NazwaKlasy
    public Kanapka(){
        sklad = "Nie znany";
    }

    //konstruktor argumentowy
    //zawiera argument którego wartość zostaje przypisana do włąściwości kanapki czyli jej składu
    public Kanapka(String podanySklad){
        sklad = podanySklad;
    }

    //metody - funkcje
    public String podajSklad(){
        return sklad;
    }

}
