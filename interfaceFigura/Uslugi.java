public class Uslugi {
    public double kosztUslugiCiecia(Figura f, int liczba) {
        return liczba * f.zwrocObwod();
    }
    public String kosztUslugiCieciaStr(Figura f, int liczba) {
        return String.format("Koszt usługi cięcia: %.2f", this.kosztUslugiCiecia(f, liczba));
    }
    public double kosztMaterialu(Figura f, int liczba) {
        return liczba * f.zwrocPole();
    }
    public String kosztMaterialuStr(Figura f, int liczba) {
        return String.format("Koszt materiału: %.2f", this.kosztMaterialu(f, liczba));
    }
    public double kosztCalkowity(Figura f, int liczba) {
        return liczba * (f.zwrocObwod() + f.zwrocPole());
    }
    public String kosztCalkowityStr(Figura f, int liczba) {
        return String.format("Koszt całkowity: %.2f", this.kosztCalkowity(f, liczba));
    }
}
