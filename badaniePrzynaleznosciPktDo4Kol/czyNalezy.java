import java.util.Scanner;
class CzyNalezy {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj współrzędne punktu P: xp oraz yp");
        double xp = s.nextDouble();
        double yp = s.nextDouble();

        Punkt p =  new Punkt(xp, yp);
        Punkt p1 = new Punkt(1, 1);
        Kolo k1 = new Kolo(p1, 1);
        Punkt p2 = new Punkt(-1, 1);
        Kolo k2 = new Kolo(p2, 1);
        Punkt p3 = new Punkt(-1, -1);
        Kolo k3 = new Kolo(p3, 1);
        Punkt p4 = new Punkt(1, -1);
        Kolo k4 = new Kolo(p4, 1);

        if(k1.Nalezy(p)){
            System.out.println("Punkt P należy do koła żółtego K1");
        }
        else if(k2.Nalezy(p)){
            System.out.println("Punkt P należy do koła pomarańczowego K2");
        }
        else if(k3.Nalezy(p)){
            System.out.println("Punkt P należy do koła czerwonego K3");
        }
        else if(k4.Nalezy(p)){
            System.out.println("Punkt P należy do koła brązowego K4");
        }
        else {
            System.out.println("Punkt P nie należy do żadnych z kół");
        }
        s.close();
    }
}
