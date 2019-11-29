public class DyplomInzyniera extends Dyplom {
    protected String specjalnosc;

    public DyplomInzyniera(Wlasciciel wlas, String nr, String data, String spec){
        super(wlas, nr, data);
        this.specjalnosc = spec;
    }

    public String toString() {
        return super.toString() + ", specjalność: " + specjalnosc;
    }
}
