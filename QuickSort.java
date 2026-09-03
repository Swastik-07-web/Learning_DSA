
import java.util.*;
public class QuickSort
{   
    public static int partition(int arr[],int low,int high)
    {
        int i,j,temp=0,pivot;
        pivot=arr[low];
        i=low;
        j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low+1)
            {
                j--;
            }
            if(i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=0;
        temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSort(int arr[],int low,int high)
    {   
        if(low<high)
        {
        
        int p_index;
        p_index=partition(arr,low,high);
        quickSort(arr,low,p_index-1);
        quickSort(arr,p_index+1,high);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("The Sorted Array: ");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        
        
    }
    
}
