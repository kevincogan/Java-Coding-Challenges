public class ReverseArgs
{
    public static void main(String [] args)
    {
    	int sum = 0;
        for(int i = args.length - 1; i >= 0; i--)
        {
        	int num = Integer.parseInt(args[i]);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}