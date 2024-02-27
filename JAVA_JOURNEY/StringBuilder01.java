public class StringBuilder01 {
    public static void main(String args[]) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);


        // chat at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(1, 'p');
        System.out.println(sb);

        // inserting
        sb.insert(0,'s');
        System.err.println(sb);

        // delete 
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append("1st");
        sb.append("2nd");
        sb.append("3rd");
        System.out.println(sb);

        // reverse
        for(int i=0;i<sb.length()/2;i++)
        {
            int front =i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
    
}
