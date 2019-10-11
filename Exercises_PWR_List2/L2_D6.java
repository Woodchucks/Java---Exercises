import java.util.Scanner;
public class L2_D6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Program szukający największy wspólny podzielnik liczb naturalnych. Podaj dwie liczby naturalne");
		long M = s.nextLong();
		long N = s.nextLong();
		while (N!=M){
			if(M>N) M = M-N;
			else if(N>M) N = N - M;
		} //while
		System.out.println("Największy wpólny dzielnik liczb wynosi " + N);
		s.close();
	} //main
} //L2_D6
