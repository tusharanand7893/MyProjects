package interview;
/*
L1 Client Interview - Anand - Frontend Testing - Data ai - Teams

Task description
Write a function solution that, given an integer N, returns the maximum possible value obtained by inserting one '5' digit inside the decimal representation of
integer N.

Examples:
1. Given N = 268, the function should return 5268.
e.g. there are 4 possible number by insert 5 : 5268 2568 2658 2685, the max is 5268 and should be retured.
2. Given N = 670, the function should return 6750.
3. Given N = 0, the function should return 50.
4. Given N = −999, the function should return −5999.

Assume that:
N is an integer within the range [−8,000..8,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

You need to :
1. Write & test the function solution in 45 min totally
2. Write down test cases for your solution code and make all of them passed.
3. You can google any lib/utils if you forget not familiar.
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataAi {
    static int maxNum(int num){

        // task 1: write your code here
        List<Integer> al= new ArrayList<>();
        char[] c= String.valueOf(num).toCharArray();

        for(int i=0;i<=c.length;i++){
            if(c[0]=='-' && i==0){
                continue;
            }
            List<Character> cl= new LinkedList<>();
            for(Character ca:c){
                cl.add(ca);
            }



            cl.add(i,'5');
            String s="";
            for(Character cr:cl){
                s=s+cr;
            }
            al.add(Integer.valueOf(s));
        }

        int maxVal = al.get(0);
        for(Integer value:al){
            maxVal=Math.max(maxVal,value);
        }

        return maxVal;
    }

    public static void main(String []args){
        /*System.out.println(maxNum(670) + " = " + 6750);
        System.out.println(maxNum(0) + " = " + 50);
        System.out.println(maxNum(-999) + " = " + -5999);
        System.out.println(maxNum(987) + " = " + 9875);
        System.out.println(maxNum(1001) + " = " + 51001);
        System.out.println(maxNum(1000) + " = " + 50000);
        System.out.println(maxNum(7999) + " = " + 79995);
        System.out.println(maxNum(-1001) + " = " + -10015);
        System.out.println(maxNum(-1000) + " = " + -10005);
        System.out.println(maxNum(-8000) + " = " + -58000);
        System.out.println(maxNum(8000) + " = " + 85000);
        System.out.println(maxNum(7429) + " = " + 75429);
        System.out.println(maxNum(2789) + " = " + 52789);*/
        System.out.println(maxNum(-999) + " = " + -5999);




        // task2: please design more test cases by using the format bellow
        //System.out.println(maxNum(-999) + " = " + -5999);

    }
}

/*

SQL : 
Table : Student: 
id	 name
1000	tom
1001	jerry
1002	mike
1003	mike2

Table: Score:
id	 score
1000	10
1001	60
1002	100
1003    70

Write SQL to search the student name which score > 60, and send the SQL into Meeting Chat. 
(Use 2 different way to write the SQL : join and sub query etc)

SQL execution Output: mike, mike2




*/