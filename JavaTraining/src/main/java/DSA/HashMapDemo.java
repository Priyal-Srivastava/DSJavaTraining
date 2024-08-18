package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> myfriends = new HashMap<>();
        // adding the friends name with age
        myfriends.put("Priyal", 19);
        myfriends.put("Priya", 19);
        myfriends.put("Vaish", 19);
        myfriends.put("Nancy", 19);
        myfriends.put("Nik", 19);

        System.out.println(myfriends);

        // print each key
        for (String name : myfriends.keySet()){
            System.out.println(name);
        }

        // to access the specific value from hashmap
        System.out.println(myfriends.get("Priyal"));

        // replace the value of the key
        myfriends.replace("Priyal",20);
        System.out.println(myfriends);

        // connecting hashmap and arraylist
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        arrayList.add(myfriends);
        System.out.println(arrayList);







    }

}
