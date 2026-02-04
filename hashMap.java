import java.util.*;
public class hashMap{


    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("USA",1);
        map.put("RUSSIA",2);
        map.put("China",3);
        map.put("India",4);
        map.put("UK",5);

        Set<String>keys = map.keySet();

        for (String k : keys) {
            System.err.println("Key = "+k + " , Value =  "+map.get(k) );
        }





        System.err.println("HASH-MAP = " + map);

        map.remove("India");
        System.err.println(map);


        System.err.println("SIZE OF HASHMAP = "+map.size());
        map.clear();
        System.err.println("CHECK EMPTY = "+map.isEmpty());
    }
}