import java.util.Scanner;
public class L2_I3 {
	public static void main(String[] args) {
		int k = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbę naturalną do 10 cyfr");
		long l = s.nextInt();
		while(l!=0) {
			l = l/10;
			k++;
		} //while
		System.out.println("Liczba cyfr znaczących wynosi " + k);
	s.close();
	} //main
} //L2_I3

