import java.util.Timer;
import java.util.TimerTask;
public class TimerPractice
{
    int s = 0; 
    Timer timer = new Timer();
    TimerTask timertask = new TimerTask()
    {
    
        public void run()
        {
            s++;
            System.out.println("Seconds passed: " + s);
        }
    };
    public void start()
    {
        timer.scheduleAtFixedRate(timertask,1000,1000);
        //1000 milliseconds
    }
    public static void main(String[] args)
    {
        TimerPractice tydetyme = new TimerPractice();
        tydetyme.start();
    }
}