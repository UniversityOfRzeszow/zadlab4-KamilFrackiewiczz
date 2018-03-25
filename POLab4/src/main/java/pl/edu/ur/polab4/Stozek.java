
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Stozek {
    Scanner odczyt = new Scanner(System.in);
    int tworzaca,promien;
    public int poleStozek() {
       System.out.print("Podaj promien stozka=");
        promien=odczyt.nextInt();
       System.out.print("Podaj tworzaca stozka=");
        tworzaca=odczyt.nextInt();
       return (int) (3.14*promien*(promien+tworzaca));
    }
    
}
