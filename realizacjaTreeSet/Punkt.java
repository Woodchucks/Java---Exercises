public class Punkt implements Comparable{
    Integer x, y;
    public Punkt(int x, int y) {
            this.x = x;
            this.y = y;
    }
    public String toString() {
            return "Współrzędne Punktu: " + x + ", " + y;
    }
    public int compareTo(Object o) {
        Punkt p=(Punkt) o;
        return
        y.compareTo(p.y)!=0?y.compareTo(p.y):x.compareTo(p.x);
    }
}
