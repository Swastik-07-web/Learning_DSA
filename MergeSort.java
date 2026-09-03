import java.util.*;
public class MergeSort {

    public static void merge(int arr[],int low,int mid,int high)
    {
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]>arr[right])
            {
                temp.add(arr[right]);
                ++right;
            }
            else
            {
                temp.add(arr[left]);
                ++left;
            }

            }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);

        }
        

        }
    
    public static void mergesort(int arr[],int low,int high)
    {
        if(low>=high)
            return;

        int mid=low+(high-low)/2;
        mergesort(arr,low,mid);  //for the left half
        mergesort(arr,mid+1,high);  //for the right half
        merge(arr,low,mid,high);  //sort every part and merge
        
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=in.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        mergesort(arr,0,n-1);
        System.out.print("The sorted Array: ");
        for(int num:arr)
        {
            System.out.print(num+" ");
        } 

    
    }
}
