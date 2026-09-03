import java.util.*;
public class highest_lowest_frequency 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        int i;
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        int max_frequency=0;
        int min_frequency=Integer.MAX_VALUE;   //stores the maximum value of the integer

        int max_freq_element=0;
        int min_freq_element=0;

        for(Map.Entry<Integer,Integer> entry: frequency.entrySet()) //traversing HashMap
        {
            int freq=entry.getValue();
            int element=entry.getKey();

            if(freq>max_frequency)
            {
                max_frequency=freq;
                max_freq_element=element;
            }
            if(freq<min_frequency)
            {
                min_frequency=freq;
                min_freq_element=element;
            }
        }
        System.out.println(max_freq_element+" has the highest frequency of "+max_frequency);
        System.out.print(min_freq_element+" has the lowest frequency of "+min_frequency);
        

        
    }

    
}
    

