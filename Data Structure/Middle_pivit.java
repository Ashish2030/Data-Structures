import java.util.*;
class QuickSort_array
{ 
	int divide(int arr[], int left, int right) 
	{ 
	    int m=(left+right)/2;
	int pivot=arr[m];
  while (left <= right) 
  {
    while (arr[left] < pivot)
    {
    left++;
    }
  while (arr[right] > pivot)
  {
   right--;   
  }
    if (left <= right) 
    {
                 int tmp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = tmp;
                  left++;
                  right--;
     }
      }
      return left;
	} 
	void sort(int arr[], int left, int right) 
	{ 
		if (left < right) 
		{ 
			int x = divide(arr, left, right); 
			sort(arr, left, x-1); 
			sort(arr, x, right); 
		} 
	} 
	 void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	}  
}
class Middle_pivit
{
	public static void main(String args[]) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		int arr[] =new int[a];
		for(int i=0;i<a;i++)
		{
		    arr[i]=sc.nextInt();
		}
		QuickSort_array ob = new QuickSort_array(); 
		int n = arr.length; 
		System.out.println("Your array :  "); 
		ob.printArray(arr); 
				ob.sort(arr, 0, n-1); 
		System.out.println("sorted array :   "); 
		ob.printArray(arr); 
	} 
} 
