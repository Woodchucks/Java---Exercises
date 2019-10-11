import java.util.Scanner;
public class L2_I4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbę naturalną");
		int n = s.nextInt();
		int max = 0;
		while(n>0) {
			int x = n%10;
			n = n/10;
			if(x>max) {
				max = x;
			} //if
		} //while
		System.out.println("Największa cyfra liczby naturalnej wynosi " + max);
	s.close();
	} //main
} //L2_I4
