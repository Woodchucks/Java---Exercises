import java.io.*; 

public class PomocnikGry {
    public String pobierzDaneWejsciowe(String komunikat) {
    String wierszWej = null;

    System.out.print(komunikat + " ");
    try {
      BufferedReader sw = new BufferedReader(
        new InputStreamReader(System.in));
      wierszWej = sw.readLine();
      if (wierszWej.length() == 0) return null;
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
    return wierszWej;
  }
}

class Statek{
    int[] polozenieStat;
    int iloscRuchow;
    
    public void ustawPolozenie(int[] ppol){
        polozenieStat = ppol;
    }
    
    public String sprawdz(String stringPole){
        int strzalInt = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for(int pole: polozenieStat){
            if(strzalInt == pole){
                wynik = "trafiony";
                break;
            }
        }
        if(iloscRuchow == polozenieStat.length){
            wynik = "zatopiony";
        }
        return wynik;
    }
}

class PrzebiegGry{
    public static void main(String[] args){
        int liczbaRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        Statek statek = new Statek();
        int liczbaLosowa = (int)(Math.random()*8);
        int[] polozenieStatku = {liczbaLosowa, liczbaLosowa+1, liczbaLosowa+2};
        statek.ustawPolozenie(polozenieStatku);
        boolean czyIstnieje = true;
        
        while(czyIstnieje == true){
            String strzal = pomocnik.pobierzDaneWejsciowe("Podaj liczbę");
            String wynik = statek.sprawdz(strzal);
            liczbaRuchow++;
            
            if(wynik == "zatopiony"){
                czyIstnieje = false;
                System.out.println("Liczba ruchow: " + liczbaRuchow);
            }
        }
    }
}
