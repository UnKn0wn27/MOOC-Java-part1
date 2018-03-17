/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        if(this.value != this.upperLimit) {
            this.value++;
        }
        else {
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value; 
    }
    
    public void setValue(int value){
        if (value <= this.upperLimit && value >= 0) {
            this.value = value;
        }
    }
    
    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;  
        }
        else {
            return "" + this.value;
        }
    }
}
