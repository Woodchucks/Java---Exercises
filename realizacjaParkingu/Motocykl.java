public class Motocykl extends Samochod {
    int konieMech;
    public Motocykl (String marka, String model, int rocznik, int liczbaPrzejKm, int konieMech) {
        super(marka, model, rocznik, liczbaPrzejKm);
        this.konieMech = konieMech;
    }
}
