import java.util.*;
public class Leaders_in_arrays {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=in.nextInt();
        int arr[]=new int[n];
        List<Integer> leaders=new ArrayList<>();
        System.out.println("Enter the array elements: ");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int max_value=Integer.MIN_VALUE;
        for(i=n-1;i>=0;i--)
        {
           if(arr[i]>max_value)
           {
            max_value=arr[i];
            leaders.add(max_value);
           }
           
            
        }
        System.out.println("The leaders: ");
        System.out.println(leaders);
    }
    
}
