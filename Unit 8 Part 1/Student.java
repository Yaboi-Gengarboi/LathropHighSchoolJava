public class Student extends SchoolPerson
{
    private String[] schedule;
    public Student(String a, int b, String[] c)
    {
        super(a, b, "Student");
        schedule = c;
    }
    public String scheduleToString(String[] a)
    {
        String b = "";
        for (int i = 0; i < a.length; i++)
            b += (a[i] + " ");
        return b;
    }
    public String toString()
    {
        return super.toString() + "\nSchedule: " + scheduleToString(schedule);
    }
}
