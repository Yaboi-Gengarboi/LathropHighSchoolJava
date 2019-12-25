import java.util.Scanner;
public class TicTacToe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char grid[][] = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        int cont = 1;
        int cont2 = 1;
        int cont3 = 1;
        int pl = 0;
        int row = 0;
        int col = 0;
        while (cont == 1)
        {
            pl = (int)Math.ceil(Math.random()*2);
            while (cont2 == 1)
            {
                System.out.println("   1  2  3");
                for (int i = 0; i < 3; i++)
                {
                    System.out.print(i+1);
                    for (int p = 0; p < 3; p++)
                        System.out.print("  " + grid[i][p]);
                    System.out.println();
                }
                cont2 = 1;
                cont3 = 1;
                while (cont3 == 1)
                {
                    System.out.print("Player " + pl + ", select a row: ");
                    row = sc.nextInt()-1;
                    System.out.print("Select a column: ");
                    col = sc.nextInt()-1;
                    //Check Grid
                    if (row > 2 || row < 0)
                        System.out.println("You have selected an out-of-bounds row!");
                    else if (col > 2 || row < 0)
                        System.out.println("You have selected an out-of-bounds column!");
                    else if (grid[row][col] != '_')
                        System.out.println("This space is already taken!");
                    else
                    {
                        if (pl == 1)
                        {
                            grid[row][col] = 'X';
                            cont3 = 0;
                        }
                        else
                        {
                            grid[row][col] = 'O';
                            cont3 = 0;
                        }
                    }
                }
                //Check Win
                for (int s = 0; s < 3; s++)
                {
                    if (grid[s][0] == grid[s][1] && grid[s][0] == grid[s][2])
                    {
                        if (grid[s][0] == 'X')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 1 wins!");
                            cont2 = 0;
                        }
                        else if (grid[s][0] == 'O')
                        {
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 2 wins!");
                            cont2 = 0;
                        }
                    }
                    else if (grid[0][s] == grid[1][s] && grid[0][s] == grid[2][s])
                    {
                        if (grid[0][s] == 'X')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 1 wins!");
                            cont2 = 0;
                        }
                        else if (grid[0][s] == 'O')
                        {
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 2 wins!");
                            cont2 = 0;
                        }
                    }
                    else if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2])
                    {
                        if (grid[0][0] == 'X')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 1 wins!");
                            cont2 = 0;
                        }
                        else if (grid[0][0] == 'O')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 2 wins!");
                            cont2 = 0;
                        }
                    }
                    else if (grid[0][2] == grid[1][1] && grid[0][0] == grid[2][0])
                    {
                        if (grid[0][2] == 'X')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 1 wins!");
                            cont2 = 0;
                        }
                        else if (grid[0][2] == 'O')
                        {
                            System.out.println("   1  2  3");
                            for (int i = 0; i < 3; i++)
                            {
                                System.out.print(i+1);
                                for (int p = 0; p < 3; p++)
                                System.out.print("  " + grid[i][p]);
                                System.out.println();
                            }
                            System.out.println("Player 2 wins!");
                            cont2 = 0;
                        }
                    }
                }
                if (pl == 1)
                    pl++;
                else 
                    pl--;
            }
            System.out.println("Would you like to play again? Enter 1 for yes.");
            cont = sc.nextInt();
            for (int i = 0; i < 3; i++)
            {
                for (int p = 0; p < 3; p++)
                    grid[i][p] = '_';
            }
        }
    }
}
