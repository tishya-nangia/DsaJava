package Lecture06;

public class ArrayPractice {
    static void display (int []arr){
        for (int i:arr){
            System.out.print(i + " ");
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int []arr= {1,2,3,4,6};
        display(arr);
    }
}
