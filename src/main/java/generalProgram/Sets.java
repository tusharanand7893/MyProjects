package generalProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Sets.hashSet();
    }

    public static void hashSet(){
        Set<String> hs= new HashSet<>();
        hs.add("testdsdsds");
        hs.add("testds1dsds");
        hs.add("testdsds1ds");
        boolean flag=hs.add("testdsds1ds1");
        System.out.println(flag);
        Iterator<String> it= hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
