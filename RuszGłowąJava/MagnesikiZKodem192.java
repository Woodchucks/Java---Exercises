import java.util.*;
public class ArrayListMagnet{
    public static void printAl(ArrayList<String> al){
        for(String element: al){
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "jeden");
        a.add(2, "dwa");
        a.add(3, "trzy");
        printAl(a);
        a.remove(2);
        if(a.contains("trzy")){
            a.add("cztery");
        }
        printAl(a);
        if(a.indexOf("cztery") != 4){
            a.add(4, "4.2");
        }
        printAl(a);
        if(a.contains("dwa")){
            a.add("2.2");
        }
        printAl(a);
    }
}
