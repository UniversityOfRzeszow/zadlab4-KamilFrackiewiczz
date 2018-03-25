
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Kula {
    Scanner odczyt = new Scanner(System.in);
    int promien;
    public int poleKula() {
       System.out.print("Podaj promien kuli=");
        promien=odczyt.nextInt();
       return (int) (4*3.14*(promien*promien));
    }
    
}
