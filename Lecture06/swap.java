package Lecture06;

public class swap {
    static void swapp(int[]arr, int i, int j){
        int k =arr[i];
        arr[i]= arr[j];
        arr[j]= k;
    }
    static void swapwointeger(int[]arr, int i, int j){
        arr[i]= arr[i]+arr[j];
        arr[j]= arr[i]-arr[j];
        arr[i]= arr[i]-arr[j];
    }
    static void display(int[]arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr= {2,4,6,5,3};
        int i=1;
        int j=2; 
        swapwointeger(arr, i, j);
        display(arr);
    }
}
