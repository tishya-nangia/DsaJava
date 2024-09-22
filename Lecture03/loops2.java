package Lecture03;
import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        //WAP to print whether a number is prime or not
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter number:");
        int n= sc.nextInt();
        boolean b=true;
        for (int i=2; i<n; i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        if (b==true) {
            System.out.println("The number is prime");
        }
        else{
        System.out.println("The number is not prime");
            
        }
            
        }
    }
