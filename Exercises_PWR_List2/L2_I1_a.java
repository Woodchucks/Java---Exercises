import java.util.Scanner;
public class I1_a {
	public static void main(String[] args) {
		int k = 1;
		double suma = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Wpisz liczbę n liczb, które masz zamiar zadeklarować");
		int n = s.nextInt();
		System.out.println("Wypisz liczby, które chcesz zadeklarować");
		do {
			double c = s.nextDouble();
			suma = suma + c;
			k++;
		} //do
		while(k<=n);
		System.out.println("Suma wpisanych przez Ciebie liczb wynosi " + suma);
		s.close();
	} //main
} //I1_a
