package Lecture03;

public class forloops {
    public static void main(String[] args) {
        int n=10;
        //print even numbers upto n
        for (int i=0; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //WAP to find the sum of first N natural numbers
        int sum=0;
        for (int i=1; i<=n ;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        
        //WAP to reverse the n natural numbers in reverse order
        for (int i=n; i>=0; i--){
            System.out.println(i);
        }
    }
}