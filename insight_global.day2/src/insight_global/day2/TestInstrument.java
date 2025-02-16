package insight_global.day2;

public class TestInstrument {
    public static void main(String[] args) {
        // Create an array of 10 Instruments
        Instrument[] instruments = new Instrument[10];

        // Populate the array with objects of Piano, Flute, and Guitar
        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Piano();
        instruments[4] = new Guitar();
        instruments[5] = new Flute();
        instruments[6] = new Guitar();
        instruments[7] = new Piano();
        instruments[8] = new Flute();
        instruments[9] = new Guitar();

        // Check polymorphic behavior and use instanceof to print the class of each object
        for (int i = 0; i < instruments.length; i++) {
            System.out.print("Instrument at index " + i + ": ");
            
            // Print which class the object at each index belongs to
            if (instruments[i] instanceof Piano) {
                System.out.print("Piano - ");
            } else if (instruments[i] instanceof Flute) {
                System.out.print("Flute - ");
            } else if (instruments[i] instanceof Guitar) {
                System.out.print("Guitar - ");
            }

            // Call the play method (polymorphism)
            instruments[i].play();
        }
    }
}

