public class SchoolPersonTest
{
    public static void main(String[] args)
    {
        String[] arr1 = {"Modern Brit Lit", "Excused", "AP Computer Science", "Economics", "Creative Writing", "AP Statistics"};
        Student Justyn = new Student("Justyn", 17, arr1);
        Teacher Benshoof = new Teacher("Benshoof", 30, 169);
        char[] arr2 = {'A', 'E'};
        Counselor Mangano = new Counselor("Mangano", 30, arr2);
        Principal Carly = new Principal("Carly", 30, true);
        System.out.println(Justyn.toString());
        System.out.println(Benshoof.toString());
        System.out.println(Mangano.toString());
        System.out.println(Carly.toString());
    }
}
