package Lecture04;

public class pattern2 {
    //print left facing triangle
    static void printLFT(int n){
        for(int i=1; i<=n;i++){
            //for printing spaces
            for (int k=1; k<=(n-i); k++)
                System.out.print(" ");
            //for printing stars
            for (int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    static void printIRFT(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i+1); j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void printIRFT2(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
    static void printILFT(int n){
        for(int i=n; i>=1;i--){
            //for printing spaces
            for (int k=1; k<=3*(n-i); k++)
                System.out.print(" ");
            //for printing stars
            for (int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a=5;
        printILFT(a);
    }
}