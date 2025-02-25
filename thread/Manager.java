package insight_global.thread;

public class Manager extends Thread {
    private final String name;
    private final ConferenceRoomBookingJob bookingJob;

    public Manager(String name, ConferenceRoomBookingJob bookingJob) {
        this.name = name;
        this.bookingJob = bookingJob;
    }

    @Override
    public void run() {
        // Simulating the manager checking availability and trying to book the room
        System.out.println(name + " is checking room availability...");
        
        if (bookingJob.bookRoom()) {
            System.out.println(name + " has booked the room and is starting the meeting.");
            bookingJob.conductMeeting();
            bookingJob.releaseRoom();
        } else {
            System.out.println(name + " found the room unavailable. Trying again later.");
        }
    }
}

