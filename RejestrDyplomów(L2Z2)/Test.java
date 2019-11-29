public class Test {
    public static void main(String[] args){
        RejestrDyplomow r = new RejestrDyplomow();
        Wlasciciel w1 = new Wlasciciel("Katarzyna", "Kowalska");
        Wlasciciel w2 = new Wlasciciel("Adam", "Dobrzyski");
        Dyplom d1 = new DyplomInzyniera(w1, "47654/2014", "01.06.2019", "Biotechnologia ");
        Dyplom d2 = new DyplomUznania(w2, "37699/2011", "28.07.2016", "za pomoc wolontaryjną ");
        Dyplom d3 = new DyplomInzyniera(w1, "44854/2014", "05.06.2019", "Inżynieria Środowiska ");
        r.dopiszDyplom(d1);
        r.dopiszDyplom(d2);
        r.dopiszDyplom(d3);

        r.wyswietlDyplom();

        System.out.println("Wykaz dyplomów uznania: ");
        r.wyswietlDyplomUznania();

        System.out.println("Wykaz dyplomów inżyniera: ");
        r.wyswietlDyplomInz();

        System.out.println("Dyplomy należące do Katarzyny Kowalskiej: ");
        r.wyswietlDyplomyWlasciciela(w1);

        System.out.println("Dane właściciela dyplomu o numerze 37699/2011: ");
        r.WyswietlDaneWlasciciela("37699/2011");
    }
}
