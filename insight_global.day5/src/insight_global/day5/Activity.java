package insight_global.day5;




public class Activity {
 
 private String string1;
 private String string2;
 private String operator;
 
 // Default constructor
 public Activity() {
     this.string1 = "";
     this.string2 = "";
     this.operator = "";
 }
 
 // Constructor with parameters
 public Activity(String string1, String string2, String operator) {
     this.string1 = string1;
     this.string2 = string2;
     this.operator = operator;
 }
 
 // Getter and Setter methods
 public String getString1() {
     return string1;
 }

 public void setString1(String string1) {
     this.string1 = string1;
 }

 public String getString2() {
     return string2;
 }

 public void setString2(String string2) {
     this.string2 = string2;
 }

 public String getOperator() {
     return operator;
 }

 public void setOperator(String operator) {
     this.operator = operator;
 }
 
 @Override
 public String toString() {
     return "Activity [string1=" + string1 + ", string2=" + string2 + ", operator=" + operator + "]";
 }
}

