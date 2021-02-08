import java.util.* ; 
class cir_linklist
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
static void enQueue(Queue q, int value) 
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
static int deQueue(Queue q) 
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
	enQueue(q, 14); 
	enQueue(q, 22); 
	enQueue(q, 6); 
	displayQueue(q); 
	System.out.println("Deleted value ="+deQueue(q)); 
	System.out.println("Deleted value ="+deQueue(q)); 
	displayQueue(q); 
	enQueue(q, 9); 
	enQueue(q, 20); 
	displayQueue(q); 
} 
} 