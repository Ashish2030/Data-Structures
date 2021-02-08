import java.util.*;
public class delete_circular
{ 
    
   static Node head=null;
   static  Node prev1;
   static Node temp;
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d)
        {
            data = d;
        } 
    } 
    
     public void After(int a)
    {
        Node temp;
    Node head1=head;
    int flag=0;
   
    do
    {
       if(head1.data==a) 
       {
           flag=1;
           if(head1.next==head)
           {
               System.out.println("No data found to delete");
              return;
           }
           else
           {
             temp=head1.next;
             temp=temp.next;
             if(temp!=head)
             {
             head1.next=temp;  
             }
             else
             {
                  delete_atlast(head);
             }
           }
       }
       head1=head1.next;
    }
    while(head1!=head);
    if(flag==0)
    {
        System.out.println(a+" Not found");
    }
    }
   
         public void before(int a)
    {
    Node head1=head;
    int flag=0;
   do
    {
       if(head1.data==a) 
       {
           if(head1==head)
           {
            System.out.println("No data found to delete");
              return;
           }
           else
           {
               if(prev1==head)
               {
                       delete_atfirst(head)   ;                                   // head=head1;
               }
               else
               {
                   
      temp=head1.next;
      prev1.next=temp;
               }
           }
           flag=1;
       }
       prev1=head1;
       head1=head1.next;
    }
    while(head1!=head);
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
             n.next=head;
            prev1=n;
        }
        else
        {
            
           prev1.next=n;
           n.next=head;
           prev1=n;
        }
       
      
     }
      
      public static void  delete_atfirst(Node head1)
    {
        while(head!=head1.next)
        {
            head1=head1.next;
        }
        head1.next=head.next;
      head=head.next;
    }
  
  
       public static void  delete_atlast(Node head1)
    {
       while(head1.next!=head)
       {
           prev1=head1;
           head1=head1.next;
       }
    prev1.next=head;
    }
     
    public void delete(int a)
    {
        int flag=0;
    Node head1=head;
    do
    {
        if(head1.data==a)
        {
            if(head1==head)
            {
               delete_atfirst(head);
                flag=1;
            }
            else if(head1.next==head)
            {
                 delete_atlast(head);
                  flag=1;
            }
            else
            {
          prev1.next=head1.next;
            flag=1;
        }
        }
        prev1=head1;
        head1=head1.next;
    }
    while(head1!=head);
    if(flag==0)
    {
        System.out.println("No data found");
    }
    }
  
     public void Print(Node head)
{
 Node head1=head;
  System.out.print("Your list is : ");
  while(head!=head1.next)
  {
       System.out.print(head1.data+"-");
      head1=head1.next;
      
  }
    System.out.println(head1.data+" ");
}

 

    public static void main(String arg[])
    {
        int push_data=0;
        delete_circular b=new delete_circular();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
           push_data=sc.nextInt();
          b.push(push_data); 
          a--;
        }
       
         b.Print(head);
    
         delete_atfirst(head);
           System.out.println("\ndelete at first index function");
          b.Print(head);

           delete_atlast(head);
           System.out.println("\ndelete at last index function");
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
