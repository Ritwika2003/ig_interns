package insight_global.day5;
import java.util.Date;

public class Contact {
	

	
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private Date dob;
	    private String gender;
	    private String mobileNumber;

	    // Constructor
	    public Contact(String firstName, String middleName, String lastName, Date dob, String gender, String mobileNumber) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.dob = dob;
	        this.gender = gender;
	        this.mobileNumber = mobileNumber;
	    }

	    // Getter and Setter methods
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getMiddleName() {
	        return middleName;
	    }

	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Date getDob() {
	        return dob;
	    }

	    public void setDob(Date dob) {
	        this.dob = dob;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    // Validation method
	    public boolean validate() {
	        // Validate mobile number and ensure it's not null or empty
	        if (this.mobileNumber == null || this.mobileNumber.isEmpty()) {
	            return false;
	        }
	        // Validate gender
	        if (this.gender == null || (!this.gender.equalsIgnoreCase("Male") && !this.gender.equalsIgnoreCase("Female"))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob="
	                + dob + ", gender=" + gender + ", mobileNumber=" + mobileNumber + "]";
	    }
	


}
