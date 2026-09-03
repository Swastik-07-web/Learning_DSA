import java.util.*;
public class max_consecutive_ones {

    public static void main(String args[])
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        int i,count=0,count_max=0;
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
             if(arr[i]==1)
             {
                count++;
            
             }
             if(count>count_max)
             {
                count_max=count;
             }
             if(arr[i]!=1)
             {
                count=0;
             }
        }
        System.out.println("The maximum count of consecutive one is: "+count_max);

    }
    
    
}
