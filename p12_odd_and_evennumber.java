package practise_set2;

import java.util.Scanner;

public class p12_odd_and_evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 ==0)
            System.out.println(num + "is an even number");
        else
            System.out.println(num + "is an odd number");
    }
}


