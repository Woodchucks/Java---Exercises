import java.util.Scanner;
public class L3_T1_b {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj zakres liczb w zbiorze k oraz liczebność zbioru elementu n");
		int k = s.nextInt();
		int n = s.nextInt();
		int[] zasobnik = new int[k];
		for(int i=0; i<k; i++) zasobnik[i] = i+1;
		int[] zbior = new int[n];
		int lzbior = 0;
		for(int i=0; i<n; i++) {
/*			int idZasobnika = (int)(Math.random()*k);   */ int idZasobnika = (int)(Math.random()*(k-lzbior));
/*			zbior[lzbior] = zasobnik[idZasobnika];		*/ zbior[lzbior++] = zasobnik[idZasobnika];
/*			zasobnik[idZasobnika] = zasobnik[k-1];		*/ zasobnik[idZasobnika] = zasobnik[k-idZasobnika];
//			k--;
//			lzbior++;
		}
		for(int i=0; i<n; i++) {
			System.out.print(zbior[i] + " ");		
		}
		s.close();
	} //main
} //L3_T1_b6
