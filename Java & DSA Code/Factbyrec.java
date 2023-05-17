public class Factbyrec {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    public static void main(String args[]){
        System.out.print("Factorial of the given number:");
        int f=factorial(5);
        System.out.print(f);
    }
}
