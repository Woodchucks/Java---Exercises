class NumerPokoju {
    int pokoj;
    int pietro;
    Osoba os;

    public NumerPokoju(int pokoj, int pietro) {
        this.pokoj = pokoj;
        this.pietro = pietro;
    }
    public boolean czyWolny() {
        return(os==null);
    }
    public boolean czyWynajmuje(Osoba os) {
        return(os.equals(this.os));
    }
    public int wynajmij(Osoba os) {
        if(this.os != null) {
            System.out.println("Pokój zajęty");
        } else {
            this.os = os;
        }
        return zwrocNrPokoju();
    }
    private int zwrocNrPokoju() {
        return pietro*10+pokoj;
    }
    public void zwolnij(Osoba os) {
        if(os.equals(this.os)) 
            this.os = null;
        else 
            System.out.println("Pokój jest wolny");
    }
}
