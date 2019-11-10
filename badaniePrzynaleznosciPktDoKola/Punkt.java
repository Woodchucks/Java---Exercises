
public class Punkt {
	double x, y;
	public double odl(Punkt p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	} //odl
	public Punkt(double x, double y) {
	this.x = x;
	this.y = y;
}
	public String toString() {
		return ("(" + x + ", " + y + ")");
	} //toString
}
