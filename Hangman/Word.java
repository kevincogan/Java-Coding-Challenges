import java.util.*; 
public class Word
{
    public static String howManyCorrect(String word, String letter)
    {
        int count = 0;
        HashSet<String> set = new HashSet<String>();  
        String guesses = letter;
        String word = word;

        for(int l = 0; l<letter.length();l++)
        {
            set.add(letter.substring(l,1));
        }

        Iterator iterator = set.iterator();

        while(iterator.hasNext())
        {
            if (word.contains(iterator.next()))
            {
                count = count + 1;
            }

        }

        
        return count;
    }
}