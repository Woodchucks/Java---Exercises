// import java.util.Scanner;
public class Zawodnik implements Comparable {
    String imie;
    String nazwisko;
    int wiek;
    int punkty;

    //punktacja sędziów
    public int punktacja(int metry){
        //losowa liczba pkt od sedziów (0-10)
        int P = (int)(Math.random()*11);

        //1pkt za każdy m powyżej pktKrytycznegoK
        //-1pkt za każdy m poniżej pktKrytycznegoK
        int pktKrytycznyK = 120;
        int S = metry - pktKrytycznyK;

        //losowa ocena za styl (0-10)
        int[] oceny = new int[5];
        int min = 11, max = 0, sumaOcen = 0;
        for(int i=0; i<5; i++){
            oceny[i] = (int)(Math.random()*11);
            if(oceny[i] > max){
                max = oceny[i];
            } 
            if(oceny[i] < min){
                min = oceny[i];
            }
            sumaOcen += oceny[i];
        } //for
        punkty = P + S + sumaOcen - min - max;

        //zsumowanie pkt
        return punkty;
    } //punktacja
    
    public int getPunkty() {
        return punkty;
    }

    public Zawodnik(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    } //konstruktor Zawodnik

    public int compareTo(Object object) {
        Zawodnik zawodnikInny = (Zawodnik) object;
        return Integer.valueOf(punkty).compareTo(zawodnikInny.getPunkty()); //jesli 1 wart wieksza od 2 return da 1 zawodnika
    }
    //punkt powyzej to this.getPunkty() !

} //Zawodnik
