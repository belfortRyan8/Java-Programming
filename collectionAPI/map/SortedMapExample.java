package collectionAPI.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer,String> originalMap = new TreeMap<>();
        originalMap.put(1,"one");
        originalMap.put(3,"three");
        originalMap.put(4,"four");
        originalMap.put(5,"five");
        originalMap.put(2,"two");

        System.out.println("Original map :"+originalMap);

        System.out.println("get value :"+originalMap.get(2));
        // iterating ..
        for(Map.Entry<Integer,String> entry : originalMap.entrySet()){
            System.out.println("key :"+entry.getKey()+" "+"values :"+entry.getValue());
        }

        Map<Integer,String> subMap = originalMap.subMap(1,4); // here 1 inclusive but 4 is exclusive
        System.out.println("sub Map :"+subMap);

        Map<Integer,String> headMap = originalMap.headMap(3);// integer toKey , here elements which are strictly less than 3
        System.out.println("head Map :"+headMap);

        Map<Integer,String> tailMap = originalMap.tailMap(3); // Integer fromKey, here elements from 3 or greater than 3
        System.out.println("tail Map :"+tailMap);

        System.out.println("First key :"+originalMap.firstKey());
        System.out.println("Last Key :"+originalMap.lastKey());
    }
}
