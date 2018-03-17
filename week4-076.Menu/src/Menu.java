
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String item){
        if(!this.meals.contains(item)) {
            this.meals.add(item);
        }
    }
    
    public void printMeals(){
        for(String item : this.meals) {
            System.out.println(item);
        }
    }
    
    public void clearMenu(){
        this.meals.removeAll(meals);
    }
}
