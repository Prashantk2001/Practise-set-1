package practise_set2;

import java.util.Scanner;

public class p16_sum_of_positive_integer {
    public static void main(String[] args) {
        int sum = 0, n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        n = sc.nextInt();
        for (i = 1; i <=n;i++);{
            sum = sum+i;
            if (i==n)
                System.out.println(i*2);
            else
                System.out.println(i+"+");

        }
        System.out.println("\n\nsum of the series = = " +sum);

    }
}


