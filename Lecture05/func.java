package Lecture05;

import java.util.Scanner;

public class func {
    static boolean Armstrong(int n){
        int len=0;
        int temp=n;
        while(temp!=0){
            temp/=10;
            len++;
        }
        int sum=0;
        temp=n;
        while(temp!=0){
            sum+=(int)Math.pow(temp%10, len);
            temp/=10;
        }
        return (sum==n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("The number is an Armstrong number");
        int n= sc.nextInt();
        System.out.println(Armstrong(n));
    }
}