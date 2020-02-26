import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ZawodyNarciarskie {
    public static void main(String[] args) throws FileNotFoundException {
  
            File imiona = new File("imiona_meskie.txt");
            File nazwiska = new File("nazwiska_meskie.txt");
            Scanner sc = new Scanner(imiona);
            Scanner sc2 = new Scanner(nazwiska);

            // tworzenie 50 zawodników, wiek od 18 do 50 lat
            List<Zawodnik> zawodnicy = new ArrayList<Zawodnik>();
            String imieM;
            String nazwiskoM;
            int wiek;
                for(int j=0; j<50; j++){
                    while(sc.hasNextLine() && sc2.hasNextLine()){
                            imieM = sc.nextLine();
                            nazwiskoM = sc2.nextLine();
                            wiek = (int) (Math.random()*33)+18;   
                            zawodnicy.add(new Zawodnik(imieM, nazwiskoM, wiek));
                    } //while
                } //for
            
            //dodanie własnego zawodnika
            System.out.println("Dodaj zawodnika -  Wpisz: ");
            Scanner sc3 = new Scanner(System.in);
            System.out.println("imię: ");
            String imieZaw = sc3.nextLine();
            System.out.println("nazwisko: ");
            String nazwiskoZaw = sc3.nextLine();
            System.out.println("wiek: ");
            int wiekZaw = sc3.nextInt();
            Zawodnik z = new Zawodnik(imieZaw, nazwiskoZaw, wiekZaw);
            zawodnicy.add(z);

            //sztuczne wprowadzenie punktacji wprowadzonego zawodnika
            int pktZ = z.punktacja(130);
            String pktZString = Integer.toString(pktZ);
            System.out.println();
            System.out.println("Wprowadzony zawodnik uzyskał: " + pktZString + "punktów");
            System.out.println();

            //przydzielenie zawodnikom punktacji
            int metry;
            for(int l=0; l<zawodnicy.size()-1; l++){
                metry = (int)(Math.random()*30)+100;
                zawodnicy.get(l).punktacja(metry);
                } //for

            List<Zawodnik> zawodnicyDrugaSeria = new ArrayList<Zawodnik>();
            System.out.println("Wyniki pierwszej serii skoków: ");
            Collections.sort(zawodnicy);
            //wybór 30 z 50 zawodników do drugiej serii i wyświetlenie 50
            for(int s=zawodnicy.size() -1; s>= Math.max(zawodnicy.size() - 50, 0); s--){
                if (s > zawodnicy.size() - 30) {
                    zawodnicyDrugaSeria.add(zawodnicy.get(s));
                }
                System.out.println("Zawodnik: " + zawodnicy.get(s).imie + " " + zawodnicy.get(s).nazwisko + ", " + zawodnicy.get(s).wiek + "lat, uzyskał: " + zawodnicy.get(s).getPunkty() + "punktów");
           } //for
            for(int l=0; l<zawodnicyDrugaSeria.size(); l++){
                metry = (int)(Math.random()*30)+100;
                zawodnicyDrugaSeria.get(l).punktacja(metry);
            } //for
            System.out.println();
            
            System.out.println("Wyniki drugiej serii skoków: ");
            Collections.sort(zawodnicyDrugaSeria);
            for(int i=zawodnicyDrugaSeria.size() -1; i>=0; i--) {
                System.out.println("Zawodnik: " + zawodnicyDrugaSeria.get(i).imie + " " + zawodnicyDrugaSeria.get(i).nazwisko + ", " + zawodnicyDrugaSeria.get(i).wiek + "lat, uzyskał: " + zawodnicyDrugaSeria.get(i).getPunkty() + "punktów");
            }

            System.out.println();
            System.out.println("Na podium:");
            for(int i=zawodnicyDrugaSeria.size() -1; i>=zawodnicyDrugaSeria.size() -3; i--) {
                System.out.println("Zawodnik: " + zawodnicyDrugaSeria.get(i).imie + " " + zawodnicyDrugaSeria.get(i).nazwisko + ", " + zawodnicyDrugaSeria.get(i).wiek + "lat, uzyskał: " + zawodnicyDrugaSeria.get(i).getPunkty() + "punktów");
            }
            sc.close();
            sc2.close();
            sc3.close();

    } //main
    static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
} //ZawodyNarciarskie
