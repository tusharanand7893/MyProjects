package DSA;

import java.util.HashMap;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts={{2,8,7},{7,1,3},{11,9,5}};
        System.out.println(RichestCustomerWealth.maximumWealth(accounts));


    }
   public static int maximumWealth(int[][] accounts){
        int maxWealth=0;
        int person=0;

        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth=wealth+accounts[i][j];
                if(wealth>maxWealth){
                    maxWealth=wealth;
                    person=i;
                }
            }
        }
       HashMap<Integer,Integer> hm= new HashMap<>();
       hm.put(person,maxWealth);
       System.out.println(hm);
        return maxWealth;
   }

}
