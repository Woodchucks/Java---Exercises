public class LodzWioslowa extends Lodz {
    public void wioslowanie(){
        System.out.println("Wiosłuj Natasza!");
    }
}

    public class Lodz{
        private int dlugosc;
        public void setDlugosc(int dl){
            dlugosc = dl;
        }
        public int getDlugosc(){
            return dlugosc;
        }
        public void plyn(){
            System.out.print("dryfuje ");
        }
    }

public class TestLodzi{
    public static void main(String[] args){
        Lodz b1 = new Lodz();
        LodzZaglowa b2 = new LodzZaglowa();
        LodzWioslowa b3 = new LodzWioslowa();
        b2.setDlugosc(32);
        b1.plyn();
        b3.plyn();
        b2.plyn();
    }
}

public class LodzZaglowa extends Lodz{
    public void plyn(){
        System.out.print("stawiać żagle ");
    }
}
