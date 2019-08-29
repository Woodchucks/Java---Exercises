public class Pomocnik{
    public static void main (String[] args){
        Statek  pierwszy = new Statek();
        int[] polozenieStatku = {1, 5, 6};
        pierwszy.ustawPolozenie(polozenieStatku);
        String strzal = "3";
        String wynik = pierwszy.sprawdz(strzal);
    }
} 

class Statek{
    int[] polozenieStat;
    int iloscTrafien;
    
    public void ustawPolozenie(int[] ppol){
        polozenieStat = ppol;
    }
    
    public String sprawdz(String stringPole){
        iloscTrafien++;
        int strzalInt = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for(int pole: polozenieStat){
            if(strzalInt == pole){
                wynik = "trafiony";
                break;
            }
        }
        if(iloscTrafien == polozenieStat.length){
            wynik = "zatopiony";
        }
        System.out.println("Wynik: " + wynik + ", ilosc ruchow: " + iloscTrafien);
        return wynik;
    }
}
