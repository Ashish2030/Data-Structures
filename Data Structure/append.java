import java.util.*;
public class append
{ 
   static Node head;
       Node temp;
    Node prev1;
    class Node 
    { 
        int data; 
        Node prev; 
        Node next; 
        Node(int d)
        {
            data = d;
        } 
    } 
    public void append_value(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            prev1=n;
            
        }
        else
        {
            prev1.next=n;
            n.prev=prev1;
            prev1=n; 
        }
    }
     public void Print(Node head)
{
	if(head==null)
    {
     	return; 	
	}
  	System.out.print(head.data+"-");
  	Print(head.next);
}
    public static void main(String arg[])
    {
        append b=new append();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
          int data=sc.nextInt();
          b.append_value(data); 
          a--;
        }
         b.Print(head);
    }
}
