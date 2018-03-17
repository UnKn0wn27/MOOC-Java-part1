/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.ArrayList;

public class Observation {
    private ArrayList<Birds> birds = new ArrayList<Birds>();
    
    public void add(Birds bird){
        birds.add(bird);
    }
    
    public void observeBird(String name){
        int birdFound = 0;
        
        for(Birds bird : birds){
            if(bird.getName().contains(name)){
                bird.observe();
                birdFound++;
            }
        }
        if (birdFound == 0)
            System.out.println("Is not a bird!");
    }
    
    public void statistics(){
        for(Birds bird : birds){
            System.out.println(bird.toString());
        }
    }
    
    public void show(String name){
        for(Birds bird: birds){
            if (bird.getName().contains(name)){
                System.out.println(bird.toString());
            }
        }
    }
}
