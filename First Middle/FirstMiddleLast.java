import java.util.Scanner;
public class FirstMiddleLast
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = in.next();
		char first = word.charAt(0);
		String middle = word.substring(1, word.length() -1);
		char last = word.charAt(word.length() -1);

		System.out.println(last + middle + first);


	}
}