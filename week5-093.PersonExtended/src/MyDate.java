public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month
                && this.day < compared.day;
    }
    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate){        
        int difference_days = this.day - comparedDate.day;
        
        int difference_moths = this.month - comparedDate.month;
        
        int difference_years = this.year - comparedDate.year;
        
        int difference_in_years = (difference_days + (difference_moths) * 30 + (difference_years) * 360) / 360;
        
        if (difference_in_years < 0)
            difference_in_years *= -1;          
        
        return difference_in_years;
    }
}
