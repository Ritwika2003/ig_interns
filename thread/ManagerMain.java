package insight_global.thread;

public class ManagerMain {
    public static void main(String[] args) {
        // Create the shared ConferenceRoomBookingJob instance
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();

        // Create two manager threads
        Manager manager1 = new Manager("Manager 1", bookingJob);
        Manager manager2 = new Manager("Manager 2", bookingJob);

        // Start both manager threads
        manager1.start();
        manager2.start();

        // Wait for both threads to finish
        try {
            manager1.join();
            manager2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both managers have completed their tasks.");
    }
}

