package HashingAlgorithin;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {


    //Creating
    HashSet<Integer> set = new HashSet<>();

    //Array list
   // ArrayList<Integer> list = new ArrayList<>();
    //Insert
    set.add(1);
    set.add(2);
    set.add(3);
        set.add(1);//list.add(elements)
        set.add(4);
        set.add(5);
       set.add(6);


    //Search
        System.out.println(set);
        System.out.println("Size of element :"+set.size());
    if(set.contains(1)){
        System.out.println("set contain 1");
    }
    if(!set.contains(6)){
        System.out.println("does not contains");
    }

    //Delete
//        set.remove(1);
//    if (!set.contains(1)){
//        System.out.println("Does not contin 1 - we delated");
//        System.out.println(set);
//    }
    //Iterator
//        Iterator it = set.iterator();
//    //HasNext //Next
//        while (it.hasNext()){
//            System.out.println(it.next());
//
//        }

    }
}

