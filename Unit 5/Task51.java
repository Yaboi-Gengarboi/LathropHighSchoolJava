import java.util.Scanner;
public class Task51
{
    public static void main(String[] args)
    {
        int xLoc = 2;
        int yLoc = 2;
        int cont = 1;
        String input = "";
        Scanner sc = new Scanner(System.in);
        char[][]grid = {{'_','_','_','_','_'},{'_','_','_','_','_'},{'_','_','X','_','_'},{'_','_','_','_','_'},{'_','_','_','_','_'}};
        for (int i = 0; i < 5; i++)
        {
            for (int p = 0; p < 5; p++)
            {
                System.out.print(grid[i][p] + " ");
            }
            System.out.println();
        }
        while (cont == 1)
        {
            System.out.println("Enter left, right, up or down");
            input = sc.next();
            //Bounds control and movement
            if (input.equals("up"))
            {
                if (yLoc == 0)
                    System.out.println("You cannot move up!");
                else
                {
                    grid[yLoc][xLoc] = '_';
                    grid[yLoc-1][xLoc] = 'X';
                    yLoc--;
                }
            }
            else if (input.equals("left"))
            {
                if (xLoc == 0)
                    System.out.println("You cannot move left!");
                else
                {
                    grid[yLoc][xLoc] = '_';
                    grid[yLoc][xLoc-1] = 'X';
                    xLoc--;
                }
            }
            else if (input.equals("down"))
            {
                if (yLoc == 4)
                    System.out.println("You cannot move down!");
                else
                {
                    grid[yLoc][xLoc] = '_';
                    grid[yLoc+1][xLoc] = 'X';
                    yLoc++;
                }
            }
            else if (input.equals("right"))
            {
                if (xLoc == 4)
                    System.out.println("You cannot move right!");
                else
                {
                    grid[yLoc][xLoc] = '_';
                    grid[yLoc][xLoc+1] = 'X';
                    xLoc++;
                }
            }
            //Bounds control and movement
            for (int i = 0; i < 5; i++)
            {
                for (int p = 0; p < 5; p++)
                {
                    System.out.print(grid[i][p] + " ");
                }
                System.out.println();
            }
            System.out.print("Continue? (Enter 1 for yes) ");
            cont = sc.nextInt();
        }
    }
}