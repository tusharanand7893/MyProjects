package interview;

public class Test{

    public static void main(String[] args){
        int[] arr={2,5,6,7,8,8,9};

        int target=4;
        System.out.println(   function1(arr,target));

    }

    public static int function1(int[] arr, int targetValue){

        int left=0;
        int right =arr.length;

        while(left<right){
            int middle=(left+right)/2;
            if(targetValue<arr[middle]){
                right=middle-1;
            }

            else{
                left=middle;}
        }

        int diff=1;
        int nearElement=arr[left];
        for(int i=left;i<right;i++){
            if(arr[i]-nearElement<=1){
                nearElement=arr[i];
            }
        }
        return nearElement;
    }
}