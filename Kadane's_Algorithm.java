import java.util.*;
public class Kadane's_Algorithm {

public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the size of the array: ")
    int n;
    n=in.nextInt();
    int arr[]=new int[n];
    int i,sum=0;
    System.out.println("Enter the array elements: ");
    for(i=0;i<n;i++)
    {
        arr[i]=in.nextInt();

    }
    int max_sum=Integer.MIN_VALUE;
    for(i=0;i<n;i++)
    {
        sum+=arr[i];
        if(sum<0)
        {
            sum=0;
        }
        else if(sum>max_sum)
        {
            max_sum=sum;
        }
    }
    System.out.println("The maximum sub array sum: "+max_sum);

}
    
}
