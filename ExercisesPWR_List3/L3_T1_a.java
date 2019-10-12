import java.util.Scanner;
public class L3_T1_a {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj przedział k liczb całkowitych oraz liczebność zbioru elementu n");
		int k = s.nextInt();
		int n = s.nextInt();
		int[] ciag = new int[n];
		
		for(int i=0; i<n; i++) {
			ciag[i] = (int)(Math.random()*k +1);
		}
		
		int[] parz = new int[n];
		int[] nieparz = new int[n];
		int lp, ln;
		lp = 0; 
		ln = 0;
			
		for(int i=0; i<n; i++) {
			if(ciag[i]%2 == 0) parz[lp++] = ciag[i];
			else nieparz[ln++] = ciag[i];
		}
		
		System.out.print("Liczby parzyste: ");
		for(int i=0; i<lp; i++) {
			System.out.print(parz[i] + ",");
		}
		
		System.out.println();
		
		System.out.print("Liczby nieparzyste: ");
		for(int i=0; i<ln; i++) {
			System.out.print(nieparz[i] + ",");
		}
		
		System.out.println();
		s.close();
	} //main
} //L3_T1_a
