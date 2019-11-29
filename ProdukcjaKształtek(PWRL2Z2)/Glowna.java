public class Glowna {
    public double kosztUslugiCiecia(Figura f, double liczba) {
        return liczba * f.zwrocObwod();
    }

    public String kosztUslugiCieciaStr(Figura f, double liczba) {
        return String.format("Koszt usługi cięcia: %.2f", kosztUslugiCiecia(f, liczba));
    }

    public double kosztMaterialu(Figura f, double liczba) {
        return liczba * f.zwrocPole();
    }

    public String kosztMaterialuStr(Figura f, double liczba) {
        return String.format("Koszt materiału: %.2f", kosztMaterialu(f, liczba));
    }
    
    public double kosztCalkowity(Figura f, double liczba) {
        return liczba * (f.zwrocObwod() + f.zwrocPole());
    }

    public String kosztCalkowityStr(Figura f, double liczba) {
        return String.format("Koszt całkowity: %.2f", kosztCalkowity(f, liczba));
    }
}
