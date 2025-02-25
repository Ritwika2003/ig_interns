package insight_global.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread {

    // The run method will be executed by the thread
    @Override
    public void run() {
        while (true) {
            try {
                // Get current time
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                
                // Clear the console screen
                System.out.print("\033[H\033[2J"); 
                System.out.flush();
                
                // Print the time
                System.out.println("Current Time: " + currentTime);
                
                // Delay of 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted.");
            }
        }
    }
}

