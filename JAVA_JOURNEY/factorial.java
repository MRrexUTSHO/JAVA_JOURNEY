public class factorial {

    public static int calcfact(int n)
    {
        if( n == 1 || n == 0)
        {
            return 1;
        }
        int fact_nm1=calcfact(n-1);
        int fact_n = n* fact_nm1;
        return fact_n;

    }
    public static void main(String[] args) {
        int n=10;
        int ans= calcfact(n);
        System.out.println(ans);
    }
    
}
