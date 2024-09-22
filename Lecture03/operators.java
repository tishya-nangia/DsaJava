package Lecture03;

public class operators {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println(a&b); //bitwise and
        int c= 9;
        int d= 7;
        System.out.println(c|d); //bitwise or
        int e=7;
        int f=16;
        System.out.println(e^f); //XOR
        int g=7;
        System.out.println(~g); //complement
        int h= 5;
        System.out.println(h<<1); //left shift by 1
        System.out.println(h<<2); //left shift by 2
        System.out.println(h<<3); //left shift by 3
    }
}
