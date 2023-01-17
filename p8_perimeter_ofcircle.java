package practise_set2;

import java.util.Scanner;

public class p8_perimeter_ofcircle {
    public static void main(String[] args) {
        int area , peri,l,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle");
        l = sc.nextInt();
        w = sc.nextInt();
        area = l+w;
        peri = 2 * (l+w);
        System.out.println("Area of rectangle = " + area);
        System.out.println("perimeter of rectangle = " + peri);
    }
}
