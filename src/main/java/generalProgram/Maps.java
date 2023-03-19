package generalProgram;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Maps.mapExample();
    }

    public static void mapExample(){
        HashMap<Integer,String> mp= new HashMap<>();
        mp.put(1,"test");
        mp.put(4,"tushar");
        mp.put(2,"piyu");
        mp.put(3,"test");
        mp.put(null,null);

        System.out.println(mp.get(1));
        for(Map.Entry<Integer,String> m: mp.entrySet()){
            String str=
                    m.getValue()+m.getKey();
            System.out.println(str);

        }
    }
}
