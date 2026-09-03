import java.util.*;
public class moving_zeros_to_end {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=in.nextInt();
        int i,j=-1,temp=0;
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        for(i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println("The new array: ");
        for(int num: arr)
        {
            System.out.println(" "+num);
        }
        System.out.println();

    }

    
}
