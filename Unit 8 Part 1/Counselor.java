public class Counselor extends SchoolPerson
{
    private char[] studentRange;
    public Counselor(String a, int b, char[] c)
    {
        super(a, b, "Counselor");
        studentRange = c;
    }
    public String studentRangeToString(char[] a)
    {
        String b = a[0] + " - " + a[1];
        return b;
    }
    public String toString()
    {
        return super.toString() + "\nStudent Range: " + studentRangeToString(studentRange);
    }
}
