public class Sort
{
   private static <Gen extends Comparable <Gen>> void swap(Gen []s, int i, int j) // CHANGE This
   {
      Gen tmp = s[i]; // CHANGE This
      s[i] = s[j];
      s[j] = tmp;
   }

   public static <Gen extends Comparable <Gen>> void sort(Gen[] items) // CHANGE This
   {
      // Use selection sort
      for(int i = 0; i < items.length - 1; i++)
      {
         int minIndex = i;
         for(int j = i + 1; j < items.length; j++)
            if(items[j].compareTo(items[minIndex]) < 0) // items[j] < items[minIndex] ... so update minIndex
               minIndex = j;

         swap(items, i, minIndex);
      }
   }
}