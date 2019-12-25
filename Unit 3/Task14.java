import java.util.Scanner;
public class Task14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Day");
        String day = sc.next();
        if (day.equals("Monday"))
        {
            System.out.println("Wake up at 6:30.");
            System.out.println("(7:45) 1st period: Excused.");
            System.out.println("(8:45) 2nd period: AP Computer Science.");
            System.out.println("(9:45) 3rd period: US Government.");
            System.out.println("(10:38) Lunch.");
            System.out.println("(11:15) 4th period: Early British Literature.");
            System.out.println("(12:15) 5th period: Psychology.");
            System.out.println("(1:15) 6th period: AP Statistics.");
            System.out.println("(2:15) Go home!");
            System.out.println("Make sure you wrote down what your homework is.");
            System.out.println("(9:00) Get ready for bed.");
            System.out.println("(10:00) Go to sleep.");
        }
        else if (day.equals("Tuesday"))
        {
            System.out.println("Wake up at 6:30.");
            System.out.println("(7:45) 1st period: Excused.");
            System.out.println("(9:07) SSP.");
            System.out.println("(9:45) 2nd period: AP Computer Science.");
            System.out.println("(10:59) Lunch.");
            System.out.println("(11:38) 4th period: Early British Literature.");
            System.out.println("(12:53) 5th period: Psychology.");
            System.out.println("(2:15) Go home!");
            System.out.println("(4:00) Check the Shrine of Secrets for Dead By Daylight.");
            System.out.println("(9:00) Get ready for bed.");
            System.out.println("(10:00) Go to sleep.");
        }
        else if (day.equals("Wednesday"))
        {
            System.out.println("Wake up at 6:30.");
            System.out.println("(7:45) 2nd period: AP Computer Science.");
            System.out.println("(9:07) SSP.");
            System.out.println("(9:45) 3rd period: US Government.");
            System.out.println("(10:59) Lunch.");
            System.out.println("(11:38) 5th period: Psychology.");
            System.out.println("(12:53) 6th period: AP Statistics.");
            System.out.println("(2:15) Go to Group Caounceling.");
            System.out.println("(5:00) Go home!");
            System.out.println("(9:00) Get ready for bed.");
            System.out.println("(10:00) Go to sleep.");
        }
        else if (day.equals("Thursday"))
        {
            System.out.println("Wake up at 6:30.");
            System.out.println("(7:45) 1st period: Excused.");
            System.out.println("(9:07) SSP.");
            System.out.println("(9:45) 3rd period: US Government.");
            System.out.println("(10:59) Lunch.");
            System.out.println("(11:38) 4th period: Early British Literature.");
            System.out.println("(12:53) 6th period: AP Statistics.");
            System.out.println("(2:15) Go home!");
            System.out.println("Make sure you have the Current Events done for US Government.");
            System.out.println("(9:00) Get ready for bed.");
            System.out.println("(10:00) Go to sleep.");
        }
        else if (day.equals("Friday"))
        {
            System.out.println("Wake up at 6:30.");
            System.out.println("(7:45) 1st period: Excused.");
            System.out.println("(8:45) 2nd period: AP Computer Science.");
            System.out.println("(9:45) 3rd period: US Government.");
            System.out.println("(10:38) Lunch.");
            System.out.println("(11:15) 4th period: Early British Literature.");
            System.out.println("(12:15) 5th period: Psychology.");
            System.out.println("(1:15) 6th period: AP Statistics.");
            System.out.println("(2:15) Go to counceling.");
            System.out.println("(4:00) Go home!");
            System.out.println("(9:00) Get ready for bed.");
            System.out.println("(10:00) Go to sleep.");
        }
        else if (day.equals("Saturday"))
        {
            System.out.println("Just remember do do your homework and then have fun!");
            System.out.println("Make sure you know your work schedule for next week.");
        }
        else if (day.equals("Sunday"))
        {
            System.out.println("Just remember do do your homework and then have fun!");
            System.out.println("Prepare for school tomorrow.");
        }
    }
}
