import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
   public static void main(String [] args)
   {
       Movie [] movies = { new Movie("James Bond does Java", Movie.NEW_RELEASE), new Movie("Mickey Mouse", Movie.CHILDRENS), new Movie("The Pointer Sisters", Movie.REGULAR)};
       Rental [] rentalsArray = { new Rental(movies[0], 1), new Rental(movies[1], 10), new Rental(movies[2], 2)};
       
       List<Rental> rentals = new ArrayList<Rental>(Arrays.asList(rentalsArray));
       
       Customer donald = new Customer("Donald", rentals);
       
       System.out.println(donald.getName());
       System.out.println(donald.getRentals());
       System.out.println(donald); // test the toString() method.
       
       System.out.println("\nYour statement:");
       System.out.print(donald.statement());  // NB "\n" in the statement() function so not in println!
       
       DummyTester bernie = new DummyTester("Bernie", rentals);
       
       System.out.println("\nBernie's statement:");
       System.out.print(bernie.statement());  // NB "\n" in the statement() function so not in println!
   }
}