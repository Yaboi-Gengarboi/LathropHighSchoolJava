public class Maintainer
{
    private String name;
    private int age;
    private double height;
    //Special
    private int IDB;
    public Maintainer(String a, int b, double c)
    {
        name = a;
        age = b;
        height = c;
    }
    public String toString()
    {
        return "Name: " + name + " Age: " + age + " Height: " + height;
    }
    public void setName(String a)
    {
        name = a;
    }
    public void setAge(int b)
    {
        age = b;
    }
    public void setHeight(double c)
    {
        height = c;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public void WakeBear(Bear a, Tool b)
    {
        a.wakeUp();
    }
    public void WakeOwl(Owl a, Tool b)
    {
        a.wakeUp();
    }
    public void WakeMoose(Moose a, Tool b)
    {
        a.wakeUp();
    }
    public void WakeWolf(Wolf a, Tool b)
    {
        a.wakeUp();
    }
    public void WakeEagle(Eagle a, Tool b)
    {
        a.wakeUp();
    }
    public void CleanBear(Bear a, Tool b, Cleaner c)
    {
        a.clean();
        c.take(20);
    }
    public void CleanOwl(Owl a, Tool b, Cleaner c)
    {
        a.clean();
        c.take(8);
    }
    public void CleanMoose(Moose a, Tool b, Cleaner c)
    {
        a.clean();
        c.take(15);
    }
    public void CleanWolf(Wolf a, Tool b, Cleaner c)
    {
        a.clean();
        c.take(12);
    }
    public void CleanEagle(Eagle a, Tool b, Cleaner c)
    {
        a.clean();
        c.take(10);
    }
}
    