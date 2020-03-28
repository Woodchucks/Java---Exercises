public class FiguraZlozona implements Figura {
    Figura kolo;
    Figura prostokat;
    Figura kwadrat;
    int l1, l2, l3;
    public FiguraZlozona (Figura kolo, int l1, Figura kwadrat, int l2, Figura prostokat, int l3 ) {
        this.kolo = kolo;
        this.l1 = l1;
        this.kwadrat = kwadrat;
        this.l2 = l2;
        this.prostokat = prostokat;
        this.l3 = l3;
    }
    public double zwrocObwod() {
        return (kolo.zwrocObwod()*l1)+(kwadrat.zwrocObwod()*l2)+(prostokat.zwrocObwod()*l3);
    }
    public double zwrocPole() {
         return (kolo.zwrocPole()*l1)+(kwadrat.zwrocPole()*l2)+(prostokat.zwrocPole()*l3);
    }
}
