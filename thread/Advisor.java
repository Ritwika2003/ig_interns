package insight_global.thread;

import java.util.Random;

public class Advisor {

    // Array of advices
    private static final String[] advices = {
        "Never begin to stop and never stop to begin.",
        "Only destination isn’t important, one should enjoy the journey.",
        "Impossible itself says ‘I’m possible’.",
        "Every day is a new opportunity to change your life.",
        "Believe in yourself and all that you are.",
        "The future belongs to those who believe in the beauty of their dreams.",
        "Don't count the days, make the days count.",
        "The only way to do great work is to love what you do."
    };

    // Method to get a random advice
    public static String getRandomAdvice() {
        Random random = new Random();
        int index = random.nextInt(advices.length);  // Random index between 0 and length-1
        return advices[index];
    }

    public static void main(String[] args) {
        // Get and print a random advice
        System.out.println("Random Advice: " + getRandomAdvice());
    }
}
