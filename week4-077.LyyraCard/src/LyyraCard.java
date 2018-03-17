/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }
    
    public void payEconomical () {
        if(this.balance - 2.50 >= 0) {
            this.balance -= 2.50;
        }
    }
    
    public void payGourmet () {
        if(this.balance - 4.00 >= 0) {
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
            if (amount <= 150) {
                this.balance += amount;
            }
            else {
                this.balance = 150;
            }
        }
        
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
    
    @Override
    public String toString() {
        // write code here
        String text = Double.toString(this.balance);
        return "The card has " + text + " euros";
    }
}
