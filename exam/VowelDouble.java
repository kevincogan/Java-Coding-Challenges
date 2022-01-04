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
            if (word.substring(l, l+1).equals("a") || (word.substring(l, l+1)).equals("e") || (word.substring(l, l+1)).equals("i") || (word.substring(l, l+1)).equals("u") || (word.substring(l, l+1)).equals("o") || word.substring(l, l+1).equals("A") || (word.substring(l, l+1)).equals("E") || (word.substring(l, l+1)).equals("I") || (word.substring(l, l+1)).equals("U") || (word.substring(l, l+1)).equals("O")) 
            {
                vowelDouble = vowelDouble + word.substring(l, l+1) + word.substring(l, l+1);
            }
            else
            {
            	vowelDouble = vowelDouble + word.substring(l, l+1);
            }
        }
      
      System.out.println("VowelDoubled is :" + vowelDouble + ":");
   }
}