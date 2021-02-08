
public class linear_sort{ 
//-------by ashish------
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

    public void sort(Node head)
    {  
     Node k=null;
     Node k1=null;
     int temp;
  
     for(k=head;k.next!=null;k=k.next)
     {
         for(k1=k.next;k1!=null;k1=k1.next)
         {
             if(k.data>k1.data)
             {
                 temp=k.data;
                 k.data=k1.data;
                 k1.data=temp;
             }
         }
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
		linear_sort list = new linear_sort(); 


		list.push(5); 
		list.push(4); 
		list.push(3); 
		list.push(2); 
			list.push(1); 
	

		list.sort(head); 
		list.printList(head);
	
	} 
} 

