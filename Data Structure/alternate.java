import java.util.*;
	 class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
class LinkedList 
{ 
static	Node head; 
static	Node tail; 
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
static Node AlternatingSplit()
{
Node head1=head;
Node head2=null;
Node prev=null;
Node temp=null;
Node temp1=null;
int count=0;
while(head1!=null)
{
    temp1=head1.next;
    if(count%2!=0)
    {
        prev.next=head1.next;
        if(head2==null)
        {
            head1.next=null;
            head2=head1;
            temp=head2;
        }
        else
        {
        head1.next=null;
        temp.next=head1;
        }
    }
    count++;
       prev=head1;
    head1=temp1;
}
return head2;
}
	public void printList() 
	{ 
	    Node n=head;
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
			System.out.println(); 
	} 
}
class alternate
{
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

Node m=llist.AlternatingSplit();
		llist.printList(); 
		LinkedList.head=m;
		llist.printList(); 
		
	} 
}

