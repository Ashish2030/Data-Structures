import java.util.*;
class LinkedList 
{ 
static	Node head; 
static	Node tail; 

	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	  public void addNode(int data)
	  {    
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;
            tail=newNode;
        }    
        else {    
   
            tail.next = newNode;    
            tail = newNode;    
        }   
	  }
static void duplicate()
{
Node head1=head;
Node head2=head;
Node prev=null;
while(head1!=null)
{
    head2=head1.next;
   prev=head1;
    while(head2!=null)
    {
        if(head1.data==head2.data)
        {
            prev.next=head2.next;
        }
        else
        {
           prev=head2; 
        }
        head2=head2.next;
    }
    head1=head1.next;
}
}
	public void printList() 
	{ 
	    Node n=head;
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 
}
class a2{
	public static void main(String[] args) 
	{ 
		LinkedList llist = new LinkedList(); 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int b;
		while(t>0)
		{
		   	 b=sc.nextInt();
		   	  llist.addNode(b);
		    t--;
		}

	llist.duplicate();
		llist.printList(); 
	} 
}

