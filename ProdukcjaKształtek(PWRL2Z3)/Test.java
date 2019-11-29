public class Test {
    public static void main(String[] args) {
        Glowna g = new Glowna();
        Kolo k1 = new Kolo(2);
        Kolo k2 = new Kolo(2.5);
        Prostokat p1 = new Prostokat(2, 3);
        Kwadrat kw1 = new Kwadrat(1);
        Kwadrat kw2 = new Kwadrat(2);
        Kwadrat kw3 = new Kwadrat(3);

        //zamówienia pojedyncze
        System.out.println("Zamówienie pojedyncze na koło o promieniu 2: ");
        System.out.println(g.kosztUslugiCieciaStr(k1, 1) + " zł, " + g.kosztMaterialuStr(k1, 1) + " zł, " + g.kosztCalkowityStr(k1, 1) + " zł");
        System.out.println();
        System.out.println("Zamówienie pojedyncze na koło o promieniu 2.5: ");
        System.out.println(g.kosztUslugiCieciaStr(k2, 1) + " zł, " + g.kosztMaterialuStr(k2, 1) + " zł, " + g.kosztCalkowityStr(k2, 1) + " zł");
        System.out.println();
        System.out.println("Zamówienie pojedyncze na prostokąt o bokach 2, 3: ");
        System.out.println(g.kosztUslugiCieciaStr(p1, 1) + " zł, " + g.kosztMaterialuStr(p1, 1) + " zł, " + g.kosztCalkowityStr(p1, 1) + " zł");
        System.out.println();
        System.out.println("Zamówienie pojedyncze na kwadrat o boku 1: ");
        System.out.println(g.kosztUslugiCieciaStr(kw1, 1) + " zł, " + g.kosztMaterialuStr(kw1, 1) + " zł, " + g.kosztCalkowityStr(kw1, 1) + " zł");
        System.out.println();

        //zamówienie złożone
        System.out.println("Zamówienie zbioru kształtek: 10 kwadratów o boku 2, 100 kwadratów o boku 3 oraz 5 kół o promieniu 2: ");
        double sumaCiecie = g.kosztUslugiCiecia(kw2, 10) + g.kosztUslugiCiecia(kw3, 100) + g.kosztUslugiCiecia(k1, 5);
        double sumaMaterial = g.kosztMaterialu(kw2, 10) + g.kosztMaterialu(kw3, 100) + g.kosztMaterialu(k1, 5);
        double suma = g.kosztCalkowity(kw2, 10) + g.kosztCalkowity(kw3, 100) + g.kosztCalkowity(k1, 5);
        System.out.println("Koszt cięcia: " + String.format("%.2f", sumaCiecie) + " zł, Koszt materiału: " + String.format("%.2f", sumaMaterial) + " zł, Suma: " + String.format("%.2f", suma) + " zł");
        System.out.println();
    }
}
