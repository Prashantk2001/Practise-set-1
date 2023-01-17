package practise_set2;

import java.util.Scanner;

public class p4_inputssubstraction {
    public static void main(String[] args) {
        int a,b,c, substraction;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        substraction = a-b-c;
        System.out.println("Substraction = " + substraction);
    }
}
