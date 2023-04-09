package interview;

public class SecondMax {



    public static void main(String[] args) {
        int[] arr={2,7,7,7,5,6,3};
        findSecondMax(arr);
    }

    public static void findSecondMax(int[] a){
int max=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]>a[j-1]){
                    int tem=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tem;
                }
            }
        }
        for(int b:a){
           if(max>b){
               max=b;
           }
        }
        int i=1;
        while(a[i]==a[i-1]){
            i++;
        }
        System.out.println(a[i]);
    }
}
