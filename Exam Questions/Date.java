public class Date
{
    private int day;
    private int month;
    private int year;

    public int Date(String date)
    {
    	String[] date = sdate.split(" ");
    	day = Integer.parseInt(date[0]);
    	month = 1;
    	year = 2000;
    }

    public int Date(int day, int month, int year)
    {
    	day = day;
    	month = month;
    	year = year;
    }

    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    Date bigBomb = new Date(6, 8, 1945);
    System.out.println(bigBomb);
}