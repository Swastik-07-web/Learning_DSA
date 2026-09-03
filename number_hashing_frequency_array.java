import java.util.*;
public class number_hashing_frequency_array {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array within 12: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        int hash[]=new int[13];
        hash[13]=0;
 
        //input process
        System.out.println("Enter the array elements[Elements value should not be more than 12]: ");
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        //precomputation\hashing
        for(int i=0;i<n;i++)
            ++hash[arr[i]];

        //fetching
        System.out.print("Enter the number of elements to find their frequency for: ");
        int q=in.nextInt();
        System.out.println("Enter the elements within 12: ");
        for(int i=0;i<q;i++)
        {
            int a=in.nextInt();
            System.out.print("The frequency of "+a+": "+hash[a]);
            
        }
    }
}
