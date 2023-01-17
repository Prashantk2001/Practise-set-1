package practise_set2;

import java.util.Scanner;

public class p13_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = sc.nextInt();
        if(year%4==0)


        System.out.println(year +"is a leap year");
        else
        System.out.println(year + "is not a leap year");
    }
}
