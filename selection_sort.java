
import java.util.*;
public class selection_sort
{
    public static void selectionSort(int arr[], int n)
    {
        int i,j,t;
        int min;
        int small_idx=0;
         for(i=0;i<n;i++)
        {
            min=arr[i];
            small_idx=i;
            for(j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    small_idx=j;
                }
                
            }
            t=arr[i];
            arr[i]=arr[small_idx];
            arr[small_idx]=t;
        }
        System.out.println("The Sorted Array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int arr[],int n)
    {
        int i,j,t=0;
        for(i=0;i<n;i++)
        {
            j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;
                --j;

            }
        }
        System.out.println("The Sorted Array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
  public static void main(String sc[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
       
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        
        selectionSort(arr,n);
        insertionSort(arr,n);
    
    }
}
    
