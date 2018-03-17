public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
    
    public int differenceInYears(MyDate comparedDate){
        int days_in_year = 365;
        
        int difference_days = this.day - comparedDate.day;
        int difference_moths = this.month - comparedDate.month;
        int difference_years = this.year - comparedDate.year;
        
        int difference_in_years = (difference_days + difference_moths * 30 + difference_years * 365) / 365;
        
        if (difference_in_years < 0)
            difference_in_years *= -1;
        
        return difference_in_years;
    }

}
