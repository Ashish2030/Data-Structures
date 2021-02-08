import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Node
{
  int data;
  Node next;
  Node(int d)
  {
    data=d;
  }
}

class shift_element
{
  static Node insertEnd(Node head, int data)
  {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

static void forwardPrint(Node head)
{
	if(head==null)
    {
     	return; 	
	}
  	System.out.print(head.data+"-");
  	forwardPrint(head.next);
}

static void shift_element(Node head,int num)
{
    int count=0;
    Node prev=null;
    Node head1=head;
    Node temp=null;
     Node temp2=null;
      Node head2=head;
	while(head1!=null)
	{
	    count++;
	     prev=head1;
	    head1=head1.next;
	}
	temp2=prev;
	for(int i=0;i<count-num;i++)
	{
	    prev=head2;
	    head2=head2.next;
	}
	temp=head;
	head=prev.next;
	prev.next=null;
	temp2.next=temp;
	
forwardPrint(head);
}
public static void main(String[] args)
  {
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0)
    {
      Node head = null;
      n = Integer.parseInt(s.nextLine());
      while(n > 0)
      {
        m = Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      int element = Integer.parseInt(s.nextLine());
      forwardPrint(head);
      System.out.print("\n");
      shift_element(head,element);
      System.out.print("\n");
      t--;
    }
  }
}