public class recursion_oneShot {

    //       public static void printNumb(int n)
    //       {
    //           if(n==0)
    //           {
    //               return;
    //           }
    //           System.out.println(n);
    //           printNumb(n-1);
    //       }
//       
//       
    //       public static void main(String[] args) {
    //           int n=50;
    //           printNumb(n);
//       
    //       }


    public static void printNumb(int n)
    {
        if(n==10001)
        {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }


    public static void main(String[] args) {
        int n=1;
        printNumb(n);
    }
    
}
