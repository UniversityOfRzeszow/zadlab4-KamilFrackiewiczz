
package pl.edu.ur.polab4;
import java.util.Scanner;
public class Stozek {
    Scanner odczyt = new Scanner(System.in);
    int tworzaca,promien,wysokosc;
    public int poleStozek() {
       System.out.print("Podaj promien stozka=");
        promien=odczyt.nextInt();
       System.out.print("Podaj tworzaca stozka=");
        tworzaca=odczyt.nextInt();
       return (int) (3.14*promien*(promien+tworzaca));
    }
    public int objetoscStozek(){
        System.out.print("Podaj promien stozka=");
        promien=odczyt.nextInt();
       System.out.print("Podaj wysokosc stozka=");
        wysokosc=odczyt.nextInt();
       return (int) (1/3*3.14*(promien*promien)*wysokosc);
    }
    
}
