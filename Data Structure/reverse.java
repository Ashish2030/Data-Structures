

public class reverse { 
  Node prev1;
	static Node head; 

	static class Node { 

		int data; 
		Node next, prev; 

		Node(int d) { 
			data = d; 
			next = prev = null; 
		} 
	} 

	void reverse() { 
	    Node t=head;
	    Node prev1=null;
while(t!=null)
{
    prev1=t;
    t=t.next;
}
head=prev1;
t=prev1;
Node o;
Node q;
while(t!=null)
{
   o=t.prev;
   q=t.next;
   t.next=t.prev;
   t.prev=q;
    t=o;
}


	} 

	void push(int data)
	{ 

	  Node k=new Node(data);
    
        if(head==null)
        {
            prev1=k;
            head=k;
        }
        else
        {
            prev1.next=k;
            k.prev=prev1;
            prev1=k;
        }
	} 
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		reverse list = new reverse(); 


		list.push(2); 
		list.push(4); 
		list.push(8); 
		list.push(10); 

		System.out.println("Original linked list "); 
		list.printList(head); 

		list.reverse(); 
		System.out.println(""); 
		System.out.println("The reversed Linked List is "); 
		list.printList(head); 
	} 
} 

