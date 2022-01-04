import java.util.Scanner;
public class SplitWord
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String word = in.next();
		int i;
		char none = "";
		char word1 = word.charAt(i);
		char word2 = word.charAt(i + 1);
		while (word2 != none)
		{
			System.out.println(word1 + word2);
			i++;
			word1 = word.charAt(i);
			word2 = word.charAt(i + 1);
		}
	}
}