import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
        Scanner scanner = new Scanner(System.in);
        Observation birds = new Observation();
        
        System.out.print("? ");
        String input = scanner.nextLine();
        
        while(!input.equals("Quit")){
            if(input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                
                Birds bird = new Birds(name, latinName);
                birds.add(bird);
            }
            else if(input.equals("Observation")){
                System.out.print("What was observed:? ");
                String name = scanner.nextLine();
                birds.observeBird(name);
            }
            else if(input.equals("Statistics")){
                birds.statistics();
            }
            else if(input.equals("Show")){
                System.out.print("What? ");
                String name = scanner.nextLine();
                birds.show(name);
            }
            System.out.print("? ");
            input = scanner.nextLine();
        }
    }

}
