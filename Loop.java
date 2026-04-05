import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        // ******   while looop   ******

         Scanner sc = new Scanner(System.in);
        // System.out.println("sum of N natural number , enter value of N");
        // int n = sc.nextInt();
        // int i=0;
        // // while (i<=n) {
        // //     System.out.print(i+" ");
        // //     i++;
        // // }
        // int sum = 0;
        // while (i<=n) {
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);



        // ************* FOR LOOP *************

        // for(int i=1; i<5;i++){
        //     for(int j=1;j<5;j++){
        //     System.out.print(" * ");
        //     }
        //     System.out.println("");
        // }



        //reverse a number       // for review
        // System.out.println("enter the num. ");
        // int num = sc.nextInt();
        // int rev=0;
        // while(num>0){
        //     int LD=num%10;
        //     rev=rev*10+LD;
        //     num=num/10;
        // }
        // System.out.println(rev);


        //  ********   break statement using Do while   ******
        // System.out.println("Enter the num");
        // do { 
            
        //     int n = sc.nextInt();
        //     if(n%12==0){
        //         continue;
        //     }
        //     System.out.println(n);
        //     System.out.println("enter again.....");
          
        // } while (true);


        
        System.out.println("enter the num");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.println( n + "*" + i + "= " + n * i );
            
        }
    }
}
