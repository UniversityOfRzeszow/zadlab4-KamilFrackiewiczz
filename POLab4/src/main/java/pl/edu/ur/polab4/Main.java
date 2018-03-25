package pl.edu.ur.polab4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        String wybor;
       
        System.out.println("Pole jakiej figury chcesz obliczyc?(kolo,kwadrat,prostokat,szescian,prostopadłościan,kula,stozek)");
        wybor=odczyt.next();
        
        switch(wybor){
            case "kwadrat":{
                Kwadrat kwadrat=new Kwadrat();
                System.out.println("Pole kwadratu wynosi= "+ kwadrat.poleKwadrat());
                break;
            }
            case "kolo":{
                Koło koło=new Koło();
                System.out.println("Pole koła wynosi="+ koło.poleKoło());
                break;
            }  
            case "prostokat":{
                Prostokat prostokat=new Prostokat();
                System.out.println("Pole prostokata wynosi= "+ prostokat.poleProstokat());
                break;
            }
            case "szescian":{
                Szescian szescian=new Szescian();
                System.out.println("Pole szescianu wynosi="+ szescian.poleSzescian());
                break;
            }
            case "prostopadloscian":{
                Prostopadloscian prostopadloscian=new Prostopadloscian();
                System.out.println("Pole Prostopadloscianu wynosi="+prostopadloscian.poleProstopadloscian());
                break;
            }
            case "kula":{
                Kula kula=new Kula();
                System.out.println("Pole Kuli wynosi=" + kula.poleKula());
                break;
            }
            case "stozek":{
                Stozek stozek=new Stozek();
                System.out.println("Pole stozka wynosi=" + stozek.poleStozek());
                break;
            }
        }
    }
    
}
