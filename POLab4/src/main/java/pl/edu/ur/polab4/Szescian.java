
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Szescian {
    Scanner odczyt = new Scanner(System.in);
    int a;
     public int poleSzescian(){
         System.out.print("Podaj bok szescianu=");
         a=odczyt.nextInt();
         return (int)(6*(a*a));
     }
}
