import java.util.Scanner;
public class TestData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz pierwszą datę podając kolejno: dzień + ENTER, miesiąc + ENTER, rok + ENTER");
        int dzien1 = sc.nextInt();
        int miesiac1 = sc.nextInt();
        int rok1 = sc.nextInt();
        System.out.println("Wpisz drugą datę podając kolejno: dzień + ENTER, miesiąc + ENTER, rok + ENTER");
        int dzien2 = sc.nextInt();
        int miesiac2 = sc.nextInt();
        int rok2 = sc.nextInt();
        
        TwojaData data1 = new TwojaData(rok1, miesiac1, dzien1);
        TwojaData data2 = new TwojaData(rok2, miesiac2, dzien2);
        if(data1.czyWczesniejsza(data2)) {
            System.out.println("Data 1 wczesniejsza od daty 2.");
        } else {
            System.out.println("Data 1 późniejsza od daty 2.");
        }
        if(data1.czyPrzestepny()) {
            System.out.println("Rok daty1 jest przestepny.");
        } else {
            System.out.println("Rok daty1 nie jest przestepnym.");
        }
        System.out.println("W podanym miesiącu jest " + data1.ileDniWMiesiacu() + "dni");
        System.out.println("Wpisz liczbę dni, którą chcesz dodać do daty 1.");
        int dni1 = sc.nextInt();
        data1.dataPozniejsza(dni1);
        System.out.println(data1.dajPozniejsza(dni1));
        System.out.println("Wpisz liczbę dni, którą chcesz odjąć od nowej daty.");
        int dni2 = sc.nextInt();
        data1.dataWczesniejsza(dni2);
        System.out.println(data1.dajWczesniejsza(dni2));
        System.out.println("Nowa data to " + data1.dzienWroku() + " dzień w roku.");
        System.out.println("Liczba dni różniąca obie daty: " + data1.roznicaDat(data2));
        sc.close();
    }
}
