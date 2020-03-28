public class Kolo implements Figura {
    protected double r;
    final double PI = 3.14;
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
