package practise_set2;

import java.util.Scanner;

public class p7_Areaof_circle {
    public static void main(String[] args) {
        Double area ,circle,radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius = sc.nextDouble();
        area = 3.1412*radius*radius;
        circle = 2*3.1412*radius;
        System.out.println("Area of circle = " + area);
        System.out.println("circumferance of circle = " + circle);
    }
}
