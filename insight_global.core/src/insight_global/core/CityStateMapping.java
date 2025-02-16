package insight_global.core;

//CityStateMapping.java
public class CityStateMapping {
 private String city;
 private String state;

 // Constructor
 public CityStateMapping(String city, String state) {
     this.city = city;
     this.state = state;
 }

 // Getters
 public String getCity() {
     return city;
 }

 public String getState() {
     return state;
 }

 @Override
 public String toString() {
     return "City: " + city + ", State: " + state;
 }
}


