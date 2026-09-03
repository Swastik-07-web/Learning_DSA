import java.util.*;
public class sorting_arrays_with_0_1_2 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=in.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        int c0=0,c1=0,c2=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else
                c2++;
        }
        for(i=0;i<n;i++)
        {
            if(i<=c0)
                arr[i]=0;
            else if(i<c0+c1)
                arr[i]=1;
            else
                arr[i]=2;
        }
        System.out.print("The sorted array: ");
        for( int num: arr)
        {
            System.out.print(num+" ");
        }

    }
    
}
