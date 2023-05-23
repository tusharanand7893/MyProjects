package generalProgram;

public class TinyPairs {

    public static void main(String[] args) {
int[] a={1, 2, 3};
        int[] b={1, 2, 3};
        int k=31;
        System.out.println( solution(a,b,k));
    }

// concate the first element from array a and last element from array b then compare the number with k, if number less than k then its tiny pair

    public static int solution(int[] a, int[] b, int k) {

        int tinypair=0;
        int length=a.length-1;
        for(int i=0;i<=length;i++){
            String num1=String.valueOf(a[i]);
            String num2=String.valueOf(b[length-i]);
            String number= num1+num2;
            if(Integer.valueOf(number)<k){
                tinypair++;
            }
        }

       return tinypair;

    }
}
