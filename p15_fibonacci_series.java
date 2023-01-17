package practise_set2;

import java.util.Scanner;

public class p15_fibonacci_series {
    public static void main(String[] args) {
        long a=0,b=1,c;
        long n,i;
        System.out.println("Enter the range");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(a+"," +b);
        for (i=1;i<=n-2;i++){
            c = a+b;
            System.out.println("," +c);
            a=b;
            b=c;
        }
    }
}
