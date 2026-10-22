package Recursion;

public class Basics {

    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = factorial(n-1);
        int fn = n*factorial(n-1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        // printdec(n);
        // printInc(n);

        System.out.println(factorial(n)) ;
    }
}
