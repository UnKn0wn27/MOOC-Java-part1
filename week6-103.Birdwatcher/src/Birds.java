/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
public class Birds {
    private String name;
    private String latinName;
    private int observed;
    
    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public void observe(){
        this.observed++;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
}
