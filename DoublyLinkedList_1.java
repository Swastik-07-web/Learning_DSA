class Node
{
    int data;
    Node next;
    Node back;
    
    Node(int data, Node next, Node back)
    {
        this.data=data;
        this.next=next;
        this.back=back;
    }

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.back=null;
    }

}
public class DoublyLinkedList_1 {

    public static Node Arr2DLL(int arr[])
    {
        int n=arr.length;
        Node head=new Node(arr[0]);
        Node previous=head;
        int i;
        for(i=1; i<n; i++)
        {
            Node temp=new Node(arr[i],null,previous);
            previous.next=temp;
            previous=temp;
        }
        return head;
    } 
    
    public static Node deleteHead(Node head)
    {
        Node previous=head;
        head=head.next;
        head.back=null;
        previous.next=null;
        return head;
    }

    public static Node deleteTail(Node head)
    {
        Node previous=head;
        if(head==null)
            return null;
        Node temp=head.next;
        while(temp.next!=null)
        {
            temp=temp.next;
            previous=previous.next;
        }
        temp.back=null;
        previous.next=null;
        return head;
    }

    public static Node remove_kth_element(Node head, int k)
    {
        if(head==null)
        {
            return null;
        }

        else if(k==1 && head.next!=null)
        {
            Node previous=head;
            head=head.next;
            head.back=null;
            previous.next=null;
            return head;

        }
        else if(head.next==null)
        {
            head=null;
            return head;   
        }

        int cnt=1;
        Node temp=head;
        Node previous;

        while(temp!=null)
        {
            if(cnt==k)
            {
                previous=temp.back;
                previous.next=temp.next;
                if(temp.next!=null)
                    temp.next.back=previous;
                break;
            }
            cnt++;
            temp=temp.next;
        }

        return head;
    }

    public static Node insertHead(Node head, int val)
    {
        if(head==null)
        {
            Node newhead=new Node(val);
            return newhead;
        }

        Node newHead=new Node(val,head,null);
        head.back=newHead;
        return newHead;


    }

    public static Node insertTail(Node head, int value)
    {
        if(head==null)
        {
            Node tail=new Node(value);
            return tail;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node tail=new Node(value,null,temp);
        temp.next=tail;
        return head;
    }

    public static Node insert_Kth_pos(Node head, int k, int val)
    {
        if(head==null)
            return null;

        Node temp=head;
        int c=1;
        while(temp!=null)
        {
            if(c==k)
            {
                Node previous=temp.back;
                Node x=new Node(val,temp,previous);
                previous.next=x;
                temp.back=x;
                break;
            }
            c++;
            temp=temp.next;
        }
        return head;
    }

    public static Node reverseDLL(Node head)
    {
        Node temp=null;
        Node curr=head;

        while(curr!=null)
        {
            temp=curr.back;
            curr.back=curr.next;
            curr.next=temp;

            curr=curr.back;
        }
    }

    
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        Node head=Arr2DLL(arr);
        Node temp=head;
        System.out.print("Before Insertion: ");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        /*Node head1=deleteHead(head);
        Node temp1=head1;
        System.out.print("After Removal: ");
        while(temp1!=null)
        {
            System.out.print(temp1.data+" ");
            temp1=temp1.next;
        }
        System.out.println();*/

       /*  Node head2=deleteTail(head);
        Node temp2=head2;
        System.out.print("After Removal: ");
        while(temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
        System.out.println();*/

        /*Node head3=remove_kth_element(head, 4);
        Node temp3=head3;
        System.out.print("After Removal: ");
        while(temp3!=null)
        {
            System.out.print(temp3.data+" ");
            temp3=temp3.next;
        }
        System.out.println();*/

       /*  Node head4=insertHead(head, 0);
        Node temp4=head4;
        System.out.print("After insertion: ");
        while(temp4!=null)
        {
            System.out.print(temp4.data+" ");
            temp4=temp4.next;
        }
        System.out.println();*/

       /* Node head5=insertTail(head, 7);
        Node temp5=head5;
        System.out.print("After insertion: ");
        while(temp5!=null)
        {
            System.out.print(temp5.data+" ");
            temp5=temp5.next;
        }
        System.out.println();*/

        Node head6=insert_Kth_pos(head, 4,7);
        Node temp6=head6;
        System.out.print("After insertion: ");
        while(temp6!=null)
        {
            System.out.print(temp6.data+" ");
            temp6=temp6.next;
        }
        System.out.println();

        

    }

        
    
}

        


    

    

