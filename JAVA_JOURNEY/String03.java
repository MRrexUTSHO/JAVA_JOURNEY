public class String03 {
    public static void main(String[] args) {
        String sentence="I am IRONMAN";
       // substring(beg index, end index);
        String name=sentence.substring(11,sentence.length());
        String name2=sentence.substring(2, 9);
        System.out.println(name);
        System.out.println(name2);
    }
    
}
