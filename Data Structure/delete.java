import java.util.*;
public class delete
{ 
   static Node head;
     static  Node temp;
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
     public void After(int a)
    {
    Node head1=head;
    int flag=0;
    while(head1!=null)
    {
       if(head1.data==a) 
       {
           flag=1;
           if(head1.next==null)
           {
               System.out.println("No data found to delete");
              return;
           }
           else
           {
             temp=head1.next;
             temp=temp.next;
             if(temp!=null)
             {
               temp.prev=head1;
             head1.next=temp;  
             }
             else
             {
                  delete_atlast(head);// head1.next=null;
             }
           }
       }
       head1=head1.next;
    }
    if(flag==0)
    {
        System.out.println(a+" Not found");
    }
    }
         public void before(int a)
    {
    Node head1=head;
    int flag=0;
    while(head1!=null)
    {
       if(head1.data==a) 
       {
           if(head1.prev==null)
           {
            System.out.println("No data found to delete");
              return;
           }
           else
           {
               if(prev1.prev==null)
               {
                       delete_atfirst(head)   ;                                   // head=head1;
               }
               else
               {
                   
       temp=prev1.prev;
       head1.prev=temp;
       temp.next=head1;
               }
           }
           flag=1;
       }
       prev1=head1;
       head1=head1.next;
    }
    if(flag==0)
    {
    System.out.println(a+" Not Found in the list");
    }
    }
       public void push(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            prev1=n;
            
        }
        else
        {
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
      public static void  delete_atfirst(Node head1)
    {
        head1=head1.next;
       head1.prev=null;
       head=head1;
    }
       public static void  delete_atlast(Node head1)
    {
       while(head1.next!=null)
       {
           head1=head1.next;
       }
      temp= head1.prev;
      temp.next=null;
    }
    public void delete(int a)
    {
        int flag=0;
    Node head1=head;
    while(head1!=null)
    {
        if(head1.data==a)
        {
            if(head1.prev==null)
            {
               delete_atfirst(head);
            }
            else if(head1.next==null)
            {
                 delete_atlast(head);
            }
            else
            {
            temp=head1.prev;
            temp.next=head1.next;
            temp=head1.next;
            temp.prev=head1.prev;
            flag=1;
        }
        }
        head1=head1.next;
    }
    if(flag==0)
    {
        System.out.println("No data found");
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
        delete b=new delete();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
          int data=sc.nextInt();
          b.append_value(data); 
          a--;
        }
         System.out.println("After append function");
        b.Print(head);
         int push_data=sc.nextInt();
        b.push(push_data);
        System.out.println("\npush "+push_data+" data in function");
         b.Print(head);
         delete_atfirst(head);
           System.out.println("\n delete at first index function");
          b.Print(head);
           delete_atlast(head);
           System.out.println("\n delete at last index function");
          b.Print(head);
          
         int After_node_delete=sc.nextInt();
           System.out.println("\nAfter delete at node whose data is  "+After_node_delete+" function");
         b.After(After_node_delete);
        
         b.Print(head);
          int before_node=sc.nextInt();
           System.out.println("\nBefore delete at node whose data is  "+before_node);
         b.before(before_node);
         b.Print(head);
         int node=sc.nextInt();
          System.out.println("\ndelete a specific node "+node);
          b.delete(node);
          b.Print(head);
          
         
         
        
    }
}
