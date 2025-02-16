package insight_global.core;

//EmpIdComparator.java
import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {

 @Override
 public int compare(Employee emp1, Employee emp2) {
     return Integer.compare(emp1.getEmpId(), emp2.getEmpId());
 }
}

