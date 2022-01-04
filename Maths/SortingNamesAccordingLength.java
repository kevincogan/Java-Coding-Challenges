// Modify this class so that it implements the Order interface
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "Cat: " + name;
    }
    
    public boolean lessThan(Order p)
    {
        Cat min = (Cat) p;
        if(name.length() < min.name.length())
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}