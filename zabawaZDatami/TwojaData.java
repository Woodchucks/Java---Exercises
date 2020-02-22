import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar; 
import java.util.Date;

public class TwojaData {
    final Calendar c;
    public TwojaData(int rok, int miesiac, int dzien) {
        c = Calendar.getInstance();
        c.set(rok, miesiac, dzien);
    }
    public Calendar zwrocDate() {
        return c;
    }
    public boolean czyWczesniejsza(TwojaData other) {
        return c.before(other.zwrocDate());
    }
    public boolean czyPrzestepny() {
        return Year.of(c.get(Calendar.YEAR)).isLeap();
    }
    public int ileDniWMiesiacu() {
        Calendar kalendarz = new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH)-1, c.get(Calendar.DAY_OF_MONTH));
        return kalendarz.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }
    public int dataWczesniejsza(int dni) {
        c.add(c.DATE, -dni);
        return c.get(Calendar.DATE);
    }
    public String dajWczesniejsza(int dni) {
        return "Data 1 pomniejszona o liczbę podanych dni: " + c.get(Calendar.DAY_OF_MONTH) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.YEAR);
    }
    public int dataPozniejsza(int dni) {
        c.add(c.DATE, dni);
        return c.get(Calendar.DATE);
    }
    public String dajPozniejsza(int dni) {
        return "Nowa data powiększona o liczbę podanych dni: " + c.get(Calendar.DAY_OF_MONTH) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.YEAR);
    }
    public int dzienWroku() {
        return c.get(GregorianCalendar.DAY_OF_YEAR)-31;
    }
    public long roznicaDat(TwojaData dat1) {
        Date d1 = c.getTime();
        Date d2 = dat1.zwrocDate().getTime();
        long roznica = Math.abs(d1.getTime()-d2.getTime());
        long rozn = roznica/1000/60/60/24;
        return rozn;
    }
}
