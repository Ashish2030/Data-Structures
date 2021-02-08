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
 Node delete()
{
    int count=0;
    Node prev=null;
    Node k=head;
    while(k!=null)
    {
          if(count%2!=0)
        {
            prev.next=k.next;
        }
      count++;
      prev=k;
      k=k.next;
    }

    return head;
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
class a1{
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

	llist.delete();
		llist.printList(); 
	} 
}

