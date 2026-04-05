import java.util.Scanner;

public class Condi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println(" enter two numbers  ");
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // System.out.println("lagest number is");
        // if (A >= B) {
        //     System.out.println(A);
        // } else {
        //     System.out.println(B);
        // }
        // if(A%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //         System.out.println("odd");
        // }



        // System.out.println("kamaayi daal apni");
        // float income = sc.nextFloat();
        // float tax;
        
        // if(income<500000){
        //     tax = 0;
        // }
        // else if (income>=500000 && income < 1000000) {
        //     tax = (float)(income * 0.2);
        // }
        // else{
        //     tax =(float)(income * 0.3);
        // }

        //  if (tax == 0){
        //     System.out.println("YE GAREEB KI MKC");
        //  }
        //           else{
        // System.out.println("nirmla tai khaa jaegi itna " + tax);
        //           }



        // System.out.println(" enter three numbers  ");
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // if (A>=B && A>=C ) {
        //     System.out.println("largest no is :" + A);
        // }
        // else if (B>=C){
        //     System.out.println("largest no is :" + B);
        // }
        // else{
        //     System.out.println("largest no is :" + C);
        // }

        //ternary operator
         
        System.out.println("enter the marks");
        int marks = sc.nextInt();

        String type = (marks>=33) ? "pass" : "fail" ;
        
        System.out.printf( " you got %d marks so you are  %s" ,marks,type);

       
    }
}
