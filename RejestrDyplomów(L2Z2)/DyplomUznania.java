public class DyplomUznania extends Dyplom {
    protected String tytul;

    public DyplomUznania(Wlasciciel w, String nr, String dat, String tytul){
        super(w, nr, dat);
        this.tytul = tytul;
    }

    public String toString(){
        return super.toString() + ", tytuł: " + tytul;
    }
}
