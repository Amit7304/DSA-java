public class Functions {
//    public static int printHW(){
//        System.out.println("hello world");
//        System.out.println("hello world");
//        return 0;
//    }


//    public static int multiply(int a,int b){
//        int product=a*b;
//        return product;
//    }

    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
            return f;
    }

    public static int bicoff(int n,int r){
        int fac_n=factorial(n);
        int fac_r=factorial(r);
        int fac_nmr=factorial(n-r);
        int ans = fac_n/(fac_r*fac_nmr);
        return ans;
    }


    public static void main(String[] args) {
//        printHW();

//       int ans=multiply(5,9);
//       System.out.println(ans);


        System.out.println(bicoff(10,2));

    }
    
}
