import java.util.*;
public class Buy_Sell_Stock {
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=in.nextInt();
        System.out.print("Enter the price of stock everyday: ");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int cost;
        int max_profit=0;
        int mini=arr[0];
        for(i=1;i<n;i++)
        {
            cost=arr[i]-mini;
            max_profit=Math.max(max_profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("The max_profit: "+max_profit);
    }
}
