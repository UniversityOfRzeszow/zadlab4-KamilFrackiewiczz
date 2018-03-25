package pl.edu.ur.polab4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        int wybor,wybor2,wybor3,wybor4;
        System.out.println("Co chcesz obliczyc?[1]Pole,[2]Objetosc,[3]Obwod");
        wybor2=odczyt.nextInt();
        switch(wybor2){
            case 1:{
        System.out.println("Pole jakiej figury chcesz obliczyc?([1]kolo,[2]kwadrat,[3]prostokat,[4]szescian,[5]prostopadłościan,[6]kula,[7]stozek)");
        wybor=odczyt.nextInt();
        
        switch(wybor){
            case 2:{
                Kwadrat kwadrat=new Kwadrat();
                System.out.println("Pole kwadratu wynosi= "+ kwadrat.poleKwadrat());
                break;
            }
            case 1:{
                Koło koło=new Koło();
                System.out.println("Pole koła wynosi="+ koło.poleKoło());
                break;
            }  
            case 3:{
                Prostokat prostokat=new Prostokat();
                System.out.println("Pole prostokata wynosi= "+ prostokat.poleProstokat());
                break;
            }
            case 4:{
                Szescian szescian=new Szescian();
                System.out.println("Pole szescianu wynosi="+ szescian.poleSzescian());
                break;
            }
            case 5:{
                Prostopadloscian prostopadloscian=new Prostopadloscian();
                System.out.println("Pole Prostopadloscianu wynosi="+prostopadloscian.poleProstopadloscian());
                break;
            }
            case 6:{
                Kula kula=new Kula();
                System.out.println("Pole Kuli wynosi=" + kula.poleKula());
                break;
            }
            case 7:{
                Stozek stozek=new Stozek();
                System.out.println("Pole stozka wynosi=" + stozek.poleStozek());
                break;
            }
        }
        break;
            }
            
            
            
            case 3:{
               System.out.println("Obwod jakiej figury chcesz obliczyc?[1]Koło,[2]Kwadrat,[3]Prostokat");
               wybor3=odczyt.nextInt();
               switch(wybor3){
                   case 1:{
                       Koło kolo=new Koło();
                       System.out.println("Obwod koła wynosi="+ kolo.obwodKolo());
                       break;
                   } 
                   case 2:{
                       Kwadrat kwadrat=new Kwadrat();
                       System.out.println("Obwod kwadratu wynosi="+ kwadrat.obwodKwadrat());
                       break;
                   }
                   case 3:{
                       Prostokat prostokat=new Prostokat();
                       System.out.println("Obwod prostokąta wynosi="+ prostokat.obwodProstokat());
                       break;
                   }
                   
               }
               break;
            }
            case 2:{
                System.out.println("Objetosc jakiej figury chcesz obliczyc?[1]Kula,[2]Prostopadloscian,[3]Szescian,[4]Stozek");
                wybor4=odczyt.nextInt();
                switch(wybor4){
                    case 1 :{
                        Kula kula=new Kula();
                        System.out.println("Objetosc kuli wynosi="+ kula.objetoscKula());
                        break;
                    }
                    case 2 :{
                        Prostopadloscian prosto=new Prostopadloscian();
                        System.out.println("Objetosc prostopadloscianu wynosi="+ prosto.objetoscProstopadloscian());
                        break;
                    }
                    case 3 :{
                        Szescian szescian=new Szescian();
                        System.out.println("Objetosc szescianu wynosi="+ szescian.objetoscSzescian());
                        break;
                    }
                    case 4 :{
                        Stozek stozek=new Stozek();
                        System.out.println("Objetosc stozka wynosi="+ stozek.objetoscStozek());
                        break;
                    }
                   
                }
            }
            break;
        }
        
    
}