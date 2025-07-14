import java.util.*;

public class ArraysCC {
    // public static void update(int marks[])
    // {
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i]=marks[i]+1;
    //     }
    // }

    public static int linearSearch(int numbers[],int key)
    {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy : "+marks[0]);
        // System.out.println("Math : "+marks[1]);
        // System.out.println("Chem : "+marks[2]);

        // int percentage = ((marks[0]+marks[1]+marks[2])/300)*100;

        // System.out.println("Percentage : "+percentage);
        // sc.close();

        // int marks[]={97,98,99};
        // update(marks);

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i]+" ");
        // }


        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        }
        else {

            System.out.println("Key at index : "+index);
        }

    }


    
}