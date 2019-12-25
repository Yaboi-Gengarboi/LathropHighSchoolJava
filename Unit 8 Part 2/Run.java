public class Run
{
    public static void printArr(int[] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++)
            out += arr[i] + " ";
        System.out.println(out);
    }
    public static void printArr(double[] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++)
            out += arr[i] + " ";
        System.out.println(out);
    }
    public static void printArr(char[] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++)
            out += arr[i] + " ";
        System.out.println(out);
    }
    public static void main(String[] args)
    {
        Student SuperJustyn = new Student("SuperJustyn", "Male", 17, 5.0);
        double[] dat = {0,1,2,3,4,5,6,7,8,9,10};
        printArr(SuperJustyn.boxStats(dat));
    }
}
