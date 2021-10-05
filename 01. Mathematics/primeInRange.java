public class prime_range  
{
    public static void main(int n)
    {
        int c=0;
        System.out.println("prime numbers within the range are");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            System.out.print(i+",");
            c=0;
        }
    }
}
