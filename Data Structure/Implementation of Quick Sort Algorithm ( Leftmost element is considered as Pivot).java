import java.util.*;
class QuickSort_array
{ 
	int divide(int arr[], int left, int right) 
	{ 
	int pivit=arr[left];
	int i=left;
	for(int j=left+1;j<right+1;j++)
	{
	    if(arr[j]<=pivit)
	    {
	         i++;
	        int temp=arr[i];
	        arr[j]=arr[i];
	        arr[i]=temp;
	    }
	}
	int temp=arr[i];
	        arr[i]=arr[left];
	        arr[left]=temp;
	        return i;
	} 
	void sort(int arr[], int left, int right) 
	{ 
		if (left < right) 
		{ 
			int x = divide(arr, left, right); 
			sort(arr, left, x-1); 
			sort(arr, x+1, right); 
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
class from_left
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