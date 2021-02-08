import java.util.*;

class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
    }
    else
    {
      stackArray[++top] = j; // increment top, insert item
    }
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; // access item, decrement top
    }
  }
}

class prefix
{
static String result = new String(""); 
  static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    }
static String infixToPostfix(CQStack s, String exp)
{
result="";
String rev="";
char d;
int n=exp.length();
  for(int i=n-1;i>=0;i--)
  {
    d=exp.charAt(i);
    if (Character.isLetterOrDigit(d)) 
    {
     result += d;   
    }
     else if(d==')')
     {
       s.push(d);
     }
    else if(d=='(')
    {
      while(!s.isEmpty()&&s.stackArray[s.top]!=')')
            result += (char)s.pop(); 
                    s.pop();
    }
    else
       { 
                while (!s.isEmpty() && Prec(d) <= Prec((char)s.stackArray[s.top]))
                { 
                    result +=(char) s.pop(); 
             } 
                s.push(d); 
  }
  }
    while(!s.isEmpty())
    {
      result+=(char)s.pop();
    }
     char ch1[]=result.toCharArray();  
     rev="";
    for(int i=ch1.length-1;i>=0;i--)
    {
       
            rev+=ch1[i];  
        
    } 
    result="";
 result=rev;
  return result;
}
public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    String st;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      st = s.nextLine();
      st = infixToPostfix(theStack, st);
      System.out.println(st);
      t--;
    }
  }
}