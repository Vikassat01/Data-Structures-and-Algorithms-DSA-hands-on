package HashingAlgorithin;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("India", 136);
        map.put("Ind", 36);
        map.put("dia", 13);
        map.put("Iia", 16);
        System.out.println(map);

        map.put("Ind",400);
        System.out.println(map);

//        if (map.containsKey("Ind")){
//            System.out.println("present in the map : ");
//        }else {
//            System.out.println("Key is not present in the map:");
//        }
//        System.out.println(map.get("Ind")); //Exist key

        int arr[] = {12, 15, 18};
        for (int i=0; i<3; i++){
            System.out.println(arr[i]+ "");
        }
       System.out.println();

        for (int val : arr){
            System.out.println(val + "");
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " "+map.get(key));
            System.out.println(map);
        }
    }
}
