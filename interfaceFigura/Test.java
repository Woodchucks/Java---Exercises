public class Test {
    public static void main(String[] args) {
        Uslugi u = new Uslugi();
        Figura k1 = new Kolo(2);
        Figura k2 = new Kolo(2.5);
        Figura p1 = new Prostokat(2, 3);
        Figura kw2 = new Kwadrat(2);
        Figura kw3 = new Kwadrat(3);

        System.out.println("=================================");
        System.out.println("Zamówienia pojedyncze: ");
        System.out.println("=================================");
        System.out.println("3x Koło o promieniu 2");
        u.kosztUslugiCiecia(k1, 3);
        System.out.println(u.kosztUslugiCieciaStr(k1, 3));
        u.kosztMaterialu(k1, 3);
        System.out.println(u.kosztCalkowityStr(k1, 3));
        u.kosztUslugiCiecia(k1, 3);
        System.out.println(u.kosztUslugiCieciaStr(k1, 3));
        System.out.println("");
        System.out.println("5x Kwadrat o boku 2");
        u.kosztUslugiCiecia(kw2, 2);
        System.out.println(u.kosztUslugiCieciaStr(kw2, 2));
        u.kosztMaterialu(kw2, 2);
        System.out.println(u.kosztCalkowityStr(kw2, 2));
        u.kosztUslugiCiecia(kw2, 2);
        System.out.println(u.kosztUslugiCieciaStr(kw2, 2));
        System.out.println("");

        System.out.println("=================================");
        System.out.println("Zamówienia złożone: ");
        System.out.println("=================================");
        System.out.println("10x koło o promieniu 2.5, 5x kwadrat o boku 5, 3x prostokat o bokach 2 i 3");
        Figura fig1 = new FiguraZlozona(k2, 10, kw3, 5, p1, 3);
        u.kosztUslugiCiecia(fig1, 1);
        System.out.println(u.kosztUslugiCieciaStr(fig1, 1));
        u.kosztMaterialu(fig1, 1);
        System.out.println(u.kosztCalkowityStr(fig1, 1));
        u.kosztUslugiCiecia(fig1, 1);
        System.out.println(u.kosztUslugiCieciaStr(fig1, 1));
        System.out.println("");
    }
}
