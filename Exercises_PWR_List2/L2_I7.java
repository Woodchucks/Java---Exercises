import java.util.Scanner;
public class L2_I7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Program szukający największy wspólny podzielnik liczb naturalnych. Podaj dwie liczby naturalne");
		long M = s.nextLong();
		long N = s.nextLong();
		long x = M%N;
		while (x!=0){
			M = N;
			N = x;
			x = M%N;
		} //while
		System.out.println("Największy wpólny dzielnik liczb wynosi " + N);
		s.close();
	} //main
} //L2_I7
