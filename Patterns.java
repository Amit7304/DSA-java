public class Patterns{
    public static void main(String[]args){
        int n=4;
    // for(int i=1; i<=n; i++){
    //     for(int j=1;j<=(n-i+1); j++){
    //         System.out.print("*  ");
    //     }
    //     System.out.println("");
    //     }



    // for(int line=1; line<=n;line++){
    //     for(int number=1;number<=line;number++){
    //         System.out.print(number);
    //     }
    //     System.out.println();
    // }


    char ch='A';
    for(int line=1;line<=n;line++){
        for(int Chars=1;Chars<=line;Chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}