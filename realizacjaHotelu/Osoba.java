class Osoba {
    String imie;
    String nazwisko;
    int nrTelefonu;
    String eMail;
    int nrPok;

    public Osoba(String imie, String nazwisko, int nrTelefonu, String eMail) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
        this.eMail = eMail;
    }

    public boolean equals(Osoba other) {
        return other==null?false:this.nazwisko.equals(other.nazwisko);
    }
}
