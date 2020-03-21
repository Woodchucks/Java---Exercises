import java.util.ArrayList;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  
public class Faktura {
    double numer;
    String dataWystawienia, dataSprzedazy, terminZaplaty;
    String typZaplaty;
    ArrayList<Towar> zbiorTowarow = new ArrayList<>();
    ArrayList<Integer> zbiorPozycjiFaktury = new ArrayList<>();

    public Faktura(String typZaplaty, /*ArrayList<Towar> zbiorTowarow,*/ String dataSprzedazy) {
        numer = Math.floor(Math.random()*1000000000);
        Calendar c = Calendar.getInstance(); 
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        dataWystawienia = sdf.format(c);
        this.dataSprzedazy = dataSprzedazy;
        terminZaplaty = "5 dni od daty wystawienia faktury";
        this.typZaplaty = typZaplaty;

        // public void dopisanieTowaru(Towar nowyTowar) {
        //     zbiorTowarow.add(nowyTowar);
        // } 
    }
    public String wyswietlFakture() {
        return "Numer Faktury: " + numer + "\r\n" + "Data Wystawienia Faktury: " + dataWystawienia + "\r\n" + "Data Sprzedaży: " + dataSprzedazy + "\r\n" + "Termin zapłaty: " + terminZaplaty + "\r\n" + "Typ zapłaty: " + typZaplaty;
    }
}
