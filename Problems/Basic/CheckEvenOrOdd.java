package Basic;
public class CheckEvenOrOdd 
{
    public static boolean isEven(int n)
    {
        int rem=n%2;
        if (rem==0) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int n=15;
        if (isEven(n)) 
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
