package Lecture04;

public class pattern1 {
    public static void main(String[] args) {
        //Print sqaure
        int n=4;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");              
            }
            System.out.println();
        }
        //print right facing triangle
        System.out.println();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");              
            }
            System.out.println();
        }
    }
}
