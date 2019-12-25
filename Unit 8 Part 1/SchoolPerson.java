public class SchoolPerson
{
    private String name;
    private int age;
    private String role;
    public SchoolPerson(String a, int b, String c)
    {
        name = a;
        age = b;
        role = c;
    }
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age + "\nRole: " + role;
    }
}
