import java.util.*; 
public class Dutch_National_Flag {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n;
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int mid=0,low=0,high=n-1;
        int temp=0;

        while(high>=mid)
        {
            if(arr[mid]==0)
            {
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        System.out.print("The sorted array:  ");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
    }
    
}
