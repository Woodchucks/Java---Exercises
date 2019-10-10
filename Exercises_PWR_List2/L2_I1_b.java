import java.util.Scanner;
public class I1_b {
	public static void main(String[] args) {
		int k = 1;
		int helper = 0;
		double suma = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Wpisz liczbę n liczb, które masz zamiar zadeklarować");
		int n = s.nextInt();
		System.out.println("Wypisz liczby, które chcesz zadeklarować");
		do {
			double c = s.nextDouble();
			k++;
			if(c>0) {
				suma = suma + c;
				helper++;
			}
		} //do
		while(k<=n);
		double sredniaArytm = suma/helper;
		System.out.println("Srednia arytmetyczna wpisanych przez Ciebie liczb dodatnich wynosi " + sredniaArytm);
		s.close();
	} //main
} //I1_b
