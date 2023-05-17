import java.util.*;
public class Calculator {
    public static void main(String main[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
        System.out.print("Enter Operator:");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':System.out.println("Addition Of A and B:"+(a+b));
                    break;
            case '-':System.out.println("Subtraction Of A and B:"+(a-b));
                    break;
            case '*':System.out.println("Multiplication Of A and B:"+(a*b));
                    break;
            case '/':System.out.println("Division Of A and B:"+(a/b));
                    break;
            case '%':System.out.println("Remainder Of A and B:"+(a%b));
                    break;
            default :System.out.println("Please Enter Correct Operator");
        }
    }
}
