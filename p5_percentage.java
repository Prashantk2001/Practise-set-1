package practise_set2;

import java.util.Scanner;

public class p5_percentage {
    public static void main(String[] args) {
        float a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d= sc.nextInt();
        e = sc.nextInt();
        float percentage = (a+b+c+d+e)/500*100;
        System.out.println(percentage);
    }
}
