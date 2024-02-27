import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
       //     String name="Tony";
       //     String fulName="Tony Stark";
       //     String  sentence = " I am IRONMAN";
//    
       //     Scanner sc=new Scanner(System.in);
       //     String name1=sc.next();
       //     System.out.println("your name is="+name1);


       // concatination
       String firstname="Tony";
       String lastName="Stark";
       String fullName=firstname+" "+lastName;
       System.out.println(fullName);
       System.out.println(fullName.length());

       for(int i=0;i<fullName.length();i++)
       {
        System.out.println(fullName.charAt(i));
       }
        
    }
    
}
