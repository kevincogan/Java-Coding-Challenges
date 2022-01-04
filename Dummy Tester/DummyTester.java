class DummyTester extends Customer
{
    public DummyTester(String name, List<Rental> list)
    {
        super(name, list);
    }
    
    // Note that we can only do this if getTotal exists in the parent class (Customer)
    public double getTotal(Rental rental)
    {
        return super.getTotal(rental) * 2;  // Just double the charge!
    }
}