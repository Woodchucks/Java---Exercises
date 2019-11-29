public class Kolo extends Figura {
    protected double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double zwrocPole() {
        return PI*r*r;
    }

    public double zwrocObwod() {
        return 2*PI*r;
    }
}
