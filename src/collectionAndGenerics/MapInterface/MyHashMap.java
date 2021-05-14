package collectionAndGenerics.MapInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {

        //It prints only unique values but the values are NOT in sequence
        Map<String,String> map = new HashMap<>();
        map.put("name","Ankan");
        map.put("title","Mukherjee");
        map.put("roll","1828049");
        map.put("college","KIIT University");

        //Display Method-1
        System.out.println(map);

        //Display Method-2
        Set<String> stringSet = map.keySet();
        for (String s : stringSet) {
            System.out.println("Key: "+s+" Value: "+map.get(s));
        }

        //Display Method-3
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry m : entrySet) {
            System.out.println("key: "+m.getKey()+" value: "+m.getValue());
        }

        //If we add value for the same key the previous value will be updated
        map.put("name","Ankan123");
        System.out.println(map);


        //If we put wrong key value it will give null
//        System.out.println("\n"+map.get("name"));
        System.out.println("\n"+map.get("name1"));



    }
}
