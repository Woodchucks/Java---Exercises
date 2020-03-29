public class TestPunkt {
    public static void main(String[] args) {
        Zbior<Punkt> z1=new Zbior<Punkt>();
        Zbior<Punkt> z2=new Zbior<Punkt>();
        Zbior<Punkt> z3=new Zbior<Punkt>();
        Punkt p1=new Punkt(3,7);
        Punkt p2=new Punkt(2,5);
        Punkt p3=new Punkt(1,4);
        Punkt p4=new Punkt(8,5);
        Punkt p5=new Punkt(4,3);
        Punkt p6=new Punkt(3,5);
        z1.dopisz(p1); z1.dopisz(p2); z1.dopisz(p3);
        z2.dopisz(p2); z2.dopisz(p3); z2.dopisz(p4);
        z3.dopisz(p4); z3.dopisz(p5); z3.dopisz(p6);

        // wyświetlenie zbiorów
        z1.toString(); z1.wyswietl("Zbior 1: ");
        System.out.println("");
        z2.toString(); z2.wyswietl("Zbior 2: ");
        System.out.println("");
        z3.toString(); z3.wyswietl("Zbior 3: ");
        System.out.println("");
        
        Zbior<Punkt> zb=new Zbior<Punkt>();
        // suma
        zb=z1.suma(z2); zb.wyswietl("Suma zbiorow 1 i 2");
        System.out.println("");
        zb=z1.suma(z2).suma(z3); zb.wyswietl("Suma zbiorow 1, 2 i 3");
        System.out.println("");
        // różnica
        zb=z2.roznica(z1); zb.wyswietl("Roznica zbiorow 2 i 1");
        System.out.println("");
        zb=z1.roznica(z3); zb.wyswietl("Roznica zbiorow 1 i 3");
        System.out.println("");
        // przekrój
        zb = z1.przekroj(z2); zb.wyswietl("Przekrój zbiorow 1 i 2: ");
        System.out.println("");
        zb = z2.przekroj(z3); zb.wyswietl("Przekrój zbiorow 2 i 3: ");
        System.out.println("");
        // różnica symetryczna
        zb=z1.roznica_symetryczna(z2); zb.wyswietl("Roznica symetryczna zbiorow: 1 i 2");
    }
}
