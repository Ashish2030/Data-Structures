
public class pair { 
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

	void pair(Node head,int data)
	{ 
	    Node head1=head;
	    int flag=0;
    while(head1!=null)
    {
        Node head2=head1.next;
        while(head2!=null)
        {
            if(data==(head1.data+head2.data))
            {
                flag=1;
                   System.out.println( "(" + head1.data +  
                                ", "+ head2.data + ")" ); 
            }
            head2=head2.next;
        }
        head1=head1.next;
    }
    if(flag==0)
    {
        System.out.println("Pair not found");
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
			System.out.println(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		pair list = new pair(); 


		list.push(2); 
		list.push(4); 
		list.push(6); 
		list.push(10); 
list.push(1); 
		list.push(3); 
		list.push(5); 
		list.push(7); 

		System.out.println("Original linked list "); 
		list.printList(head); 

		list.pair(head,12); 
	
	} 
} 

