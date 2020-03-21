public class Samochod implements Identyfikacja{
String marka, model, nrRej;
int rocznik, liczbaPrzejKm;
    public Samochod(String marka, String model, int rocznik, int liczbaPrzejKm) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.liczbaPrzejKm = liczbaPrzejKm;
    }
    
    public String nrRejestracyjny() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int i = 0; i < 5; i++) {
            char digit1 = (char) (Math.random() * 10 + '0');
            s.append(digit1);
        }
        nrRej = s.toString();
        return nrRej;
    }
}
