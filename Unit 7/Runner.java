import java.util.ArrayList;
public class Runner
{
    public static void main(String[] args)
    {
        ArrayList<Student> Students = new ArrayList<>();
        Student James = new Student(16, 3.8, "James");
        Student Megan = new Student(17, 3.4, "Megan");
        Student Dewila = new Student(15, 3.9, "Dewila");
        Student Zachary = new Student(17, 3.1, "Zachary");
        Student Angelo = new Student(18, 3.2, "Angelo");
        Student Arthur = new Student(18, 3.5, "Arthur");
        Students.add(James);
        Students.add(Megan);
        Students.add(Dewila);
        Students.add(Zachary);
        Students.add(Angelo);
        Students.add(Arthur);
        System.out.println(Students);
        
        ArrayList<ZooAnimal> Animals = new ArrayList<>();
        ZooAnimal Harambe = new ZooAnimal("Harambe", "Gorilla", "Dead");
        ZooAnimal Yeetus = new ZooAnimal("Yeetus", "Elephant", "Male");
        ZooAnimal EagleFlies = new ZooAnimal("EagleFlies", "Eagle", "Male");
        ZooAnimal Googoo = new ZooAnimal("Googoo", "Chimpanzee", "Female");
        ZooAnimal Jessie = new ZooAnimal("Jessie", "Hippo", "Female");
        ZooAnimal Amber = new ZooAnimal("Amber", "Lion", "Female");
        Animals.add(Harambe);
        Animals.add(Yeetus);
        Animals.add(EagleFlies);
        Animals.add(Googoo);
        Animals.add(Jessie);
        Animals.add(Amber);
        System.out.println(Animals);
    }
}
