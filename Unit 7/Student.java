public class Student
{
    private int age; private double gpa; private String name;
    public Student(int x, double y, String z)
    {
        age = x; gpa = y; name = z;
    }
    public void setAge(int x)
    {
        age = x;
    }
    public void setGPA(double y)
    {
        gpa = y;
    }
    public void setName(String z)
    {
        name = z;
    }
    public int getAge()
    {
        return age;
    }
    public double getGPA()
    {
        return gpa;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return name + " " + age + " " + gpa;
    }
}
