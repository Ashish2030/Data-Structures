class CQPriorityQ
{
  
  private int maxSize;
  private int[] queArray;
  private int nItems;

  public CQPriorityQ(int s)
  {
    maxSize = s;
    queArray = new int[maxSize];
    nItems = 0;
  }

  public void insert(int item) 
  {
    int j;
    if(nItems==0)                                                // if no items,
      queArray[nItems++] = item;                            //----------------insert at 0
    else                                   
    {
      for(j=nItems-1; j>=0; j--)                          
      {
        if( item > queArray[j] ) 
{
                           
          queArray[j+1] = queArray[j]; 
}
        else 
{
          break; 
}
      } 
      queArray[j+1] = item; // insert it
      nItems++;
    } 
  } 

  public int remove()                             //-----------------remove minimum item
  { return queArray[--nItems]; }

  public int peekMin()                             //--------------- peek at minimum item
  { 
    return queArray[nItems-1]; 
}

  public boolean isEmpty()                         //------------ true if queue is empty
  { 
           return (nItems==0);
 }

  public boolean isFull()                           //--------------- true if queue is full
  { 
    return (nItems == maxSize); 
}

}

class priority
{
  public static void main(String[] args)
  {
    CQPriorityQ thePQ = new CQPriorityQ(5);
    thePQ.insert(30);
    thePQ.insert(50);
    thePQ.insert(10);
    thePQ.insert(40);
    thePQ.insert(20);


    while( !thePQ.isEmpty() )
    {
      int item = thePQ.remove();
      System.out.print(item + " ");
    }
    System.out.println("");
  }
}