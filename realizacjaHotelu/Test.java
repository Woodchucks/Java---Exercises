class Test {
    public static void main(String[] args) {
        Osoba s1 = new Osoba("Katarzyna", "Kowalska", 568455124, "kasia@gmail.com");
        Osoba s2 = new Osoba("Martyna", "Nowak", 575412854, "martyna@gmail.com");
        Osoba s4 = new Osoba("Rafał", "Czarycki", 887542695, "czarek@gmail.com");
        Hotel h1 = new Hotel(9, 3);
    
        System.out.println("Czy jest jakiś wolny pokój?");
        System.out.println(h1.czyWolny());
        System.out.println("Ile jest wolnych pokoi?");
        System.out.println(h1.ileWolnych());
        System.out.println("Wynajmij Kowalskiej pokój.");
        System.out.println(h1.wynajmij(s1));
        System.out.println("Wynajmij Nowakowej pokój.");
        System.out.println(h1.wynajmij(s2));
        System.out.println("Czy Czarycki wynajmuje jakiś pokój?");
        System.out.println(h1.czyWynajmuje(s4));
        System.out.println("Zwolnij pokój Nowakowej.");
        h1.zwolnijWszystkiePokoje(s2);

        System.out.println("Ile jest wolnych pokoi?");
        System.out.println(h1.ileWolnych());
    }
}
