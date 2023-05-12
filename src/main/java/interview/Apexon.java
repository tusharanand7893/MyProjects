package interview;

public class Apexon {


    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 6, 6, 8, 8, 9 };
        int target = 3;
        System.out.println(findClosest(arr, target));
    }

    public static int findClosest(int[] arr,
                                  int target)
    {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (Math.abs(arr[left] - target)
                    <= Math.abs(arr[right] - target)) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr[left];
    }



}
