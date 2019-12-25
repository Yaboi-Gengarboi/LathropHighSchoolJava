public class Teacher extends SchoolPerson
{
    private int room;
    public Teacher(String a, int b, int c)
    {
        super(a, b, "Teacher");
        room = c;
    }
    public String toString()
    {
        return super.toString() + "\nRoom: " + room;
    }
}
