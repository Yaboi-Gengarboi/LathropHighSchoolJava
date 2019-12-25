//Task28
public class School
{
    private String name;
    private String location;
    private int age;
    private int studentCount;
    private int staffCount;
    private int subjectCount;
    private double area;
    private double gradRate;
    private boolean isOpen;
    private boolean isPrivate;
    public School(String a, String b, int c, int d, int e, int f, double g, double h, boolean i, boolean j)
    {
        name = a;
        location = b;
        age = c;
        studentCount = d;
        staffCount = e;
        subjectCount = f;
        area = g;
        gradRate = h;
        isOpen = i;
        isPrivate = j;
    }
    public String printA()
    {
        return "Name: " + name;
    }
    public String printB()
    {
        return "Location: " + location;
    }
    public String printC()
    {
        return "Age: " + age;
    }
    public String printD()
    {
        return "Amount of Students: " + studentCount;
    }
    public String printE()
    {
        return "Amount of Staff: " + staffCount;
    }
    public String printF()
    {
        return "Amount of Subjects: " + subjectCount;
    }
    public String printG()
    {
        return "Area: " + area;
    }
    public String printH()
    {
        return "Graduation Rate: " + gradRate;
    }
    public String printI()
    {
        return "Is it Open? " + isOpen;
    }
    public String printJ()
    {
        return "Is it a Private School? " + isPrivate;
    }
}
