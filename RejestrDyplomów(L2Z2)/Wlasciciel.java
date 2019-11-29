public class Wlasciciel {
    private String imie;
    private String nazwisko;

    public Wlasciciel(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String toString(){
        return imie + " " + nazwisko;
    }
    public String dajImie(){
        return imie;
    }
    public String dajNazwisko(){
        return nazwisko;
    }
}
