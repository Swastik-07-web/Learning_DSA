import java.util.*;
public class union_sorted_arays {
    public static void main(String args[])
        {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int n1,n2,i;
        n1=in.nextInt();
        System.out.println("Enter the size of array 2: ");
        n2=in.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        List<Integer> union=new ArrayList<>();
        System.out.println("Enter the array 1 elements in sorted way: ");
        for(i=0;i<n1;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the array 2 elements in sorted way: ");
        for(i=0;i<n1;i++)
        {
            arr2[i]=in.nextInt();
        }
        i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                if(union.size() == 0 || union.get(union.size()-1)!=arr1[i])
                {
                    union.add(arr1[i]);
                }
                i++;
            }
            else
            {
                 if(union.size() == 0 || union.get(union.size()-1)!=arr2[j])
                {
                    union.add(arr2[j]);
                }
                j++;
            }
         }
         while(i<n1)
         {
            if(union.size() == 0 || union.get(union.size()-1)!=arr1[i])
                {
                    union.add(arr1[i]);
                }
                i++;
         }
         while(j<n2)
         {
            if(union.size() == 0 || union.get(union.size()-1)!=arr2[j])
                {
                    union.add(arr2[j]);
                }
                j++;
         }
         System.out.println("The union: "+union);
        }

}


