public class Principal extends SchoolPerson
{
    private boolean isBusy;
    public Principal(String a, int b, boolean c)
    {
        super(a, b, "Principal");
        isBusy = c;
    }
    public String toString()
    {
        return super.toString() + "\nBusy? " + isBusy;
    }
}
