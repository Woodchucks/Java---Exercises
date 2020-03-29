public class Student implements Comparable{
    String imie, nazwisko;
    int nrInd;
    public Student(String imie, String nazwisko, int nrInd) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrInd = nrInd;
    }
    public String toString() {
        return imie + ", " + nazwisko + ", " + nrInd;
    }
    public int compareTo(Object o) {
        Student s=(Student) o;
        return
        nazwisko.compareTo(s.nazwisko)!=0?nazwisko.compareTo(s.nazwisko):imie.compareTo(s.imie);
    }
}
