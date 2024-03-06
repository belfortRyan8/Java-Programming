package collectionAPI.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // explanation of hashmap.
        HashMap<Integer,String> employeeData = new HashMap<Integer,String>();
        // insertion of entry
        employeeData.put(1,"jon");
        employeeData.put(2,"andrew");
        employeeData.put(3,"tristan");
        employeeData.put(4,"luke");
        employeeData.put(5,"baby girl");

        System.out.println("Employee details are : ");
        System.out.println(employeeData);

        // to get the key  ..
        Set<Integer> getTheKey = employeeData.keySet();
        // to get the value
        Collection<String> getTheValue = employeeData.values();
        // get the entire details
        Set getKeyAndValue = employeeData.entrySet();

        System.out.println("Key are :"+getTheKey);
        System.out.println("Values are :"+getTheValue);
        System.out.println("Entry are : "+getKeyAndValue);

        // printing the details of entry using the cursor
        Iterator data = getKeyAndValue.iterator();
        while(data.hasNext()){
            Map.Entry getTheData = (Map.Entry) data.next();
            System.out.println("key :"+getTheData.getKey());
            System.out.println("Value:"+getTheData.getValue());
            System.out.println();
        }
    }
}
