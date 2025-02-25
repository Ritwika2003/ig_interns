package insight_global.thread;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConferenceRoomBookingJob {
    private boolean roomAvailable = true;
    private final Lock roomLock = new ReentrantLock();

    // Check if the room is available
    public boolean checkAvailability() {
        return roomAvailable;
    }

    // Try to book the room if available
    public boolean bookRoom() {
        roomLock.lock();  // Locking to prevent race conditions
        try {
            if (roomAvailable) {
                System.out.println("Room is available. Booking the room...");
                roomAvailable = false; // Mark room as booked
                return true;
            } else {
                return false;
            }
        } finally {
            roomLock.unlock();  // Unlocking after the operation
        }
    }

    // Release the room after use
    public void releaseRoom() {
        roomLock.lock();  // Locking before changing room availability
        try {
            System.out.println("Meeting finished. Releasing the room...");
            roomAvailable = true; // Mark room as available again
        } finally {
            roomLock.unlock();  // Unlocking after the operation
        }
    }

    // Simulate the meeting being conducted
    public void conductMeeting() {
        System.out.println("Conducting the meeting...");
        try {
            Thread.sleep(2000); // Simulate the time taken for the meeting
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Meeting is over.");
    }
}

