public class Trojkat {
    Punkt P, P1, P2, P3;
    Trojkat T1, T2, T3;
    public double pole(){
        double a = this.P1.odl(this.P2);
        double b = this.P2.odl(this.P3);
        double c = this.P3.odl(this.P1);
        double polObw = (a+b+c)/2;
        return Math.sqrt(Math.abs(polObw*(polObw-a)*(polObw-b)*(polObw-c)));
    } //pole
    public boolean czyNalezy(Punkt P, Trojkat T1, Trojkat T2, Trojkat T3){
        double poleT1 = T1.pole();
        double poleT2 = T2.pole();
        double poleT3 = T3.pole();
        return Math.abs(this.pole() - poleT1 - poleT2 - poleT3) < 0.001;
    } //czyNalezy
    public Trojkat(Punkt P1, Punkt P2, Punkt P3) {
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
    } //konstruktor Trojkat
} //Trojkat
