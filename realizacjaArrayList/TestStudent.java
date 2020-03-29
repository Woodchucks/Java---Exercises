public class TestStudent {
    public static void main(String[] args) {
        Zbior<Student> z1=new Zbior<Student>();
        Zbior<Student> z2=new Zbior<Student>();
        Zbior<Student> z3=new Zbior<Student>();
        Student s1=new Student("Malinowski","Jan",1952481);
        Student s2=new Student("Korzeniowska","Amanda",1584625);
        Student s3=new Student("Kowalski","Jędrzej",15842003);
        Student s4=new Student("Nowakowska","Anna",1865004);
        Student s5=new Student("Kulawy","Rafał",1485101);
        Student s6=new Student("Chojnacki","Krystian",1595101);
        z1.dopisz(s1); z1.dopisz(s2); z1.dopisz(s3);
        z2.dopisz(s2); z2.dopisz(s3); z2.dopisz(s4);
        z3.dopisz(s4); z3.dopisz(s5); z3.dopisz(s6);

        // wyświetlenie zbiorów
        z1.toString(); z1.wyswietl("Zbior 1: ");
        System.out.println("");
        z2.toString(); z2.wyswietl("Zbior 2: ");
        System.out.println("");
        z3.toString(); z3.wyswietl("Zbior 3: ");
        System.out.println("");
        
        Zbior<Student> zb=new Zbior<Student>();
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
