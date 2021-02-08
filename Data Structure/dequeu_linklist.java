import java.util.* ; 
class dequeu_linklist
{ 
static class Node 
{ 
	int data; 
	Node next; 
} 
static class Queue 
{ 
	Node front, rear; 
} 
static void enQueue_front(Queue q, int value) 
{ 
	Node temp = new Node(); 
temp.data=value;
if(q.front==null)
{
   q.front=temp;
   q.rear=temp;
}
else
{
   temp.next=q.front;
   q.front=temp;
}
q.rear.next=q.front;
} 
static void enQueue_rear(Queue q, int value) 
{ 
	Node temp = new Node(); 
temp.data=value;
if(q.front==null)
{
   q.front=temp; 
}
else
{
    q.rear.next=temp;
}
q.rear=temp;
q.rear.next=q.front;
}
static int deQueue_rear(Queue q) 
{ 
	if (q .front == null) 
	{ 
		System.out.printf ("Queue is empty"); 
		return -1; 
	} 
	int value; 
if(q.rear==q.front)
{
    value=q.rear.data;
    q.rear=null;
    q.front=null;
}
else
{
    
    value=q.rear.data;
    Node temp1=q.front;
    Node prev1=null;
    while(temp1!=q.rear)
    {
        prev1=temp1;
        temp1=temp1.next;
    }
    prev1.next=q.front;
    q.rear=prev1;
  
} 
	return value ; 
} 
static int deQueue_front(Queue q) 
{ 
	if (q .front == null) 
	{ 
		System.out.printf ("Queue is empty"); 
		return -1; 
	} 
	int value; 
if(q.rear==q.front)
{
    value=q.front.data;
    q.rear=null;
    q.front=null;
}
else
{
    value=q.front.data;
    q.front=q.front.next;
    q.rear.next=q.front;
} 
	return value ; 
} 
static void displayQueue( Queue q) 
{ 
	Node temp = q .front; 
	System.out.printf("Elements in Circular Queue are: "); 
	while (temp .next != q .front) 
	{ 
		System.out.printf("%d ", temp .data); 
		temp = temp .next; 
	} 
	System.out.println(temp.data); 
} 
public static void main(String args[]) 
{ 
	Queue q = new Queue(); 
	q .front = q .rear = null; 
	enQueue_rear(q, 14); 
	enQueue_rear(q, 22); 
		enQueue_rear(q, 6); 
	displayQueue(q); 
	System.out.println("Deleted value ="+deQueue_front(q)); 
	System.out.println("Deleted value ="+deQueue_front(q)); 
	displayQueue(q); 
		enQueue_rear(q, 9); 
		enQueue_rear(q, 20); 
	displayQueue(q);
	enQueue_front(q,100);
	displayQueue(q);
		System.out.println("Deleted value ="+deQueue_rear(q));
			displayQueue(q);
		
} 
} 