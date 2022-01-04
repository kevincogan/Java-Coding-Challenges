import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Customer {
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name, List<Rental> l){
        _name = name;
        _rentals = l;
    }
    
    public String getName()
    {
        return _name;
    }
    
    public List<Rental> getRentals()
    {
        return _rentals;
    }
    
    public String toString()
    {
        return _name + ": " + _rentals;
    }
///////////////////////////////////////////////////////////////////////////////////////////
    public String statement(){
        String result = "";
        double totalAmount = 0;
        int frequentRenterPoints = 0;
///////////////////////////////////////////////////////////////////////////////////////////
        for (Rental single_rental : _rentals)
        {
            double price_now = 0;
            price_now = getTotal(single_rental);

            frequentRenterPoints = frequentRenterPoints + 1;
            if ((single_rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && single_rental.getDaysRented()>1){frequentRenterPoints = frequentRenterPoints + 1;}
            result = result + "  " + single_rental.getMovie().getTitle() + "  " + String.valueOf(price_now ) + "\n";
            totalAmount = totalAmount + price_now ;
        }
        result = result + "Amount owed is " + String.valueOf(totalAmount) +"\n";
        result = result + "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points"+"\n";
        return result;
    }

    public double getTotal(Rental single_rental){
        double total = 0;
        switch(single_rental.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    total += 2;
                    if(single_rental.getDaysRented() > 2){
                        total+= (single_rental.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    total = total + single_rental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    total = total + 1.5;
                    if (single_rental.getDaysRented() > 3){
                        total = total + (single_rental.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
        return total;
    }

}