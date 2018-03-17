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

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number){
        this.persons.add(new Person(name, number));
    }
    
    public void printAll(){
        for(Object i : this.persons){
            System.out.println(i.toString());
        }
    }
    
    public String searchNumber(String name){
        for(int i = 0; i < this.persons.size(); i++){
            if(this.persons.get(i).toString().contains(name)){
                return this.persons.get(i).getNumber();
            }
                
        }
        
        return "number not known";
    }
}
