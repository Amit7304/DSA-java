public class Optr {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        //Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (a / b));
        System.out.println("b % a = " + (a % b));

        //Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        //Logical Operators
        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));
        System.out.println("a > 0 || b < 0: " + (a > 0 || b < 0));
        System.out.println("!(a > b): " + !(a > b));

        //assignment Operators
        int c = a + b; // assignment
        System.out.println(c += a);// c = c + a
        System.out.println(c -= a);// c = c - a
        System.out.println(c *= a);// c = c * a
        System.out.println(c /= a);// c = c / a
        System.out.println(c %= a);// c = c % a








        // practice questions
        // Q1
        int x = 2,y = 5;
         int exp1 = (x * y / x);
         int exp2 = (x * (y / x));
         System.out.print(exp1 + " ,");
         System.out.print(exp2); 
    }
}