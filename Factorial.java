import java.math.BigInteger;
public class Factorial {
    static BigInteger factorial(int n)
    {
        BigInteger a = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            a = a.multiply(BigInteger.valueOf(i));
        return a;
    }
    public static void main(String args[]) throws Exception
    {
        int n = 100;
        System.out.println("The factorial of "+n+" is "+factorial(n));
    }
}
