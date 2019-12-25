public class Moose
{
    private String name;
    private String sex;
    private int age;
    private double weight;
    //Special
    private boolean isHungry = false;
    private boolean isSleeping = false;
    private boolean isThirsty = false;
    private boolean isCageDirty = false;
    public Moose(String a, String b, int c, double d)
    {
        name = a;
        sex = b;
        age = c;
        weight = d;
    }
    public String toString()
    {
        return "Name: " + name + " Sex: " + sex + " Age: " + age + " Weight: " + weight + " Hungry? " + isHungry + " Sleeping? " + isSleeping + " Cage Dirty? " + isCageDirty;
    }
    public void setName(String a)
    {
        name = a;
    }
    public void setSex(String b)
    {
        sex = b;
    }
    public void setAge(int c)
    {
        age = c;
    }
    public void setWeight(double d)
    {
        weight = d;
    }
    public void setHungry(boolean e)
    {
        isHungry = e;
    }
    public void setSleeping(boolean f)
    {
        isSleeping = f;
    }
    public void setThirsty(boolean g)
    {
        isThirsty = g;
    }
    public void setCageDirty(boolean h)
    {
        isCageDirty = h;
    }
    public String getName()
    {
        return name;
    }
    public String getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }
    public boolean getHungry()
    {
        return isHungry;
    }
    public boolean getSleeping()
    {
        return isSleeping;
    }
    public boolean getThirsty()
    {
        return isThirsty;
    }
    public boolean getCageDirty()
    {
        return isCageDirty;
    }
    public void makeNoise()
    {
        if (isSleeping == false)
            System.out.println("Grunt!");
        else
            System.out.println("...... (" + name + " is asleep)");
    }
    public void birthday()
    {
        System.out.println("It's " + name + "'s birthday!");
        age++;
    }
    public void sleep()
    {
        System.out.println(name + " has fallen asleep.");
        isSleeping = true;
        weight -= Math.random();
    }
    public void feed()
    {
       if (isSleeping == true)
       {
           System.out.println(name + " was given food, but it is asleep!");
       }
       else if (isHungry == false)
       {
           System.out.println(name + " was given food, but it isn't hungry!");
       }
       else
       {
            System.out.println(name + " has eaten. It is now full!");
            isHungry = false;
            isCageDirty = true;
            weight += Math.random();
            double r = Math.random();
            if (r >= 0.9)
            {
                System.out.println(name + " is now tired and has fallen asleep!");
                isSleeping = true;
            }
            else if (r > 0.6 && r < 0.9)
            {
                System.out.println(name + " is now thirsty!");
                isThirsty = true;
            }
       }
    }
    public void drink()
    {
       if (isSleeping == true)
       {
           System.out.println(name + " was given water, but it is asleep!");
       }
       else if (isThirsty == false)
       {
           System.out.println(name + " was given water, but it isn't thirsty!");
       }
       else
       {
            System.out.println(name + " drank water. It is no longer thirsty!");
            isThirsty = false;
       }
    }
    public void wakeUp()
    {
        System.out.println(name + " has woken up!");
        isSleeping = false;
    }
    public void clean()
    {
        System.out.println(name + "'s cage is clean now!");
        isCageDirty = false;
    }
}