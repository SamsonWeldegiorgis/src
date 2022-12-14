package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

   // keys are interger, and values are string
        Map<Integer, String> map = new HashMap<>();
        // add key/value to the map
        map.put(1,"one");
        map.put(4,"four");
        map.put(1,"one");
        map.put(3,"three");
        map.put(10,"ten");
        map.put(5,"five");
        System.out.println(map);// maintain order and sorts ,,,NO DUPLICATE
                        // HashMap element order is random, not insertion order, not sorted

        // read the key/value from map

        System.out.println(map.get(10)); // argument is the key, not index

        String value = map.get(5);
        System.out.println(map);

        map.remove(1);// remove method argument is the key, it removes the whole entry
        System.out.println(map);   // key is for numbers,,,,,,,value=for characters

        System.out.println(map.containsKey(1)); // false b/s it is removed
        System.out.println(map.containsKey(3)); // true b/s it is available

        System.out.println(map.containsValue("five")); // true b/s it is available
        System.out.println(map.containsValue("10")); // false b/s 10 is key not value

        map.put(null,null);
        System.out.println(map);

        map.put(null, "hello world");// null key exists,so the value gets updates to the hello world
        System.out.println(map);

        map.put(3,"March");  // 3 key exists, the value gets updated to March
        System.out.println(map);  // replacing the last 3 identity


    }
}
