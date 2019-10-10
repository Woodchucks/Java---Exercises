import java.util.Scanner;
public class L2_I2 {
	public static void main(String[] args) {
		int suma = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj liczbę naturalną, w celu obliczenia sumy jej cyfr");
		int l = s.nextInt();
		while(l!=0) {
			suma = suma + l%10;
			l = l/10;
		} //while
		System.out.println("Suma cyfr podanej liczby wynosi " + suma);
	s.close();
	} //main
} //L2_I2
