public class Punkt {
    double xp, yp;
    public double odl(Punkt p){
        double deltax = this.xp - p.xp;
        double deltay = this.yp - p.yp;
        return Math.sqrt(deltax*deltax + deltay*deltay);
    } //odl
    public Punkt(double xp, double yp){
        this.xp = xp;
        this.yp = yp;
    } //konstruktor Punkt
} //Punkt
