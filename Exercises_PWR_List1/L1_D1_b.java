import java.util.Scanner;
public class D1_b {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Wpisz współrzęxdne X i Y punktu P");
		double X = s.nextDouble();
		double Y = s.nextDouble();
		int Rb = 1;
		int Rcz = 2;
		int Rpom = 3;
		int Rż = 4;
		double l = length(X, Y);
			if(l<=Rb)
				System.out.println("Punt P należy do obszaru brązowego");
			else if(Rb<l && l<=Rcz)
				System.out.println("Punt P należy do obszaru czerwonego");
			else if(Rcz<l && l<=Rpom)
				System.out.println("Punt P należy do obszaru pomarańczowego");
			else if(Rpom<l && l<=Rż)
				System.out.println("Punt P należy do obszaru żółtego");
			else if(Rż<l && X>=-4 && X<=4 && Y>=-4 && Y<=4)
				System.out.println("Punt P należy do beżowego otoczenia barwnych obszarów");
			else
				System.out.println("Punt P leży poza kolorowymi obszarami");
		s.close();
	} //main
	
	public static double length(double Xp, double Yp) {
		return Math.sqrt((Xp*Xp)+(Yp*Yp));
	} //length
} //D1_b
