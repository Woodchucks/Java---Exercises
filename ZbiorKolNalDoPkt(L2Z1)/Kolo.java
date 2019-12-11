public class Kolo {
    protected double r;

    Kolo() {
        this.r = zwrocPromien();
    }

    public double zwrocPromien(){
        r = (double) Math.random()*1+1;
        return r;
    }
}
