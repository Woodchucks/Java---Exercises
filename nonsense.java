public class Nonsense{
    public static void main (String[] args){
        String[] hiszpanski = {"Ella", "Mi corazon", "Como se llama", "Como se diche"};
        String[] niemiecki   = {"sagt mir", "ist", "schmerzt"};
        String[] angielski  = {"I love you", "you look great", "hey handsome", "so much", "hello"};
        
        int hiszpLgth = hiszpanski.length;
        int niemLgth = niemiecki.length;
        int angLgth = angielski.length;
        
        int rnd1 = (int) (Math.random() * hiszpLgth);
        int rnd2 = (int) (Math.random() * niemLgth);
        int rnd3 = (int) (Math.random() * angLgth);
        
        String zdanie = hiszpanski[rnd1] + " " + niemiecki[rnd2] + " " + angielski[rnd3];
        System.out.println(zdanie);
    }
}
