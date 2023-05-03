public class LinkedList {
    Node head ;


    public void insert(int x)
    {
        Node curr;
        Node newnode= new Node(x);
        curr=head;

        if (head==null)
        {
            head =newnode;

        }

        else
        {

            newnode.next = null;

            while (curr.next!=null)
            {
                curr = curr.next;
            }

            curr.next = newnode;
        }
      //  return newnode;
    }



    public void printList()
    {
        Node curr;
        curr=head;

        if (head==null)
            System.out.print("head is null ");

        else
        {
            while (curr!=null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println(" ");

        }
    }

    public void search(int x)
    {
        Node curr;
        curr=head;

        if (head==null)
        {System.out.print("empty, cant search");
        }

        else {
            while (curr != null)
            {
                if (curr.data == x)
                {
                    System.out.println("found "+curr.data);
                    return;

                }
                else
                    curr = curr.next;

            }
System.out.print("not found");
            return;

        }
    }

    public void deleteNode(int data) {
        if (head == null)
            return;

        // ListNode prev=head;
        Node curr;
        Node prev = head;

        curr = head.next;


        while (curr.next != null)
        {
            if (curr.data == data)
            {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;

        }
    }


    public int minimum()
    {

        Node curr;
        int min=0 ;
        curr=head;
        min= Integer.MAX_VALUE;

//        if (head==null)
//            return -1;



            while(curr!=null)
            {
                if(curr.data<min)
                {
                    min=curr.data;
                     //break;
                }
                curr=curr.next;
            }
            System.out.print("Minimum value is ");
        return min;
    }

    public int maximum()
    {
        Node curr;
        int max= Integer.MIN_VALUE;
        curr=head;

        while (curr!=null)
        {
            if ( curr.data > max )
            {
                max=curr.data;
            }
            curr = curr.next ;

        }
        System.out.print("Maximum value is ");
        return max;
    }

    public void sorting()
    {
        Node prev=head;
        Node curr=prev.next;
        int temp=curr.data;


        while (curr!=null)
        {

            if(prev.data > curr.data)
            {
                temp=prev.data;
                prev.data=curr.data;
                curr.data=temp;
            }
            curr=curr.next;
            prev=prev.next;
        }

        printList();
    }

    public int countLength() {

        Node curr=head;
        Node prev = curr.next;


        int count=0;

        while(curr!=null)//curr abhi last pe hai
        {

            curr=curr.next;
            count++;
        }
        return count;
    }

    public Node deleteKthFromEnd(int n )
    {
        int len= countLength();
        int nodeFromBeginning = len-n;
        Node curr=head.next;
        Node prev=null;

      for(int i=1;i<nodeFromBeginning; i++)
      {
          prev=curr;
          curr=curr.next;
      }

      prev.next=curr.next;
      return head;

    }

    public Node reverse()
    {
        Node curr=head;
        Node prev= null;
        Node currNext = null;

        while(curr!=null)
        {
            currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }

        head=prev;

        System.out.println(" ");
        printList();

        return head;
    }





}



