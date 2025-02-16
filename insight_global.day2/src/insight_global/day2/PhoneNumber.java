package insight_global.day2;


public class PhoneNumber {
    private String areaCode;
    private String exchange;
    private String extension;

    // Constructor that takes area code, exchange, and extension as arguments
    public PhoneNumber(String areaCode, String exchange, String extension) {
        if (areaCode.length() == 3 && exchange.length() == 3 && extension.length() == 4) {
            this.areaCode = areaCode;
            this.exchange = exchange;
            this.extension = extension;
        } else {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
    }

    // toString method to display the phone number in the required format
    @Override
    public String toString() {
        return "(" + areaCode + ") " + exchange + "-" + extension;
    }

    // equals method to compare two PhoneNumber objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneNumber other = (PhoneNumber) obj;
        return areaCode.equals(other.areaCode) && exchange.equals(other.exchange) && extension.equals(other.extension);
    }

    // Main method for testing
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber("800", "867", "5309");
        PhoneNumber p2 = new PhoneNumber("800", "867", "5309");
        PhoneNumber p3 = new PhoneNumber("888", "555", "1234");

        System.out.println("Phone number 1: " + p1.toString());
        System.out.println("Phone number 2: " + p2.toString());
        System.out.println("Phone number 3: " + p3.toString());

        System.out.println("p1 equals p2: " + p1.equals(p2)); // Should return true
        System.out.println("p1 equals p3: " + p1.equals(p3)); // Should return false
    }
}
