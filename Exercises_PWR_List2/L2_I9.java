import java.util.Scanner;
public class L2_I9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbę X oraz potęgę K (l.naturalna) do której chcesz podnieść X");
		int X = s.nextInt();
		int K = s.nextInt();
		System.out.println("X do potęgi K wynosi " + potega(X, K));
		s.close();
	} //main
	
	public static double potega(int X, int K) {
		return Math.pow(X, K);
	}
} //L2_I9
