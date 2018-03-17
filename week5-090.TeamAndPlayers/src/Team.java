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

public class Team {
    private String name;
    private int size;
    private ArrayList<Player> players = new ArrayList<Player>();
    
    public Team(String name){
        this.name = name;
    }
    
    public void setMaxSize(int size){
        this.size = size;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int size(){
        return this.players.size();
    }
    
    public void addPlayer(Player player){
        if (this.size > this.players.size()) {
            this.players.add(player);
        }
        else if(this.size == 0){
            this.players.add(player);
        }
    }
    
    public int goals() {
        int total_goals = 0;
        for(int i = 0; i < this.players.size(); i++){
            total_goals += this.players.get(i).goals();
        }
        return total_goals;
    }
    
    public void printPlayers(){
        for (Object i : this.players){
            System.out.println(i);
        }
    }
}
