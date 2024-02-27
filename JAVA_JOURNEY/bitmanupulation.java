public class bitmanupulation {
    public static void main(String[] args) {
        // get


       // get the 3rd bit (position=2) of a number n 
        //  n=0101
        //     0101(3210  position)
        // bit mask=1<<i here i =2 given   ***************
        //  0001 --->  0100
        //  now 0100 And 0101     ***************
        //    0100 & 0101
        //     only 1 and 1 =0
        //       baki sob a 0 
        // ans =========== 0100
        //  if the final ans  is non zero then bit =1
        // if final ans  is zero then bit =0

        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        if((bitMask & n)==0)
        {
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit out 1");
        }






        // set

        // set the 2nd bit (position 1) of a number
        // n = 0101
        // process 1:    bit mask: 1<<i
        // process 2:    operation : OR

        int n1=8;
        int pos1=1;
        int bitmask1=1<<pos1;

        int newNumber=bitmask1 | n1;
        System.out.println(newNumber);



        // clear

        // clr the 3rd bit position=2 of a number n
        //   here ,   n = 0101
        //    operation:
        //     bit mask: 1<<i
        //     and with not 
        //     and with the not of BM
        //       1<<i,i=2.......0100
        //        not of 0100 ... 1011
        //   now ... and with 1011
        //         (1011)&(0101)...then same processs....

        int n2=50;
        int pos2=2;
        int bitmask2=1<<pos2;
        int notBitMask=  ~(bitmask2);

        int newNumber2=notBitMask & n;
        System.out.println(newNumber2);




        // update


        // update the 2nd bit pos 1 of a number n to 1.
        //    n = 0101

        // for 0.... clr operation 
        // for 1 ..... set operation 
        

    }
    
}
