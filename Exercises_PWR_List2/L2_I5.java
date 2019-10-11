import java.util.Scanner;
public class L2_I5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbę naturalną");
		int n = s.nextInt();
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				System.out.println("NIE Liczba pierwsza");
				System.exit(0);
			} //if
			else i++;
		} //while 
		System.out.println("Liczba pierwsza");
	s.close();
	} //main
} //L2_I5
