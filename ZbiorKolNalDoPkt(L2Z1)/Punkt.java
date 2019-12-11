public class Punkt {
    protected double x, y;

    Punkt() {
        this.x = zwrocWspolrzedna();
        this.y = zwrocWspolrzedna();
    }

    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double zwrocWspolrzedna() {
        double wsp = (double) Math.random()*10;
        return wsp;
    }

    public double odl(Punkt p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
    }
}
