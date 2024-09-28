package Lecture06;

public class reversearray {
    static void reverse (int[]arr){
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]arr= {2,3,7,4};
        reverse(arr);
    }
}