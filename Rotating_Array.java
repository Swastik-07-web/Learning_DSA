import java.util.*;
public class Rotating_Array {
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=in.nextInt();
        int i,temp_1=0,temp_2=0;
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        temp_1=arr[0];
        temp_2=arr[1];
        for(i=0;i<n-2;i++)
        {
            arr[i]=arr[i+2];     
         
        }
        arr[n-1]=temp_2;
        arr[n-2]=temp_1;
        for(int num:arr)
        {
            System.out.print(" "+num);
        }
        System.out.println();
    }

}
