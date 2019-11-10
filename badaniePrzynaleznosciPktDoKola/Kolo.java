public class Kolo {
	Punkt s;
	double r;
	public boolean przynaleznosc(Punkt p) {
		return s.odl(p) <= r;
	} //przynaleznosc
	public String toString() {
		return ("o promieniu= " + r + "i środku :" + s);
	} //toString
	public Kolo(Punkt s, double r) {
		this.s = s;
		this.r = r;
	}
 }
