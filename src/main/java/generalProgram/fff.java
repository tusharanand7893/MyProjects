package generalProgram;


import java.util.HashSet;
import java.util.Set;

/*
This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
*/
public class fff {


    public int solution(int[] A) {
        // Implement your solution here
        int max=A[0];
        int maxFixed=A[0];
        int minInt=1;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        maxFixed=max;
        for(int j=0;j<A.length;j++){
            if(A[j]==max-1){
                max=max-1;
            }
        }
        if(maxFixed<=0){
            maxFixed=1;
        }
        else if(maxFixed<max){
            maxFixed=max;
        }
        else if(maxFixed==max){
            maxFixed=maxFixed+1;
        }
        return maxFixed;
    }

    public static void main(String[] args){
        fff f=new fff();
       /* int[] a = {1, 2, 3, 4};

        System.out.println(f.solution1(a));*/

        f.test();
    }

    public int solution1(int[] A){
        int N = A.length;
        int number=1;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                i=number;
            }
        }
        return number;
    }

    public void test(){
        AbsClassExample absClassExample= new AbsClassExample(3,5) {
            @Override
            public void function() {
                System.out.println(a+" fucntion abs "+b);
            }
        };

        absClassExample.testfunctionabs();
        absClassExample.function();
    }


}
