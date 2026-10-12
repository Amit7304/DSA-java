import java.util.*;
public class Strings {
    


    //pallindrome in string

    public static boolean ispallindrom(String str){
        for(int i=0; i<str.length()/2;i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-(i))){
                System.out.println("sorry not a pallindrome word");
                return false;
            }
        }
        System.out.println("yaaa , pallinndrome word");
        return true;
    }
    public static void main(String[] args) {
        // String str="";
        // String str2= new String("xyz");

        // In java Strings are IMMUTABLE

        //Input/output in string
         //Scanner sc = new Scanner (System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println("This is a String=>"+name);


        // //string Length
        // String Fullname= "Amit Kumar";
        // System.out.println(Fullname.length());


        // //Concatenation
        // System.out.println("Enter first name");
        // String firstname;
        // firstname=sc.nextLine();
        // System.out.println("Enter Last name");
        // String lastname;
        // lastname=sc.nextLine();

        // System.out.println("Your name is => " +firstname +" "+lastname );

        String str2 = "racecar";
        String str = "carrace";
        ispallindrom(str);
        ispallindrom(str2);

    
        
    }
}
