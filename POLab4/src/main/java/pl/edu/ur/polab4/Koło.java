
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Koło {
    Scanner odczyt = new Scanner(System.in);
    int promień;
     public int poleKoło(){
         System.out.print("Podaj promień koła=");
         promień=odczyt.nextInt();
         return (int)(3.14*promień*promień);
     }
}
