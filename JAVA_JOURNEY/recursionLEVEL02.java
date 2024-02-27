public class recursionLEVEL02 {


   //         public static void towerofHanoi(int n,String src, String helper, String dest)
   //         {
   //             if(n==1){
   //                 System.out.println(" transfer disk "+n+" from "+src+" to "+dest);
   //                 return;
   //             }
   //             towerofHanoi(n-1, src, dest, helper);
   //             System.out.println("Transfer disk "+ n+ " from "+src+" to "+dest);
   //             towerofHanoi(n-1, helper, src, dest);
   //         }
//        
   //         public static void main(String[] args) {
   //             
//        
   //             // tower of hanoi
   //             int n=1;
   //             towerofHanoi(n, "s","h", "d");
//        
   //         }




   // q.2 print a string in reverse 

  //       public static void printRev (String str, int idx)
  //       {
  //        if(idx == 0)
  //        {
  //            System.out.println(str.charAt(idx));
  //            return;
  //        }
  //        System.out.println(str.charAt(idx));
  //        printRev(str, idx-1);
  //       }
  //       public static void main(String[] args)
  //        {
  //            String str ="abcdefg";
  //            printRev(str, str.length()-1);
  //        }




  // q3   find the 1st and last occurance of an element in the string 
    // time complexity O(n)

  // public static int first=-1;
  // public static int last=-1 ;

  // public static void findOccurance(String str , int idx, char element )
  // {
  //   if(idx == str.length()){
  //       System.out.println(first);
  //       System.out.println(last);
  //       return;
  //    }
  //   char currChar = str.charAt(idx);
  //   if(currChar == element)
  //   {
  //       if(first == -1)
  //       {
  //           first = idx;
  //       }else{
  //           last = idx ;
  //       }
  //   }
  //   findOccurance(str, idx+1, element);
  // }
  
  // public static void main(String[] args) {
  //   String str ="abcdavgaartyhja";
  //   findOccurance(str,0,'a' );
  // }




  // q4. check if an array is sorted strictly increrasing 
  //     public static boolean isSorted(int arr[],int idx)
  //     {
  //       if(idx == arr.length-1)
  //       {
  //         return true;
  //       }
  //       if(arr[idx] < arr[idx+1])
  //     {
  //       // array is sorted till now 
  //       return isSorted(arr, idx+1);
  //     }else{
  //       return false;
  //     }
  //     }
  //     public static void main(String[] args) {
  //       int arr[]= {1,2,3,100,250,654,85};
  //       System.out.println(isSorted(arr, 0));
  //     }


  //   q 4 .. move all x to the end of the string 
  //" axbcxxd"

    // public static void moveALLX(String str, int idx,int count,String newString)
    // {
      // if(idx== str.length())
      // {
        // for(int i=0; i<count;i++)
        // {
          // newString += 'x';
        // }
        // System.out.println(newString);
        // return;
      // }
      // char currChar = str.charAt(idx);
      // if(currChar =='x')
      // {
        // count++;
        // moveALLX(str, idx+1, count, newString);
      // }
      // else{
        // newString +=currChar;
        // moveALLX(str, idx+1, count, newString);
      // }
    // }
  // public static void main(String[] args) {
    // String str="axvcghxxtyuioxxkl";
    // moveALLX(str, 0, 0, "");
  // }
  





  // q. remove duplicates in a string 
  // "abacdabcdabcda"------->"abcd" 

  // O(n)

  //       public static boolean[] map=new boolean[26];
  //       public static void removeDuplicates(String str,int idx,String newString)
  //       {
//       
  //         if(idx== str.length())
  //         {
  //           System.out.println(newString);
  //           return;
  //         }
  //         char currChar=str.charAt(idx);
  //         if(map[currChar-'a'] == true)
  //         {
  //           removeDuplicates(str, idx+1, newString);
  //         }
  //         else{
  //           newString += currChar;
  //           map[currChar - 'a']=true;
  //           removeDuplicates(str, idx, newString);
  //         }
  //       }
//       
  //       public static void main(String[] args) {
  //         String str="abbccda";
  //         removeDuplicates(str, 0, "");
  //       }
//       
//       
//       






//    Q. print all the subsequences of a string 

public static void subsequences(String str,int idx,String newString)
{
  if(idx==str.length())
  {
    System.out.println(newString);
    return;
  }
  char currChar = str.charAt(idx);
  // to be
  subsequences(str, idx+1, newString+currChar);
  // or not to be 
  subsequences(str, idx+1, newString);
}
public static void main(String[] args) {
  String str="abcd";
  subsequences(str, 0, "");
}




}
