import java.util.Scanner;
public class CzyZbudujemyTrojkat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj 3 długości boków");
		double A = s.nextDouble();
		double B = s.nextDouble();
		double C = s.nextDouble();
		boolean helper;
		
		//czy można utworzyć trójkąt
		if(A+B>C && A+C>B && B+C>A) {
			System.out.println("Z podanych długości boków można utworzyć trójkąt");
			helper = true;
		} //if
		else {
			System.out.println("Z podanych długości boków NIE można utworzyć trójkąta");
			helper = false;
		} //else
		
		//jaki rodzaj trójkąta
		if(A==B && B==C && helper==true)
			System.out.println("Trójkąt jest trójkątem równobocznym");
		else if(helper==true && (A==B || B==C || A==C))
			System.out.println("Trójkąt jest trójkątem równoramiennym");
		else if(helper==true)
			System.out.println("Trójkąt jest trójkątem różnobocznym");
		
		//jaki rodzaj kąta w trójkącie
		if (helper==true && (C*C==(A*A)+(B*B) || A*A==(B*B)+(C*C) || B*B==(A*A)+(C*C)))
			System.out.println("Trójkąt jest trójkątem prostokątnym");
		else if (helper==true && (C*C>(A*A)+(B*B) || A*A>(B*B)+(C*C) || B*B>(A*A)+(C*C)))
			System.out.println("Trójkąt jest trójkątem rozwartokątnym");
		else if(helper==true && (C*C<(A*A)+(B*B) || A*A<(B*B)+(C*C) || B*B<(A*A)+(C*C)))
			System.out.println("Trójkąt jest trójkątem ostrokątnym");
		s.close();
	} //main
} //CzyZbudujemyTrojkat
