package generalProgram;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
CollectionDemo collectionDemo= new CollectionDemo();
collectionDemo.mapDemo();

    }


    public void setDemo() {
        Set<String> stringSet= new HashSet<>();
        stringSet.add("test1");
        stringSet.add("test1");
        stringSet.add("test2");
        stringSet.add("test3");
        stringSet.add("test3111");
        stringSet.add(null);

        for(String s:stringSet){
            System.out.println(s);
        }

        Iterator it= stringSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public void mapDemo(){
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1,"tushar");
        hm.put(2,"piyu");
        hm.put(3,"test");
        hm.put(null,null);

        for(String h: hm.values()){
            System.out.println(h);
        }

        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println("Key/Value "+m.getKey()+" "+m.getValue());
        }

        
    }


}
