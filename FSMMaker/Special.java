import java.io.*;
import java.util.ArrayList;

public class Special
{
    /**
     * Takes a String containing an int and converts it to IEEE 574 format Hex
     * Requires a String input.
     * Can be called with Special.toHex(str);
     */
    public static String toHex(String str)
    {
        String h = "";
        float f = Float.parseFloat(str);
        int i = Float.floatToIntBits(f);
        h = Integer.toHexString(i).toUpperCase();
        return h;
    }
    /**
     * Requires an ArrayList<String> input.
     * Can be called with Special.sortFSMList(ArrayList<String> list, ArrayList<String> list2);
     */
    public static void sortFSMList(ArrayList<String> list, ArrayList<String> list2)
    {
        int a, b; String t;
        for (int i = 0; i < list.size() - 1; i++)
        {
            if (list.get(i).equals(list.get(i+1))) 
            //Checks if FSMs are duplicates, removes if so
            {
                list.remove(i);
                list2.remove(i);
                sortFSMList(list, list2);
            }
            else
            {
                //This sequence compares the characters of 2 FSMs
                //The first byte of an FSM (0 and 1) represent a character ID
                t = list.get(i);
                t = t.substring(0, 2);
                t = t.toLowerCase();
                a = Integer.parseInt(t, 16);
                t = list.get(i+1);
                t = t.substring(0, 2);
                t = t.toLowerCase();
                b = Integer.parseInt(t, 16);
                if (a > b)
                {
                    list.add(i, list.remove(i + 1));
                    list2.add(i, list2.remove(i + 1));
                    sortFSMList(list, list2);
                }
                else if (a == b)
                {
                    t = list.get(i);
                    t = t.substring(5, 8);
                    t = t.toLowerCase();
                    a = Integer.parseInt(t, 16);
                    t = list.get(i+1);
                    t = t.substring(5, 8);
                    t = t.toLowerCase();
                    b = Integer.parseInt(t, 16);
                    if (a > b)
                    {
                        list.add(i, list.remove(i + 1));
                        list2.add(i, list2.remove(i + 1));
                        sortFSMList(list, list2);
                    }
                    else if (a == b)
                    {
                        t = list.get(i);
                        t = t.substring(2, 4);
                        t = t.toLowerCase();
                        a = Integer.parseInt(t, 16);
                        t = list.get(i+1);
                        t = t.substring(2, 4);
                        t = t.toLowerCase();
                        b = Integer.parseInt(t, 16);
                        if (a < b)
                        {
                            list.add(i, list.remove(i + 1));
                            list2.add(i, list2.remove(i + 1));
                            sortFSMList(list, list2);
                        }
                    }
                }
            }
        }
    }
    /**
     * Creats text file for FSMs if it does not exist and writes FSMs to it.
     * If the file does exist, it will add on the FSMs to the list.
     * Requires an ArrayList<String> input.
     * Can be called with Special.createFile(ArrayList<String> fsmList, ArrayList<String> sfsmList);
     */
    public static void createFile(ArrayList<String> fsmList, ArrayList<String> sfsmList)
    {
        File file = new File("FSM.txt");
        if (!file.exists())
        {
            try
            {
                file.createNewFile();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                for (int i = 0; i < fsmList.size(); i++)
                {
                    if (i % 2 == 0)
                        writer.write(fsmList.get(i));
                    else if (i % 2 == 1)
                    {
                        writer.write(fsmList.get(i));
                        writer.newLine();
                    }
                }
                writer.newLine();
                writer.newLine();
                writer.newLine();
                for (int i = 0; i < sfsmList.size(); i++)
                {
                    if (i % 2 == 0)
                        writer.write(sfsmList.get(i) + "   ");
                    else if (i % 2 == 1)
                    {
                        writer.write(sfsmList.get(i));
                        writer.newLine();
                    }
                }
                writer.close();
            }
            catch(IOException ioe)
            {
                System.out.print("Error: " + ioe);
            }
        }
        else if (file.exists())
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                String line = reader.readLine();
                while (line != null)
                {
                    fsmList.add(line.substring(0, 16));
                    fsmList.add(line.substring(16, 32));
                    line = reader.readLine();
                }
                Special.sortFSMList(fsmList, sfsmList);
                reader.close();
                writer.close();
                file.delete();
                createFile(fsmList, sfsmList);
            }
            catch(IOException ioe)
            {
                System.out.print("Error: " + ioe);
            }
        }
    }
}
