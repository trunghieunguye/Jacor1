package Homework.lesson1;

public class Ex8 {
    public static void main(String[] args){
        int a=5;
        int b=4;
        int c=9;
        if( a >= b && a >= c)
            System.out.println(a+" là số lớn nhất");

        else if (b >= a && b >= c)
            System.out.println(b+" là số lớn nhất");
        else
            System.out.println(c+" là số lớn nhất");

    }
}
