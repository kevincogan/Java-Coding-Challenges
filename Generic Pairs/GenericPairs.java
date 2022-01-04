public class Pair <Item,Other>
{
    Item item;
    Other other;
    public Pair(Item a, Other b)
    {
        this.item = a;
        this.other = b;
    }
    public String toString()
    {
        return(String.valueOf(this.item) + " " + String.valueOf(this.other));
    }
}