import java.util.ArrayList;

public class Recursion_level03 {


    // Q1 .. print all permutations of string
    // "abc"
    // O(n!)  time complexity
    
    
    //      public static void printperm(String str, String permutation )
    //      {
    //          if(str.length() == 0)
    //          {
    //              System.out.println(permutation);
    //              return;
    //          }
//      
    //          for(int i=0;i<str.length();i++)
    //          {
    //              char currChar=str.charAt(i);
    //              String newStr = str.substring(0, i)+str.substring(i+1);
    //              printperm(newStr, permutation+currChar);
    //          }
    //      }
    //      public static void main(String[] args) {
    //          String str="abc";
    //          printperm(str, "");
    //      }




    // q2. count total paths in a mazo to move from (0,0) to (n,m)
    // public static int countPath(int i,int j, int n , int m )
    // {
        // if(i==n || j==m)
        // {
            // return 0;
        // }
        // if(i== n-1 && j== m-1)
        // {
            // return 1;
        // }
        // move downwords
        // int downPaths = countPath(i+1, j, n, m);
// 
        // move right
        // int rightPaths = countPath(i, j+1, n, m);
// 
        // return downPaths+rightPaths;
    // }
    // public static void main(String[] args) {
        // int n=3,m=3;
        // int totalPaths = countPath(0, 0, n, m);
        // System.out.println(totalPaths);
    // }







    // q. place tiles of size 1*m in a floor of size n*m
    
    // public static int placeTiles(int n,int m)
    // {
    //     if(n == m){
    //         return 2;
    //     }
    //     if(n<m)
    //     {
    //         return 1;
    //     }
    //     // vertically
    //     int vertPlacements = placeTiles(n-m, m);
    //     // horizontally
    //     int horplacements = placeTiles(n-1, m);
    //     return vertPlacements+ horplacements;

    // }
    // public static void main(String[] args) {
    //     int n=4,m=2;
    //     System.out.println(placeTiles(n, m));
    // }
     






    // q.find the number of ways in which you can invite n people to your party, single or in pairs
       
    
    
    // public static int callguest(int n)
    //     {
    //         if(n <=1)
    //         {
    //             return 1;

    //         }
    //         // single
    //         int ways1=callguest(n-1);
    //         // pair
    //         int ways2=(n-1)*callguest(n-2);

    //         return ways1 + ways2;

    //     }
    // public static void main(String[] args) {
    //     int n=4;
    //     System.out.println(callguest(n));
        
    // }






    // q. print all the subsets of a set of n natural numbers 



    public static void printSubset(ArrayList<Integer> subset)
    {
        for (int i=-0; i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void  findSubsets(int n, ArrayList<Integer> subset)
    {

        if(n==0)
        {
            printSubset(subset);
            return ;
        }
        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        // add nehi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList <Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
