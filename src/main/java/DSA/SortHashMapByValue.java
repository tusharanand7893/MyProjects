package DSA;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1,"Math");
        hm.put(2,"Data Structure");
        hm.put(3,"Database");
        hm.put(4,"Java");
        hm.put(5,"Operating System");
        hm.put(6,"Networking");
        System.out.println(sortHashMap(hm));
    }

    public static HashMap<Integer,String> sortHashMap(HashMap<Integer,String> hm){
        //create list of hashmap from given hashmap
        List<Map.Entry<Integer,String>> list= new LinkedList<Map.Entry<Integer,String>>(hm.entrySet());

        //now use collect.sort
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        //now store this list into new hashmap and return
        HashMap<Integer,String> shm=new LinkedHashMap<>();
        for(Map.Entry<Integer,String> v:list){
            shm.put(v.getKey(),v.getValue());
        }

        return shm;
    }
}
