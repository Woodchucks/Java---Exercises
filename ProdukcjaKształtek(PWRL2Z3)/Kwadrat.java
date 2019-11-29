public class Kwadrat extends Figura {
    protected double d;
    
    public Kwadrat(double d) {
        this.d = d;
    }

    public double zwrocPole() {
        return d*d;
    }

    public double zwrocObwod() {
        return 4*d;
    }
}
