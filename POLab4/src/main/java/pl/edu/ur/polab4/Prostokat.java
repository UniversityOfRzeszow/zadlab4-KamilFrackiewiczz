package pl.edu.ur.polab4;
import java.util.Scanner;
public class Prostokat {
    Scanner odczyt = new Scanner(System.in);
    int b,c;
    public int poleProstokat() {
       System.out.print("Podaj bok Prostokąta=");
        b=odczyt.nextInt();
       System.out.print("Podaj bok Prostokąta=");
        c=odczyt.nextInt();
       return c*b;
    }
}