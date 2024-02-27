import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button =sc.nextInt();

        //     if(x%2==0){
                // System.out.println("Even");
        //     }else {
                // System.out.println("odd");
        //     }
        switch (button) {
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namaste");
            break;
            case 3:System.out.println("marvel");
            break;
            case 4:System.out.println("peter");
            break;

        
            default: System.out.println("invalid button");
                
        }
    }
}
// there is also a cxoncept of else if 
// if() else if() else()
// if ok ... then else part no need 
// if not okey .. chk else if and then  else 