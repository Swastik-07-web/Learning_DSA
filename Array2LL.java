class Node
{
    int data;
    Node next;

    Node(int data1, Node next1)
    {
        this.data=data1;
        this.next=next1;
    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
    }
}
public class Array2LL {

    public static Node ConvertArr2LL(int[] arr)
    {
        Node head=new Node(arr[0]);
        Node mover=head;
        int i;
        for(i=1; i<arr.length; i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        Node head=ConvertArr2LL(arr);
        System.out.print(head.data);

    }
    
}
