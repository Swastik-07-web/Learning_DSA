import java.util.*;
public class Rearrange_Signed_Array_Elements {
    
    public static void main(String args[])
    {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        i=0;
        for(int nums : pos)
        {
            arr[i]=nums;
            i+=2;
        }
        i=1;
        for(int nums : neg)
        {
            
            arr[i]=nums;
            i+=2;

        }
        System.out.println("The arranged array: ");
        for(int nums : arr)
        {
            System.out.print(nums+" ");
        }
    }
}
