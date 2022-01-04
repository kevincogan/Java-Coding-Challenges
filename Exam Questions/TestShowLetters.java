
import java.util.Scanner;

public class TestShowLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and some guesses
        System.out.print("Enter a word and some guesses: ");
        String word = in.next();
        
        System.out.print(word.substring(5,5));
    }
}