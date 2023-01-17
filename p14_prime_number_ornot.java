package practise_set2;

import java.util.Scanner;

public class p14_prime_number_ornot {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        for (i=2;i<=n-1;i++){
            if (n%i==0) {
                System.out.println(n+"is not a prime number");
                break;

            }
        }
        if (n==i)
            System.out.println(n+"is a prime number");
        sc.close();
    }
}
