
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Prostopadloscian {
    Scanner odczyt = new Scanner(System.in);
    int a,b,c,d;
     public int poleProstopadloscian(){
         System.out.print("Podaj bok=");
         a=odczyt.nextInt();
         System.out.print("Podaj drugi bok sciany=");
         b=odczyt.nextInt();
         System.out.print("Podaj wysokosc=");
         c=odczyt.nextInt();
         return (int)((2*a*b)+(2*a*c)+(2*c*b));
     }
}
