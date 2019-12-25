/**For this program, it is assumed that
 * 1: Classwork is 15% of the semester grade.
 * 2: Homework is 40% of the semester grade.
 * 3: Quizes are 15% of the semester grade.
 * 4: Tests are 15% of the semester grade.
 * 5: Finals are 15% of the semester grade.
 */
import java.util.Scanner;
public class Grader
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int contA = 1;
        int contB = 1;
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        double sum4 = 0.0;
        double next = 0.0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        while (contA == 1)
        {
            System.out.println("Which type of assignment would you like to enter?");
            System.out.println("Classwork = 1");
            System.out.println("Homework = 2");
            System.out.println("Quiz = 3");
            System.out.println("Test = 4");
            int type = sc.nextInt();
            if (type == 1)
            {
                contB = 1;
                while (contB == 1)
                {
                    System.out.println("Enter a grade, in percent, for a classwork assignment. DO NOT include the % symbol.");
                    next = sc.nextDouble();
                    sum1 = sum1 + next;
                    count1++;
                    if (next > 89.0)
                    {
                        countA++;
                    }
                    else if (next < 89.0 && next > 79.0)
                    {
                        countB++;
                    }
                    else if (next < 79.0 && next > 69.0)
                    {
                        countC++;
                    }
                    else if (next < 69.0 && next > 59.0)
                    {
                        countD++;
                    }
                    else
                    {
                        countF++;
                    }
                    System.out.println("Would you like to continue entering classwork grades?");
                    System.out.println("1 = Yes");
                    System.out.println("0 = No");
                    contB = sc.nextInt();
                }
            }
            else if (type == 2)
            {
                contB = 1;
                while (contB == 1)
                {
                    System.out.println("Enter a grade, in percent, for homework assignment. DO NOT include the % symbol.");
                    next = sc.nextDouble();
                    sum2 = sum2 + next;
                    count2++;
                    if (next > 89.0)
                    {
                        countA++;
                    }
                    else if (next < 89.0 && next > 79.0)
                    {
                        countB++;
                    }
                    else if (next < 79.0 && next > 69.0)
                    {
                        countC++;
                    }
                    else if (next < 69.0 && next > 59.0)
                    {
                        countD++;
                    }
                    else
                    {
                        countF++;
                    }
                    System.out.println("Would you like to continue entering homework grades?");
                    System.out.println("1 = Yes");
                    System.out.println("0 = No");
                    contB = sc.nextInt();
                }
            }
            else if (type == 3)
            {
                contB = 1;
                while (contB == 1)
                {
                    System.out.println("Enter a grade, in percent, for quiz assignments. DO NOT include the % symbol.");
                    next = sc.nextDouble();
                    sum3 = sum3 + next;
                    count3++;
                    if (next > 89.0)
                    {
                        countA++;
                    }
                    else if (next < 89.0 && next > 79.0)
                    {
                        countB++;
                    }
                    else if (next < 79.0 && next > 69.0)
                    {
                        countC++;
                    }
                    else if (next < 69.0 && next > 59.0)
                    {
                        countD++;
                    }
                    else
                    {
                        countF++;
                    }
                    System.out.println("Would you like to continue entering quiz grades?");
                    System.out.println("1 = Yes");
                    System.out.println("0 = No");
                    contB = sc.nextInt();
                }
            }
            else if (type == 4)
            {
                contB = 1;
                while (contB == 1)
                {
                    System.out.println("Enter a grade, in percent, for test assignments. DO NOT include the % symbol.");
                    next = sc.nextDouble();
                    sum4 = sum4 + next;
                    count4++;
                    if (next > 89.0)
                    {
                        countA++;
                    }
                    else if (next < 89.0 && next > 79.0)
                    {
                        countB++;
                    }
                    else if (next < 79.0 && next > 69.0)
                    {
                        countC++;
                    }
                    else if (next < 69.0 && next > 59.0)
                    {
                        countD++;
                    }
                    else
                    {
                        countF++;
                    }
                    System.out.println("Would you like to continue entering test grades?");
                    System.out.println("1 = Yes");
                    System.out.println("0 = No");
                    contB = sc.nextInt();
                }
            }
            else
            {
                System.out.println("ERROR: NO ASSIGNMENT TYPE SELECTED");
            }
            System.out.println("Would you like to enter any more grades?");
            System.out.println("1 = Yes");
            System.out.println("0 = No");
            contA = sc.nextInt();
        }
        double mean1 = (sum1 / count1);
        double weight1 = mean1 * 0.15;
        double mean2 = (sum2 / count2);
        double weight2 = mean2 * 0.4;
        double  mean3 = (sum3 / count3);
        double weight3 = mean3 * 0.15;
        double mean4 = (sum4 / count4);
        double weight4 = mean4 * 0.15;
        double weightSum = weight1 + weight2 + weight3 + weight4;
        double current = weightSum * 1.176;
        double meanAll = ((mean1 + mean2 + mean3 + mean4)/4);
        System.out.printf("You entered %d classwork assignments \n", count1);
        System.out.printf("You entered %d homework assignments \n", count2);
        System.out.printf("You entered %d quiz assignments \n", count3);
        System.out.printf("You entered %d test assignments \n", count4);
        System.out.printf("%d of those were As \n", countA);
        System.out.printf("%d of those were Bs \n", countB);
        System.out.printf("%d of those were Cs \n", countC);
        System.out.printf("%d of those were Ds \n", countD);
        System.out.printf("%d of those were Fs \n", countF);
        System.out.println("The average for all classwork assignments is " + mean1 + "%");
        System.out.println("The average for all homework assignments is " + mean2 + "%");
        System.out.println("The average for all quiz assignments is " + mean3 + "%");
        System.out.println("The average for all test assignments is " + mean4 + "%");
        System.out.println("The average for all assignments is " + meanAll + "%");
        System.out.println("Your current grade is " + current + "%");
        System.out.println("What grade do you want for the end of the semester? Enter it as a percentage WITHOUT the % symbol.");
        double want = sc.nextDouble();
        double need = (want - weightSum) / 0.15;
        System.out.println("You need to score " + need + "% on the final to have a " + want + "% grade overall.");
    }
}
