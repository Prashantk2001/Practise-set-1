package practise_set2;

public class p17_Swapping_of_two_variables {
    public static void main(String[] args) {
        int a = 10, b= 20,t;
        System.out.println("Before a swapping a = " +a+"b="+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After a swapping a = " + a+"b="+b);
    }
}
