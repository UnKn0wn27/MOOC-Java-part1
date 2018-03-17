
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money money) {
        money = new Money(this.euros + money.euros, this.cents + money.cents);
        return money;
    }
    
    public boolean less(Money money){
        if(this.euros < money.euros)
            return true;
        if(this.euros == money.euros){
            if(this.cents < money.euros){
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented){
        int geuros = this.euros - decremented.euros;
        if(geuros < 0)
            geuros = 0;
        
        int gcents;
        if (this.cents != 0 && decremented.cents == 0)
            gcents = this.cents - 100;
        else
            gcents = this.cents - decremented.cents;
        if (this.cents != 0 || decremented.cents != 0)
            if(gcents < 0){
                gcents = 100 + gcents;
                if(geuros > 0){
                    geuros = geuros - 1;
                }
                else {
                    gcents = 0;
                }
            }
        decremented = new Money(geuros, gcents);
        return decremented;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
