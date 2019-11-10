import java.util.Scanner;
public class Przynaleznosc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź współrzędne x i y punktu P oraz wspolrzedne x i y wierzchołków trójkąta QRS");
        double xp = sc.nextDouble();
        double yp = sc.nextDouble();
        double xq = sc.nextDouble();
        double yq = sc.nextDouble();
        double xr = sc.nextDouble();
        double yr = sc.nextDouble();
        double xs = sc.nextDouble();
        double ys = sc.nextDouble();

        Punkt P = new Punkt(xp, yp);
        Punkt P1 = new Punkt(xq, yq);
        Punkt P2 = new Punkt(xr, yr);
        Punkt P3 = new Punkt(xs, ys);

        Trojkat T = new Trojkat(P1, P2, P3);
        Trojkat T1 = new Trojkat(P1, P2, P);
        Trojkat T2 = new Trojkat(P1, P, P3);
        Trojkat T3 = new Trojkat(P, P2, P3);

        if(T.czyNalezy(P, T1, T2, T3)){
            System.out.print("Punkt P nalezy do Trojkata QRS");
        } else {
            System.out.print("Punkt P nie nalezy do Trojkata QRS");
        }
        sc.close();
    } //main
} //przynaleznosc
