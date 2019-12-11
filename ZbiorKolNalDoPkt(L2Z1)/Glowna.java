public class Glowna {
    public void tablPktPr(int liczba) {
        for(int i=0; i<=liczba; i++) {
            Punkt[] tablPunktow = new Punkt[100];
            Kolo[] tablPromieni = new Kolo[100];
            tablPunktow[i] = new Punkt();
            tablPromieni[i] = new Kolo();
            Double x = tablPunktow[i].x;
            Double y = tablPunktow[i].y;
            Double r = tablPromieni[i].r;
            System.out.println("Koło o współrzędnych środka: (" + String.format("%.1f", x) + ", " + String.format("%.1f", y) + ") i promieniu: " + String.format("%.1f", r));
            Punkt p = new Punkt(5.0, 5.0);
            if(tablPunktow[i].odl(p) <= tablPromieni[i].r) {
                System.out.println("Punkt P należy do koła o współrzędnych środka: (" + String.format("%.1f", x) + ", " + String.format("%.1f", y) + ") i promieniu: " + String.format("%.1f", r));
            }
        }  
    }
}
