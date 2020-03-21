import java.util.ArrayList;
public class Parking {
    ArrayList<String> tabliceRejestracyjne = new ArrayList<String>();
    ArrayList<String> pojazdyNaParkingu = new ArrayList<String>();
    public void rejestracjaPoj(Samochod s) {
        if(tabliceRejestracyjne.contains(s.nrRej)){
            System.out.println("Samochód już występuje w spisie samochodów upoważnionych do wjazdu na parkingi Politechniki Wrocławskiej.");
        } else {
            tabliceRejestracyjne.add(s.nrRej);
        }
    }
    public void rejestracjaWjazdu(Samochod s) {
        //sprawdzenie, czy jest upoważniony do wjazdu
        if(tabliceRejestracyjne.contains(s.nrRej)){
                //sprawdzenie, czy już 'stoi' na parkingu
                if(this.pojazdyNaParkingu.contains(s.nrRej)) {
                    System.out.println("Pojazd jest zaparkowany na parkingu.");
                } 
                else {
                    this.pojazdyNaParkingu.add(s.nrRej);
                }
        } else {
                System.out.println("Samochód nie został zarejestrowany w spisie samochodów upoważnionych do wjazdu.");
        }
    }
    public void rejestracjaWyjazdu(Samochod s) {
        //sprawdzenie, czy już 'stoi' na parkingu
        if(this.pojazdyNaParkingu.contains(s.nrRej)) {
            this.pojazdyNaParkingu.remove(s.nrRej);
        } else {
            System.out.println("Pojazdu nie ma na parkingu.");
        }
    }
    public void zwrocPojazdyNaParkingu() {
        for(int i=0; i<this.pojazdyNaParkingu.size(); i++) {
            System.out.println(this.pojazdyNaParkingu.get(i));
        }
    }
    public Integer zwrocLiczbeSamochodow() {
        return this.pojazdyNaParkingu.size();
    }
}
