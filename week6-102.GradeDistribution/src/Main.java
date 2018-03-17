import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        System.out.println("Type exam scores, -1 completes:");
        gradeStars(lukija);
    }
    
    public static void gradeStars(Scanner scanner){
        int point = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        while(point != -1) {
            grades.add(point);
            point =  Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            countStars(grades, i);
        }
        percentage(grades);
    }
    
    public static void countStars(ArrayList<Integer> points, int grade){
        String stars = "";
        
        for(int point : points) {
            if(point <= 29 && point >= 0 && grade == 0) {
                stars += "*";
            }
            else if(point >= 30 && point <= 34  && grade == 1) {
                stars += "*";
            }
            else if(point >= 35 && point <= 39  && grade == 2) {
                stars += "*";
            }
            else if(point >= 40 && point <= 44  && grade == 3) {
                stars += "*";
            }
            else if(point >= 45 && point <= 49 && grade == 4) {
                stars += "*";
            }
            else if(point >= 50 && point <= 60 && grade == 5) {
                stars += "*";
            }
        }
        System.out.println(stars);
    }
    
    public static void percentage(ArrayList<Integer> grades){
        int accepted = 0;
        for(int grade : grades){
            if(grade > 29)
                accepted++;   
        }
        if(accepted > 0)
            System.out.println("Acceptance percentage: " +(float)(100*accepted/grades.size()));
        else
            System.out.println("Acceptance percentage: " + (float)0);
    }
}
