class Circular_Queue_Using_Array
{
    static int max_size=100;
    int front,rear,size,curr_size=0;
    int array[];
    Circular_Queue_Using_Array(int cap)
    {
        size = cap;
        front = -1;
        rear = -1;
        array = new int[max_size];
    }
    public boolean isFull()
	{
		return ((front==0 && rear==size-1) || front==rear+1);
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
    public void enqueue(int item)
    {
        if(isFull()) 
        {  
            System.out.println("Queue Is Full!!!\n");
            return;
        }
        if(front==-1)
        {
            front = 0;
            rear = 0;
        }	  
        else if(rear==size-1 && front!=0)
        {
            rear = 0;
        }
        else
        {
            rear++;
        }		  
        array[rear] = item;
        curr_size++;
    }
    public int dequeue()
    {
        int temp;
        if(isEmpty())
        {
            System.out.println("Queue Is Empty!!!\n");
            return 0;
        }
        temp = array[front];
        array[front] = 0;
        if(front==rear)
        {
            front = -1;
            rear = -1;
        } 
        else if(front==size-1)
        {
            front = 0;
        }
        else
        {
            front++;
        }
        curr_size--;
        return temp;
    }
    public int size()
    {
        return curr_size;
    }
    public void display()
    {
        int i;
        if(isEmpty())
        {
            System.out.println("Queue Is Empty!!!\n");
            return;
        }
		System.out.print("Updated Queue Is: ");
		for(i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
    }
    public int getFront()
    {
        return array[front];
    }
    public int getRear()
    {
        return array[rear];
    }
    public static void main(String args[])
    {
        int temp;
        Circular_Queue_Using_Array cq = new Circular_Queue_Using_Array(5);
    
        System.out.println("\nSize Of Default Queue Array Is 5\n");

        System.out.println("Enqueuing 5,9,3,7 Into Queue....");
        cq.enqueue(5);
        cq.enqueue(9);
        cq.enqueue(3);
        cq.enqueue(7);
        cq.display();

        System.out.println("Size Of Queue Is: "+cq.size()+"\n");

        System.out.println("Rear Element Is: "+cq.getRear());
        System.out.println("Front Element Is: "+cq.getFront()+"\n");
        
        System.out.println("Enqueuing 1 Into Queue....");
        cq.enqueue(1);
        cq.display();

        System.out.println("Is Queue Full: "+cq.isFull()+"\n");

        temp = cq.dequeue();
        System.out.println("Dequeuing "+temp+" From Queue");
        cq.display();
        
        System.out.println("Rear Element Is: "+cq.getRear());
        System.out.println("Front Element Is: "+cq.getFront()+"\n");

        temp = cq.dequeue();
        System.out.println("Dequeuing "+temp+" From Queue");
        cq.display();

        temp = cq.dequeue();
        System.out.println("Dequeuing "+temp+" From Queue");
        cq.display();

        System.out.println("Size Of Queue Is: "+cq.size()+"\n");

        System.out.println("Rear Element Is: "+cq.getRear());
        System.out.println("Front Element Is: "+cq.getFront()+"\n");

        System.out.println("Enqueuing 6,8 Into Queue....");
        cq.enqueue(6);
        cq.enqueue(8);
        cq.display();

        System.out.println("Rear Element Is: "+cq.getRear());
        System.out.println("Front Element Is: "+cq.getFront()+"\n");

        System.out.println("Size Of Queue Is: "+cq.size()+"\n");

        System.out.println("Enqueuing 4 Into Queue....");
        cq.enqueue(4);
        cq.display();

        System.out.println("Rear Element Is: "+cq.getRear());
        System.out.println("Front Element Is: "+cq.getFront()+"\n");
    }
}