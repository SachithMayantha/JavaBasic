package DataStructures;

import java.util.HashMap;

public class HashMapDS {
    public static void main(String[] args) {
        //introduced in Java 1.2 (After HashTable)
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("Kamal","0719303433"); // Key and Value
        hashMap.put("Sumal","0773850242");
        hashMap.put("Ramal","0777400345");

        System.out.println(hashMap); // {Ramal=0777400345, Kamal=0719303433, Sumal=0773850242}
        System.out.println(hashMap.containsKey("Kamal")); // true
        System.out.println(hashMap.get("Sumal")); // 0773850242
        // If key is not exist, return null
    }
}
