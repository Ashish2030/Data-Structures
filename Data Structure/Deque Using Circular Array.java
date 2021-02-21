class Deque_Using_Circular_Array
{
	static int max_size = 100;
    int front,rear,size,curr_size=0;
    int arr[];
	public Deque_Using_Circular_Array(int cap)
	{
		arr = new int[max_size];
		front = -1;
		rear = 0;
		size = cap;
	}
	public boolean isFull()
	{
		return ((front==0 && rear==size-1) || front==rear+1);
	}
	public boolean isEmpty()
	{
		return (front==-1);
	}
	public void insertfront(int key)
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
        else if(front==0)
        {
            front = size-1;
        }
        else
        {
            front = front-1;
        }
		arr[front] = key;
		curr_size++;
	}
	public void insertrear(int key)
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
        else if(rear==size-1)
        {
            rear = 0;
        }
        else
        {
            rear = rear+1;
        }
		arr[rear] = key;
		curr_size++;
	}
	public void deletefront()
	{
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!!!\n");
			return;
		}
		arr[front] = 0;
		if(front==rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
            if(front==size-1)
            {
                front = 0;
            }
            else
            {
                front = front+1;
            }
		}
		curr_size--;
	}
	public void deleterear()
	{
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!!!\n");
			return;
		}
		arr[rear] = 0;
		if(front==rear)
		{
			front = -1;
			rear = -1;
		}
        else if(rear==0)
        {
            rear = size-1;
        }
        else
        {
            rear = rear-1;
		}
		curr_size--;
	}
	public int getFront()
	{
		if(isEmpty())
		{
			System.out.println("Queue Is Empty!!!\n");
			return 0;
		}
		return arr[front];
	}
	public int getRear()
	{
		if(isEmpty() || rear < 0)
		{
			System.out.println("Queue Is Empty!!!");
			return 0;
		}
		return arr[rear];
	}
	public void display()
	{
		int i;
		System.out.print("Updated Queue Is: ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
	public int size()
	{
		return curr_size;
	}
	public static void main(String args[])
	{
		Deque_Using_Circular_Array dq = new Deque_Using_Circular_Array(5);

		System.out.println("\nSize Of Default Queue Array Is 5\n");
		
		System.out.println("Enqueuing 5 At Rear....");
		dq.insertrear(5);
		dq.display();

		System.out.println("Enqueuing 3 At Front....");
		dq.insertfront(3);
		dq.display();

		System.out.println("Size Of Queue Is: "+dq.size()+"\n");

		System.out.println("Enqueuing 2,7 At Rear....");
		dq.insertrear(2);
		dq.insertrear(7);
		dq.display();

		System.out.println("Dequeuing "+dq.getRear()+" From Rear");
		dq.deleterear();
		dq.display();

		System.out.println("Enqueuing 4,9 At Front....");
		dq.insertfront(4);
		dq.insertfront(9);
		dq.display();

		System.out.println("Is Queue Full: "+dq.isFull()+"\n");

		System.out.println("Rear Element Is: "+dq.getRear());
		System.out.println("Front Element Is: "+dq.getFront()+"\n");

		System.out.println("Size Of Queue Is: "+dq.size()+"\n");

		System.out.println("Dequeuing "+dq.getRear()+" From Rear");
		dq.deleterear();
		dq.display();

		System.out.println("Dequeuing "+dq.getFront()+" From Front");
		dq.deletefront();
		dq.display();

		System.out.println("Rear Element Is: "+dq.getRear());
		System.out.println("Front Element Is: "+dq.getFront()+"\n");

		System.out.println("Dequeuing "+dq.getFront()+" From Front");
		dq.deletefront();
		dq.display();

		System.out.println("Dequeuing "+dq.getRear()+" From Rear");
		dq.deleterear();
		dq.display();		

		System.out.println("Is Queue Empty: "+dq.isEmpty()+"\n");

		System.out.println("Rear Element Is: "+dq.getRear());
		System.out.println("Front Element Is: "+dq.getFront()+"\n");

		System.out.println("Size Of Queue Is: "+dq.size()+"\n");
	}
}

 