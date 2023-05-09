package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test {

    public static void main(String[] args) {
        int[] X={2,4,2,6,7,1};
        int[] Y={0,5,3,2,1,5};
        solution(X,Y,2);
    }


    public static int solution(int[] X, int[] Y, int W) {
        // Implement your solution here

        AB ab= new AB("test");
        int rollTime=1;
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<X.length;i++){
            a.add(X[i]);
        }
        Collections.sort(a);
        int i=0;
        int rollerWidth=a.get(i)+W;
        while(!a.isEmpty()){

            while(a.size()!=0 && a.get(0)<=rollerWidth){
                a.remove(0);
            }
            if(a.get(0)>rollerWidth){
                rollTime--;
            }
            rollTime++;
            rollerWidth=rollerWidth+W;
        }
return rollTime;
    }

    public static void solution1(int[] X, int[] Y, int W) {
        // Implement your solution here
        HashMap<Integer, List<Integer>> hm= new HashMap<>();
        int potHoles=0;
        for(int i=0;i<X.length;i++){
            ArrayList<Integer> a= new ArrayList<>();
            a.remove(Integer.valueOf(a.get(i)));
            a.add(X[i]);
            a.add(Y[i]);
            potHoles++;
            hm.put(potHoles,a);
        }
        System.out.println(hm);
    }
    }
