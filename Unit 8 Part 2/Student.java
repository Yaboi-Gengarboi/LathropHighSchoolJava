import java.util.Arrays;
public class Student implements Musician, Athlete, Mathematician, Artist, Employee
{
    private String name;
    private String sex;
    private int age;
    private double gpa;
    public Student(String a, String b, int c, double d)
    {
        name = a;
        sex = b;
        age = c;
        gpa = d;
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
    public void setGPA(int d)
    {
        gpa = d;
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
    public double getGPA()
    {
        return gpa;
    }
    public String playMusic()
    {
        String out = "";
        out += "May I, stand unshaken?";
        out += "\n\nAmid, amidst a crash of worlds?";
        out += "\nDid I hear a thunder?";
        out += "\nDid I hear you break?";
        out += "\nI can't quite remember";
        out += "\nJust what guided me this way";
        out += "\n\nMay I, stand unshaken?";
        out += "\nAmid, amidst a crash of worlds?";
        return out;
    }
    public String readMusic()
    {
        String notes = "";
        String alph = "ABCDEFG";
        for (int i = 0; i < 15; i++)
            notes += alph.charAt((int)(Math.floor(7*Math.random()))) + " ";
        return notes;
    }
    public String instrument()
    {
        String instrument = "";
        double x = Math.random();
        if (x < .25)
            instrument = "Guitar";
        else if (x < .5)
            instrument = "Trumpet";
        else if (x < .75)    
            instrument = "Flute";
        else if (x < 1)
            instrument = "Drums";
        return instrument;
    }
    public double runLap()
    {
        double time = 60.0;
        double dev = 20*Math.random() - 10;
        time += dev;
        return time;
    }
    public int liftWeight()
    {
        int weight = 10;
        int dev = (int)(Math.floor(50*Math.random()));
        return weight;
    }
    public double[] yeet()
    {
        double[] dat = new double[2];
        dat[0] = 10.0 + 50*Math.random();
        dat[1] = dat[0] / 4;
        return dat;
    }
    public double[] quadratic(double a, double b, double c)
    {
        double[] d = new double[2];
        double x = Math.pow(b, 2) - 4 * a * c;
        if (x < 0)
        {
            System.out.println("No x-intercepts calculated");
            return d;
        }
        d[0] = -b + (Math.sqrt(x)) / (2 * a);
        d[1] = -b - (Math.sqrt(x)) / (2 * a);
        return d;
    }
    public double[] force(double a, double b)
    {
        double[] force = new double[2];
        b *= (Math.PI / 180);
        force[0] = a * Math.cos(b);
        force[1] = a * Math.sin(b);
        return force;
    }
    public double sampleStandardDeviation(double[] a)
    {
        double sum = 0, sD = 0.0, var = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        double mean = sum/a.length;
        for (int i = 0; i < a.length; i++)
            var += Math.pow((a[i] - mean), 2);
        var = var/(a.length - 1);
        sD = Math.sqrt(var);
        sD = (double)(Math.round(sD * 10000d) / 10000d);
        return sD;
    }
    public double mean(double a, double b)
    {
        double mean = (a + b) / 2;
        return mean;
    }
    public double[] boxStats(double[] data)
    {
        double[] stats = new double[5];
        double[] newData = data;
        Arrays.sort(newData);
        int L; int midL;
        L = newData.length;
        stats[0] = newData[0];
        stats[4] = newData[L - 1];
        if (L % 2 == 0)
        {
            stats[2] = mean(newData[L / 2], newData[L / 2 - 1]);
            midL = L / 2;
            if (midL % 2 == 0)
            {
                stats[1] = mean(newData[midL / 2], newData[midL / 2 - 1]);
                stats[3] = mean(newData[midL + midL / 2], newData[midL + midL / 2 - 1]);
            }
            else
            {
                stats[1] = newData[midL / 2];
            }
        }
        else
        {
            stats[2] = newData[L / 2];
            midL = L / 2;
            if (midL % 2 == 0)
            {
                stats[1] = mean(newData[midL / 2], newData[midL / 2 - 1]);
                stats[3] = newData[midL + midL / 2 + 1];
            }
            else
            {
                stats[1] = newData[midL / 2];
                stats[3] = newData[midL + midL / 2 + 1];
            }
        }
        return stats;
    }
    public void drawCircle()
    {
        //Draw a circle
    }
    public void drawRectangle()
    {
        //Draw a rectangle
    }
    public void drawTriangle()
    {
        //Draw a triangle
    }
    public void drawPentagon()
    {
        //Draw a pentagon
    }
    public void drawHexagon()
    {
        //Draw a hexagon
    }
    public void dropFry()
    {
        //Drop fry basket
    }
    public void dropGrillmeat()
    {
        //Drop grill meat
    }
    public void dropBackmeat()
    {
        //Drop backwall meat
    }
    public void makeSandwich()
    {
        //make sandwich
    }
    public void mopFloor()
    {
        //Mop floor
    }
    public void takeOrder()
    {
        //Take order
    }
    public String toString()
    {
        String out = "";
        out += "Name: " + name;
        out += "\nSex: " + sex;
        out += "\nAge: " + age;
        out += "\nGPA: " + gpa;
        return out;
    }
}
