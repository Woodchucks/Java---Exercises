public abstract class Dyplom {
    protected Wlasciciel w;
    protected String nr;
    protected String dta;

    public Dyplom(Wlasciciel wl, String numer, String dat){
        this.w = wl;
        this.nr = numer;
        this.dta = dat;
    }

    public String toString() {
        return "Dyplom nr: " + nr + ", wystawiony: " + dta + ", właściciel: " + w.toString();
    }

    public Wlasciciel zwrocWlasciciela() {
        return w;
    }

    public String dajNazwisko(){
        return w.dajNazwisko();
    }

    public String dajImie(){
        return w.dajImie();
    }

    public String zwrocImieINazwiskoWlasciciela() {
        return w.toString();
    }

    public String zwrocNumer() {
        return nr;
    }
}
