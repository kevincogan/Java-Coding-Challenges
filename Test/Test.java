public class Test
{
	public static int[] reverse( int [] num)
	{
		int i;
		int tmp;
		for (i = 0; i < num.length/2 ;i++ )
		{
			tmp = num[i];
			num[i] = num[num.length -i -1];
			num[num.length -i -1] = tmp;
		}
		return num;
	}
}