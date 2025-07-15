package Basic;

public class SwapTwoNumbers {
    public static void main(String[] args) 
    {
        
        int a=2;
        int b=3;
        System.out.println("a="+a+" b="+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a+" b="+b);
    }

}