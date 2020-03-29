import java.util.*;
public class Zbior<T> {
    TreeSet<T> zb=new TreeSet<T>();
    public Zbior(){} 
    public Zbior(TreeSet<T> e) {
        this.zb.addAll(e);
    }   
    public Zbior<T> suma(Zbior<T> zbior){
        Zbior<T> zbsum=new Zbior<T>();
        zbsum.zb.addAll(zb);
        zbsum.zb.addAll(zbior.zb);
        return zbsum;
    }
    public Zbior<T> roznica(Zbior<T> zbior){
        Zbior<T> zbroz=new Zbior<T>();
        for (T x:zb) if (!zbior.zb.contains(x)) zbroz.zb.add(x);
        return zbroz;
    }
    public Zbior<T> przekroj(Zbior<T> zbior){
        Zbior<T> zbprzek=new Zbior<T>();
        for (T x:zb) if (zbior.zb.contains(x)) zbprzek.zb.add(x);
        return zbprzek;
    }
    public Zbior<T> roznica_symetryczna(Zbior<T> zbior){
        Zbior<T> czwsp=new Zbior<T>(zb);
        czwsp=czwsp.przekroj(zbior);
        Zbior<T> zbrozsym=new Zbior<T>(zb);
        zbrozsym=zbrozsym.suma(zbior).roznica(czwsp);
        return zbrozsym;
    }
    public String toString() {
        return zb.toString();
    }
    public void dopisz(T element) {
        zb.add(element);
    }
    public void wyswietl(String nazwa) {
        System.out.println(nazwa);
        if (!zb.isEmpty()) for (T s:zb) System.out.println(s);
        else System.out.println(" Zbior pusty");
        }
}
