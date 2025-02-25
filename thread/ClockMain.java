package insight_global.thread;

public class ClockMain {
    public static void main(String[] args) {
        // Create and start the Clock thread
        Clock clock = new Clock();
        clock.start();
    }
}
