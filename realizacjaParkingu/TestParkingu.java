public class TestParkingu {
    public static void main(String[] args) throws Exception{
        try {
            Parking p = new Parking();
            Samochod s = new Samochod("Peugeot", "308", 2016, 100000);
            Samochod s2 = new Samochod("Audi", "A3", 2019, 830000);
            Samochod s3 = new Samochod("Mitsubishi", "Colt", 2008, 260000);
            Samochod s4 = new Samochod("Opel", "Corsa", 2006, 240000);
            Motocykl m = new Motocykl("Kawasaki", "Ninja", 2018, 130000, 80);
    
            s.nrRejestracyjny();
            s2.nrRejestracyjny();
            s3.nrRejestracyjny();
            s4.nrRejestracyjny();
            m.nrRejestracyjny();

            System.out.println("Wylosowane nr rejestracyjne samochodów: " + s.nrRej + ", " + s2.nrRej + ", " + s3.nrRej + ", " + s4.nrRej + ", " + m.nrRej);
        
            p.rejestracjaPoj(s);
            p.rejestracjaPoj(s2);
            p.rejestracjaPoj(s3);
            p.rejestracjaPoj(m);
    
            p.rejestracjaWjazdu(s);
            p.rejestracjaWjazdu(s2);
            p.rejestracjaWjazdu(s3);
            System.out.println("");
            System.out.println("Tu powinien wyświetlić się komunikat, że samochod nie jest autoryzowany do wjazdu:");
            p.rejestracjaWjazdu(s4);
            p.rejestracjaWjazdu(m);
    
            p.rejestracjaWyjazdu(s);
            p.rejestracjaWyjazdu(s3);
            
            System.out.println("");
            System.out.println("Po zmianach (wjazd i wyjazd samochodów) widocznych w kodzie, na parkingu powinny być tylko pojazdy 2, 5: ");
            p.zwrocPojazdyNaParkingu();
            
            System.out.println("");
            System.out.println("===============================================================================");
            System.out.println("Druga część zadania - uwzględnienie trzech parkingów Politechniki Wrocławskiej");
            System.out.println("===============================================================================");
            System.out.println("");

            Parking samNac13 = new Parking();
            Parking samNaWronskiego = new Parking();
            Parking samNaD20 = new Parking();

            samNaD20.rejestracjaPoj(s);
            samNaD20.rejestracjaPoj(s2);
            samNac13.rejestracjaPoj(s3);
            samNac13.rejestracjaPoj(s4);
            samNaWronskiego.rejestracjaPoj(m);

            samNaD20.rejestracjaWjazdu(s);
            samNaD20.rejestracjaWjazdu(s2);

            samNac13.rejestracjaWjazdu(s3);
            samNac13.rejestracjaWjazdu(s4);
            
            samNaWronskiego.rejestracjaWjazdu(m);

            System.out.println("Samochody na parkingu C13: ");
            samNac13.zwrocPojazdyNaParkingu();
            System.out.println("");
            System.out.println("Samochody na parkingu D20: ");
            samNaD20.zwrocPojazdyNaParkingu();
            System.out.println("");
            System.out.println("Samochody na parkingu Wronskiego: ");
            samNaWronskiego.zwrocPojazdyNaParkingu();
            System.out.println("");

            System.out.println("Po usunięciu samochodu 2 z parkingu przy D20, Samochody na parkingu D20: ");
            samNaD20.rejestracjaWyjazdu(s2);
            samNaD20.zwrocPojazdyNaParkingu();
            System.out.println("");

            System.out.println("=======================================");
            System.out.println("Wybór parkingu na podstawie zapełnienia");
            System.out.println("=======================================");
            int zapelD20 = samNaD20.zwrocLiczbeSamochodow();
            int zapelC13 = samNaD20.zwrocLiczbeSamochodow();
            int zapelWro = samNaWronskiego.zwrocLiczbeSamochodow();
            if(zapelD20 <= zapelC13 && zapelD20 <= zapelWro) {
                System.out.println("Zapraszamy do parkingu D20");
            } else if(zapelC13 <= zapelD20 && zapelC13 <= zapelWro) {
                System.out.println("Zapraszamy do parkingu C13");
            } else {
                System.out.println("Zapraszamy do parkingu na Wrońskiego");
            }
            System.out.println("");
        }   
        catch (Exception e){
            System.out.println("Wyjątek! " + e.getMessage());
        }
    }
}
