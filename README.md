# SchoolRepo
Repo for Herr Grimme

Just a Repo for Java Programs to prove I know what I'm doing I guess



import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    Scanner scanner = new Scanner(System.in);

    System.out.print("Gib deinen Namen ein: ");
    String name = scanner.next();
    System.out.println("Hallo, "+name);

    while(true){
        System.out.println("Du stehst vor drei Türen, welche möchtest du öffnen? [1, 2, 3]");
        int tuer = scanner.nextInt();

        if (tuer == 1){
          System.out.println("Hinter Tür 1 ist nichts.");
        }
        else if (tuer == 2){
          System.out.println("Du öffnest die Tür, und betrittst den Raum. Die Tür fällt direkt hinter dir zu. Was tust du?");
            String wahl = scanner.next();
          System.out.println("Du möchtest "+wahl+"? Super Idee.");
          break;
        }
        else if (tuer == 3){
        System.out.println("Du bist zu schwach um Tür 3 zu öffnen. Versuche es später noch einmal.");
    	}
    }
  } 
}
![image](https://user-images.githubusercontent.com/38440532/199499079-975bb345-6927-4719-aa76-e1835c86edc4.png)
