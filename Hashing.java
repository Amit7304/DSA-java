import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //insert 
        hm.put("Tea", 10);
        hm.put("Poha", 15);
        hm.put("Samosa", 15);
        hm.put("Kachori", 20);
        hm.put("Jalebi", 50);

        System.out.println(hm);

        //get 
        System.out.println(hm.get("Samosa"));
        System.out.println(hm.get("Pizza"));

        //contains
        System.out.println(hm.containsKey("Jalebi"));

        //Remove
        System.out.println(hm.remove("Jalebi"));

        // Example of a get statement
System.out.println(hm.get("Tea")); // This will print the value associated with "Tea"

    }
}
