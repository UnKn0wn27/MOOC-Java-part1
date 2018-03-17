
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment apartment) {
        return this.squareMeters > apartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        int price_this = this.squareMeters * this.pricePerSquareMeter;
        int price_other = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int difference = price_this - price_other;
        if(difference < 0)
            return difference * -1;
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int price_this = this.squareMeters * this.pricePerSquareMeter;
        int price_other = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return price_this > price_other;
    }
}
