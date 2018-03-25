
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Kwadrat {
    Scanner odczyt = new Scanner(System.in);
    int a;
    public int poleKwadrat() {
       System.out.print("Podaj bok kwadratu=");
        a=odczyt.nextInt();
       return a*a;
    }
    public int obwodKwadrat(){
        System.out.println("Podaj bok kwadratu=");
        a=odczyt.nextInt();
       return 4*a;
    }
}
