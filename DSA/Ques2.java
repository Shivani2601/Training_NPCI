package DSA;
public class Ques2 {
    
    public static void main(String[] args) {
        int arr[]=new int[] {1,5,5,8,9};
        int find=5;

        firstOccurence(arr, find);
        allOccurence(arr, find);
    }

    public static void firstOccurence(int arr[], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {System.out.println(i);
             return;
           }
        }
        
    }

    public static void allOccurence(int arr[], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
               System.out.println(i);
            }
        }
    }
}
