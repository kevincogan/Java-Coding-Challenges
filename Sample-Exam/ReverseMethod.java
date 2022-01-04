public class Test
{
    // Create a static method called countFives which returns the number of fives in the array
    static int[] reverse(int [] num)
    {
        int j = 0;
        for(int i=0; i<num.length/2; i++){
  int temp = num[i];
  num[i] = num[num.length -i -1];
  num[num.length -i -1] = temp;
}
        return num;
    }
}