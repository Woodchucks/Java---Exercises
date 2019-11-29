public class RejestrDyplomow {
    private int maxDypl = 1;
    private Dyplom[] rd = new Dyplom[maxDypl];
    private int liczbaDypl = 0;

    public void dopiszDyplom(Dyplom d){
        if(liczbaDypl < maxDypl) {
            rd[liczbaDypl++] = d;
        } else {
            Dyplom[] nrd = new Dyplom[maxDypl+1];
            for(int i=0; i<maxDypl; i++) nrd[i]=rd[i];
            nrd[liczbaDypl++] = d;
            rd = nrd; //rd musi być nadpisane nrd, aby mieć wszystkie dane (z pozycją 0 i 1 włączie)
            maxDypl++;
        }
    }

    public String toString(){
        String s = "";
        for(int i=0; i<maxDypl; i++) s+= rd[i].toString()+ "\n";
            return s;
    }

    public void wyswietlDyplom() {
        System.out.println("Wykaz dyplomów: ");
        System.out.println(toString());
    }

    public void wyswietlDyplomInz() {
        for(int i=0; i<maxDypl; i++){
            if(rd[i] instanceof DyplomInzyniera){
                System.out.println(rd[i]);
            }
        }
        System.out.println();
    }

    public void wyswietlDyplomUznania() {
        for(int i=0; i<maxDypl; i++){
            if(rd[i] instanceof DyplomUznania){
                System.out.println(rd[i].toString() + "\n");
            }
        }
    }

    public void wyswietlDyplomyWlasciciela(Wlasciciel wlas){
        for(int i=0; i<maxDypl; i++){
            if(rd[i].dajNazwisko() == wlas.dajNazwisko() && rd[i].dajImie() == wlas.dajImie()){
                System.out.println(rd[i].toString());
            }
        }
        System.out.println();
    }

    public void WyswietlDaneWlasciciela(String numer){
        for(int i=0; i<maxDypl; i++){
            if(rd[i].zwrocNumer() == numer){
                System.out.println(rd[i].zwrocImieINazwiskoWlasciciela());
            }
        }
    }
}
