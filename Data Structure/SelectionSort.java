import java.util.Scanner;
class SelectionSort

{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int index=0;
      int k=sc.nextInt();
        int arr[]=new int[k];
      for(int i=0;i<k;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<k-1;i++)
      {
          index=0;
            int min=9999;
          for(int j=i;j<k;j++)
          {
            
              if(min>arr[j])
              {
                  min=arr[j];
                  index=j;
              }
              
          }
          int temp=arr[i];
          arr[i]=arr[index];
          arr[index]=temp;
      }
      for(int i=0;i<k;i++)
      {
      System.out.println(arr[i]);  
      }
      }
    }