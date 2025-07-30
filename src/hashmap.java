import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

    /*Hashmap is a data structure that stores key-value pairs
    keys are unique but values can be duplicate
    no specific order in a hashmap but it is memory efficient
     */

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("banana",0.75);
        map.put("orange",0.80);
        map.put("coconut",1.00);


        //map.remove("apple");
        //System.out.println(map.get("apple"));
        //System.out.println(map.containsKey("banana"));
        //System.out.println(map.containsValue(0.80));
        //System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key+": $" + map.get(key));
        }


    }
}
