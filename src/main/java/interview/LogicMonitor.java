package interview;

import java.util.LinkedHashMap;

public class LogicMonitor {

    public static void main(String[] args) {
       /* String s="tusharsfdsfdasdseerrtusahr";
        countChar(s);*/

        int[] arr={5,7,4,2,1,5,7};
        secondHighestElement(arr);
    }

    public static void countChar(String s){
        LinkedHashMap<Character, Integer> hm= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else {
                hm.put(s.charAt(i),1);
            }
        }
        System.out.println(hm);
    }


    public static void secondHighestElement(int[] a){

        int maxnumber=a[0];
        for(int i=0;i<a.length;i++){
            if(maxnumber<a[i]){
                maxnumber=a[i];
            }
        }
        int secondMax=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]!=maxnumber && secondMax<a[i]){
                secondMax=a[i];
            }
        }
        System.out.println(secondMax);
    }


    ///ATM- account-10 total amount 1 LAC
    // verify able to do transaction for 1 account- 1Lac
    // verify able to  do multiple transaction
    // verify able to not do transaction amount more than 1 lac
    // verify able to not do trsanction for multiple account if amount reaches 1 lac
    // verify able to not do transaction if already transafer to 10 account
    // verify not able to allow trsaction amount in negative number
    // verify boundary values of trasaction amount - 0 rs, 1 rs , 99999, 1 lac, 100001
    // verify boundary values for account, 1 account, 9, 10, 11
    // verify amount selected for transfer does not exceed account balance
    // verify at least 1 account is selected to proceed for transfer


}
