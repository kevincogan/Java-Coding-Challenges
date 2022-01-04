public class Test
{
    // Create a static method called countFives which returns the number of fives in the array
    static int countEven(int [] num)
    {
        int count = 0;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] % 2 == 0)
                count++;
        }
        return count;
    }
}