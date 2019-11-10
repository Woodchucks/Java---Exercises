import java.util.Scanner;
public class czyNalezy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj kolejno: współrzędne punktu P: px oraz py, środki oraz promienie kół: k1xśr, k1yśr, k1r, k2xśr, k2yśr, k2r, k3xśr, k3yśr, k3r");
		double px =  s.nextDouble();
		double py =  s.nextDouble();
		double k1x = s.nextDouble();
		double k1y = s.nextDouble();
		double k1r = s.nextDouble();
		double k2x = s.nextDouble();
		double k2y = s.nextDouble();
		double k2r = s.nextDouble();
		double k3x = s.nextDouble();
		double k3y = s.nextDouble();
		double k3r = s.nextDouble();
		Punkt P = new Punkt(px, py);
		Punkt P1 = new Punkt(k1x, k1y);
		Punkt P2 = new Punkt(k2x, k2y);
		Punkt P3 = new Punkt(k3x, k3y);
		Kolo K1 = new Kolo(P1, k1r);
		Kolo K2 = new Kolo(P2, k2r);
		Kolo K3 = new Kolo(P3, k3r);
		
		if(K1.przynaleznosc(P) && K2.przynaleznosc(P) && K3.przynaleznosc(P)) {
			System.out.println("Punkt" + P + " należy do wspólnej części trzech kół, K1, " + K1 + ", K2,  " + K2 + " ,K3, " + K3);
		} //if
		else if(K1.przynaleznosc(P) && K2.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do wspólnej części dwóch kół, K1, " + K1 + ",K2,  " + K2);
		} //else if
		else if(K1.przynaleznosc(P) && K3.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do wspólnej części dwóch kół, K1, " + K1 + ",K3,  " + K3);
		} //else if
		else if(K2.przynaleznosc(P) && K3.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do wspólnej części dwóch kół, K2, " + K2 + ",K3,  " + K3);
		} //else if
		else if(K1.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do koła: " + K1);
		} //else if
		else if(K2.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do koła: " + K2);
		} //else if
		else if (K3.przynaleznosc(P)) {
			System.out.println("Punkt" + P + "należy do koła: " + K3);
		} //else
		else {
			System.out.println("Punkt" + P + " nie należy do żadnego koła");
		} //else
		s.close();
	} //main
} //czyNalezy
