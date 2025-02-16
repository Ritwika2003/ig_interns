package insight_global.core;

//FirstNameComparator.java
import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {

 @Override
 public int compare(Employee emp1, Employee emp2) {
     return emp1.getFirstName().compareTo(emp2.getFirstName());
 }
}

