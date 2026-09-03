import java.util.*;
public class recursion_palindrome_string {
    
    static String str;

    public static boolean palindrome(int p)
    {
        int n=str.length();
        if(p>=n/2)
            return true;
        
        if(str.charAt(p)!=str.charAt(n-1-p))
            return false;

        return palindrome(++p);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=in.nextLine();
        boolean check=palindrome(0);
        if(check)
            System.out.print("The string is Palindrome.");
        else
            System.out.print("The string is not Palindrome.");
    }

}   
        
    


    

