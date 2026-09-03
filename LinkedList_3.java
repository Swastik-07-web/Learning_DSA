class Node
{
    int data;
    Node next;

    Node(int data, Node next)
    {
        this.data=data;
        this.next=next;
    }

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }

}
public class LinkedList_3 {

    public static Node Arr2LL(int arr[])
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

    public static Node removeValue(Node head, int value)
    {
        if(head==null)
            return null;
        Node temp=head;
        if(head.data==value)
        {
            head=temp.next;
            return head;
        }
        Node previous=null;
        while(temp!=null && temp.data!=value)
        {
            previous=temp;
            temp=temp.next;
        }
        if(temp!=null)
            previous.next=previous.next.next;
        return head;
    }
    public static Node remove_Kth_element(Node head,int k)
    {
        if(head==null)
            return null;

        Node temp=head;
        if(k==1)
        {
            head=temp.next;
            return head;
        }
        int idx=1;
        Node previous=null;
        while(temp!=null)
        {   
            if(k==idx)
            {
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
            idx++;
        }
        return head;
    }

    public static Node insertHead(Node head, int value)
    {
        Node temp=new Node(value,head);
        return temp;

    }

    public static Node insertTail(Node head, int value)
    {
        if(head==null)
            return null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node tail=new Node(value);
        temp.next=tail;
        return head;

    }

    public static Node insert_kth_pos(Node head, int k, int value)
    {
        if(head==null)
        {
            if(k==1)
            {
                Node temp=new Node(value,head);
                return temp;
            }
        }
        if(k==1)
        {
            Node temp=new Node(value,head);
            return temp;
        }

        Node temp=head;
        int c=1;
        while(temp!=null)
        {
            
            if(c==k-1)
            {
                Node x=new Node(value);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            c++;
            temp=temp.next;
        }
        return head;
    }
    public static Node insertBeforeValue(Node head, int val_pr, int value)
    {
        if(head==null)
        {
            Node temp=new Node(value,head);
            return temp;
        }
        if(head.data==val_pr)
        {
            Node temp=new Node(value,head);
            return temp;
        }

        Node temp=head;
        while(temp!=null && temp.next.data!=val_pr)
        {
            temp=temp.next;
        }
        if(temp!=null)
        {
            Node x=new Node(value);
            x.next=temp.next;
            temp.next=x;
        }
         return head;
    }
    public static Node reverse(Node head)
    {
        Node pre=null;
        Node curr=head;
        while(curr!=null)
        {
            Node front=curr.next;
            curr.next=pre;
            pre = curr;
            curr=front;
            if(front!=null)
                front=front.next;
        }
        return pre;
    }
    public static Node plusOne(Node head)
    {
        Node newHead=reverse(head);
        Node temp=newHead;
        if(newHead.data<9)
        {
            newHead.data=newHead.data+1;
            Node value=reverse(newHead);
            return value;
        }
        while(temp!=null)
        {
            if(temp.data==9 && temp.next==null)
            {
                temp.data=0;
                Node tail=new Node(1);
                temp.next=tail;
                break;
            }
            else if(temp.data==9)
                temp.data=0;
           
            else if(temp.data<9)
            {    
                temp.data=temp.data+1;
                Node value=reverse(newHead);
                return value;
            }
            temp=temp.next;
             
        }
        Node value=reverse(newHead);
        return value;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        Node head=Arr2LL(arr);
        Node temp=head;
        System.out.print("Before Reversal: ");
         while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

       /*  Node head_1=remove_Kth_element(head,1);
        Node temp_1=head_1;
        System.out.println("After removal: ");
        while(temp_1!=null)
        {
            System.out.print(temp_1.data+" ");
            temp_1=temp_1.next;
        }
        System.out.println();*/
        
        /*Node head_2=removeValue(head,1);
        Node temp_2=head_2;
        System.out.println("After removal: ");
        while(temp_2!=null)
        {
            System.out.print(temp_2.data+" ");
            temp_2=temp_2.next;
        }
        System.out.println();*/

        /*Node head_3=insertHead(head,0);
        Node temp_3=head_3;
        System.out.print("After insertion: ");
        while(temp_3!=null)
        {
            System.out.print(temp_3.data+" ");
            temp_3=temp_3.next;
        }
        System.out.println();*/

        /*Node head_4=insertTail(head, 8);
        Node temp_4=head_4;
        System.out.print("After insertion: ");
        while(temp_4!=null)
        {
            System.out.print(temp_4.data+" ");
            temp_4=temp_4.next;
        }
        System.out.println();*/ 

       /*  Node head_5=insert_kth_pos(head,3,100);
        Node temp_5=head_5;
        System.out.print("After insertion:: ");
        while(temp_5!=null)
        {
            System.out.print(temp_5.data+" ");
            temp_5=temp_5.next;
        }
        System.out.println();*/

        /*Node head_6=insertBeforeValue(head,5,99);
        Node temp_6=head_6;
        System.out.print("After insertion: ");
        while(temp_6!=null)
        {
            System.out.print(temp_6.data+" ");
            temp_6=temp_6.next;
        }
        System.out.println();*/

        Node head_7=reverse(head);
        Node temp_7=head_7;
        System.out.print("Reversal: ");
        while(temp_7!=null)
        {
            System.out.print(temp_7.data+" ");
            temp_7=temp_7.next;
        }
        System.out.println();





    }
}        



    

