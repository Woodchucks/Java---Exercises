public class Prostokat extends Figura {
    protected double a, b;

    Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double zwrocPole() {
        return a*b;
    }

    public double zwrocObwod() {
        return 2*a + 2*b;
    }
}
