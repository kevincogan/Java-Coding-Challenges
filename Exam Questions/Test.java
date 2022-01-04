public class Test
{
   public static void printForties(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
      	if (student[i].getMark() >= 40 ) 
      	{
      		System.out.println(student[i].getMark() + " " + "(" + student[i].getName() + ")");
      	}
   }
   public static int numberPasses(Student [] student)
   {
   		int count = 0;
   		for(int i = 0; i < student.length ; i++)
   			if(student[i].getMark() >= 40)
   			 {
   			 	count = count + 1;
   			 }
   		return count;

   }

   public static int getBestStudent()
   {
   		int position
   }
}