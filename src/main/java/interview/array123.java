package interview;

public class array123 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        System.out.println("test1 "+findPeak(arr,7));
        System.out.println("Test2 "+findPeak2(arr,7));
    }

    public  static int findPeak(int arr[], int n){
        int i;
        int temp[]= new int[n+1];
        for(i=0;i<=n;i++){
            temp[i]=0;
        }
        for(i=0;i<n;i++){
            temp[arr[i]-1]=1;
        }
        int ans=0;
        for(i=0;i<=n;i++){
            if(temp[i]==0){
                ans=i+1;
            }
        }
        return ans;
    }

    public static int findPeak2(int arr[],int n){
        n=n+1;
        int sum=(n*(n+1))/2;
        int sumOfArray=0;
        for(int i=0;i<arr.length;i++){
            sumOfArray=sumOfArray+arr[i];
        }
        return sum-sumOfArray;
    }
}
