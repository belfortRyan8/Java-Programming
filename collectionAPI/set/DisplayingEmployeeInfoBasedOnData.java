package collectionAPI.set;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.TreeSet;
/*
    Program to insert Employee object into TreeSet Where Default natural sorting order is based on Ascending order of Employee id . and Customized Sorting is based on Alphabetical order
    of names .
 */

class CustomizedSortingBasedOnEmployeeName implements Comparator {
    @Override
    public int compare(Object ob1, Object obj2){
        Employee employee1 = (Employee) ob1;
        Employee employee2 = (Employee) obj2;

        String empName1 = employee1.empName;
        String empName2 = employee2.empName;

        return empName2.compareTo(empName1);
    }
}

class Employee implements Comparable{
    int empId;
    String empName;

    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString(){   return "["+empId+"--"+empName+"]";  }

    @Override
    public int compareTo(Object obj){
        Employee employeeObject = (Employee) obj;

        int empId1 = this.empId; // this would be the first empId .
        int empId2 = employeeObject.empId; // this would be the second empId .
        if(empId1 < empId2){
            return -1;
        }else if(empId1 > empId2){
            return +1;
        }else {
            return 0;
        }
    }
}
public class DisplayingEmployeeInfoBasedOnData{
    public static void main(String[] args) {
        Employee emp1 = new Employee(5,"ryan");
        Employee emp2 = new Employee(2,"luke");
        Employee emp3 = new Employee(4,"andrew");
        Employee emp4 = new Employee(1,"trishtan");
        Employee emp5 = new Employee(3,"jhony");

        TreeSet takeEmpId = new TreeSet();
        takeEmpId.add(emp1);
        takeEmpId.add(emp2);
        takeEmpId.add(emp3);
        takeEmpId.add(emp4);
        takeEmpId.add(emp5);
        // default natural sorting . ascending order
        System.out.println("Employee Data Based on Id :"+takeEmpId);

        TreeSet takeEmpName = new TreeSet(new CustomizedSortingBasedOnEmployeeName());
        takeEmpName.add(emp1);
        takeEmpName.add(emp2);
        takeEmpName.add(emp3);
        takeEmpName.add(emp4);
        takeEmpName.add(emp5);
        // Customized sorting . based on name in descending order .
        System.out.println("Employee Data Based on Name :"+takeEmpName);
    }
}
