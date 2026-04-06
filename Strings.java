import java.util.*;
public class Strings {
    
    public static void main(String[] args) {
        String str="abcd";
        String str2= new String("xyz");

        // In java Strings are IMMUTABLE

        //Input/output in string
        Scanner sc = new Scanner (System.in);
        String name;
        name = sc.nextLine();
        System.out.println("This is a String=>"+name);


        //string Length
        String Fullname= "Amit Kumar";
        System.out.println(Fullname.length());


        //Concatenation
        System.out.println("Enter first name");
        String firstname;
        firstname=sc.nextLine();
        System.out.println("Enter Last name");
        String lastname;
        lastname=sc.nextLine();

        System.out.println("Your name is => " +firstname +" "+lastname );



        
    }
}
