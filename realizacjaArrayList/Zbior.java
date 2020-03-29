import java.util.*;
public class Zbior<T> {
    ArrayList<T> al=new ArrayList<T>();
    public Zbior(){} 
    public Zbior(ArrayList<T> e) {
        this.al.addAll(e);
    }   
    public Zbior<T> suma(Zbior<T> zbior){
        Zbior<T> zbsum=new Zbior<T>();
        zbsum.al.addAll(al);
        zbsum.al.addAll(zbior.al);
        return zbsum;
    }
    public Zbior<T> roznica(Zbior<T> zbior){
        Zbior<T> zbroz=new Zbior<T>();
        for (T x:al) if (!zbior.al.contains(x)) zbroz.al.add(x);
        return zbroz;
    }
    public Zbior<T> przekroj(Zbior<T> zbior){
        Zbior<T> zbprzek=new Zbior<T>();
        for (T x:al) if (zbior.al.contains(x)) zbprzek.al.add(x);
        return zbprzek;
    }
    public Zbior<T> roznica_symetryczna(Zbior<T> zbior){
        Zbior<T> czwsp=new Zbior<T>(al);
        czwsp=czwsp.przekroj(zbior);
        Zbior<T> zbrozsym=new Zbior<T>(al);
        zbrozsym=zbrozsym.suma(zbior).roznica(czwsp);
        return zbrozsym;
    }
    public String toString() {
        return al.toString();
    }
    public void dopisz(T element) {
        al.add(element);
    }
    public void wyswietl(String nazwa) {
        System.out.println(nazwa);
        LinkedHashSet<T> hashSet = new LinkedHashSet<>(al);
        ArrayList<T> alBezPowtorzen= new ArrayList<>(hashSet);
        if (!alBezPowtorzen.isEmpty()) for (T s:alBezPowtorzen) System.out.println(s);
        else System.out.println(" Zbior pusty");
        }

        //Porównanie wykonania zadania przy użyciu TreeSet i ArrayList:
        //TreeSet bardziej fortunnie dobrane, gdyż nie trzeba się martwić
        //o powtarzające elementy znajdujące się w ArrayList
}
