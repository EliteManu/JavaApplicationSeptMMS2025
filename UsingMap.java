import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Henry");
        map.put(102, "Banana");
        map.put(103, "Orange");
        map.put(104, "Lucy Gerry");
        map.put(105, "Johnny Victor");
        map.put(106, "Kate Benson");
        map.put(107, "Nathan Zoe");

        // get(Object key) - Returns the value associated with the key
        String value = map.get(102);
        System.out.println("Value for 102: " + value);

        // remove(Object key) - Removes the key-value pair
        map.remove(106);

        // containsKey(Object key) - Checks if the key exists
        boolean hasApple = map.containsKey(106);
        System.out.println("Contains key 106: " + hasApple);

        // keySet() - Returns all keys
        Set<Integer> keys = map.keySet();
        System.out.println("Keys in map: " + keys);
    }
}