import java.util.*;
public class max_len_subarray_only_positive {

public static void main(String args[])
{
   
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        int i,j=0,sum=0;
        int maxlen=0;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int k;
        System.out.println("Enter the value of sum: ");
        k=in.nextInt();
        i=0;
        while(i<n)
        {
            sum+=arr[i];
            while(sum>k && j<=i)
            {
                sum=sum-arr[j];
                j++;
            }
           
            if(sum==k)
            {
                int len=i-j+1;
                if(len>maxlen)
                {
                    maxlen=len;
                }
            }
            i++;

        }
        System.out.printf("The maximum length sub array with sum %d is: %d ",k,maxlen);

}
}
    

