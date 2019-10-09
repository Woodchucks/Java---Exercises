import java.util.Scanner;
public class PunktWTrojkacie {
  public static double odl(double xi, double yi, double xj, double yj) {
  double dx = xi - xj;
  double dy = yi - yj;
  return Math.sqrt(dx*dx+dy*dy);
  } //odl

  public static double pole(double xp, double yp, double xq, double yq, double xr, double yr) {
  double d1 = odl(xp, yp, xq, yq);
  double d2 = odl(xq, yq, xr, yr);
  double d3 = odl(xp, yp, xr, yr);
  double p = (d1+d2+d3)/2;
  return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
  } //pole

  public static double czytaj(String t, Scanner s) {
  System.out.print(t);
  return s.nextDouble();
  } //czytaj

  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Podaj współrzędne wierzchołków trójkąta w kolejności xp, yp, xq, yq, xr, xr oraz współrzędne punktu S(xs, ys)");
  double xp = czytaj("xp=", s);
  double yp = czytaj("yp=", s);
  double xq = czytaj("xq=", s);
  double yq = czytaj("yq=", s);
  double xr = czytaj("xr=", s);
  double yr = czytaj("yr=", s);
  double xs = czytaj("xs=", s);
  double ys = czytaj("ys=", s);

  /*double xp = s.nextDouble();
  double yp = s.nextDouble();
  double xq = s.nextDouble();
  double yq = s.nextDouble();
  double xr = s.nextDouble();
  double yr = s.nextDouble();
  double xs = s.nextDouble();
  double ys = s.nextDouble();*/

  if(Math.abs(pole(xp,yp,xq,yq,xr,yr)-pole(xp,yp,xq,yq,xs,ys)-pole(xq,yq,xr,yr,xs,ys)-pole(xr,yr,xp,yp,xs,ys))<0.01){
    System.out.println("Punkt S należy do Trójkąta PQR");
  } //if
  else {
    System.out.println("Punkt S nie należy do Trójkąta PQR");
  } //else
  s.close();
  } //main
} //PunktWTrojkacie
