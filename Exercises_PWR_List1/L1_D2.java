import java.util.Scanner;
public class MinToMax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj wartości 3 liczb rzeczywistych");
		double A = s.nextDouble();
		double B = s.nextDouble();
		double C = s.nextDouble();
		if(A>B && A>C && B>C)
			System.out.println("CBA");
		else if(A>B && A>C && C>B)
			System.out.println("BCA");
		else if(B>A && B>C && A>C)
			System.out.println("CAB");
		else if(B>A && B>C && C>A)
			System.out.println("ACB");
		else if(C>A && C>B && A>B)
			System.out.println("BAC");
		else if(C>A && C>B && B>A)
			System.out.println("ABC");
		s.close();
	} //main
} //MinToMax
