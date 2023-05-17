import java.util.*;
public class AreaCircle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius Of Circle:");
        float rad = sc.nextFloat();
        double area= 3.14*rad*rad;
        System.out.print("Area Of Circle:");
        System.out.print(area);
    }
}
