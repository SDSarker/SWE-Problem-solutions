import java.lang.Math;
import java.util.Scanner;

public class BasicSyntex {
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[1]=2;
        arr[2]=5;
        arr[0]=6;
        for (int i : arr) {
            System.out.println(i);
        }
        
        int[] arr2 ={1,2,3};
        float f=100.12F;
        double d=100.12;

        int price=100;
        double gst=3.35;
        int total= price + (int)gst;


        int a=10;
        int b=20;
        System.out.println(Math.max(a, b));
        System.out.println((int)(Math.random()*100));

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt(); //nextFloat
        String breakafterspace=sc.next();
        System.out.println(breakafterspace);
        String breakafterenter=sc.nextLine();
        System.out.println(breakafterenter);
        
    }
}
