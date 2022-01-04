import java.util.Scanner;

public class VowelDouble
{
   public static void main(String [] args)
   {
      System.out.print("Enter a word :");
      String word = new Scanner(System.in).next();
      
      String vowelDouble = "";
      // Insert your code here
      for(int l = 0; l<word.length();l++)
        {
            if (word.charAt(l) == "a" || (word.charAt(l)) == "e" || (word.charAt(l)) == "i" || (word.charAt(l)) == "u" || (word.charAt(l)) == "o") 
            {
                vowelDoubled = vowelDoubled + word.charAt(l) + word.charAt(l) 
            }
            else
            {
            	vowelDouble = vowelDouble + word.charAt(l)
            }
        }
      
      System.out.println("VowelDoubled is :" + vowelDouble + ":");
   }
}