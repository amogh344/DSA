public class BinarySearch {
    public static int binSearch(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        while (start <= end)
        {
            int mid=(start+end)/2;
            if (numbers[mid] == key) 
            {
                return mid;
            }
            if (numbers[mid]<key) 
            {
                start=mid+1;            
            }
            else
            {
                end=mid-1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        
        int[] numbers = {3, 8, 12, 15, 19, 23, 27, 31, 36, 42};
        int key=8;
        System.out.println("Index of key is :"+binSearch(numbers, key));
    }

}
