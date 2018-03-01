//Steven Fong
//Period 2
import java.util.Arrays;
import java.util.ArrayList;
public class FinalSorts 
{
	public static String[] mergeSort(String[] list1)
	{
		if (list1.length == 1) 
		{
			return list1;
		}
		int something = (int)((list1.length)/2);
		String[] left = Arrays.copyOfRange(list1, 0, something);
		String[] right = Arrays.copyOfRange(list1, something, list1.length);
		
		/*String[] left = new String[something];
		String[] right = new String[list1.length - something];
		int i = 0;
		while (i < something)
		{
			left[i] = list1[i];
			right[i] = list1[i + something];
			i++;
		}
		if (left.length < right.length)
		{
			right[list1.length - something - 1] = list1[list1.length - 1];
		}*/
		return(ArrayMethods2.merge(mergeSort(left), mergeSort(right)));
	}
	
	public static int partition(int[] list, int front, int back)
	{
		
		int pivot = list[front];
		int holdpos = back - 1;
		for (int i = holdpos; i >= 1; i--)
		{
			if (list[i] > pivot)
			{
				if (i != holdpos)
				{
					int sub = list[holdpos];
					list[holdpos] = list[i];
					list[i] = sub;
				}
				holdpos--;
			}
		}
		list[front] = list[holdpos];
		list[holdpos] = pivot;
		return holdpos;
		
		/*
		int pivot = list[front];
		int pivotpos = front;
		int i = back - 1;
		while (i != pivotpos)
		{
			while (pivotpos < i)
			{	
				if (list[i] >= pivot)
				{
					i--;
				}
				
				else if (list[i] < pivot)
				{
					int sub = list[pivotpos];
					list[pivotpos] = list[i];
					list[i] = sub;
					
					int subpos = i;
					i = pivotpos;
					pivotpos = subpos;
					i++;
				}
			}
			
			while (pivotpos > i)
			{
				if (list[i] <=  pivot)
				{
					i++;
				}
				
				else if (list[i] > pivot)
				{
					int sub = list[pivotpos];
					list[pivotpos] = list[i];
					list[i] = sub;
					
					int subpos = i;
					i = pivotpos;
					pivotpos = subpos;
					i--;
				}
			}
		}
		return pivotpos;
		*/
	}
	
	public static void quickSort(int[] list, int front, int back)
	{
		if (back > front)
		{
			int pindex = partition(list, front, back);
			
			quickSort(list, front, pindex);
			quickSort(list, pindex + 1, back);
		}
	}
	
	public static int getMax(int[] arr)
	{
		int n = arr.length;
		int max = arr[0];
		for (int i = 1; i < n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void countSort(int[] arr, int place)
	{
		int n = arr.length;
		int [] count = new int[10];
		int [] result = new int[n];
		int i;
		
		for (i = 0; i < n; i++)
		{
			count [(arr[i]/place)%10]++;
		}
		
		for (i = 1; i < 10; i++)
		{
			count[i] += count[i-1];
		}
		
		for (i = n - 1; i >= 0; i--)
		{
			result[count[(arr[i]/place)%10] - 1] = arr[i];
			count[(arr[i]/place)%10]--;
		}
		
		for (i = 0; i < n; i++)
		{
			arr[i] = result[i];
		}
	}
	
	public static void radixSort(int [] arr)
	{
		int max = getMax(arr);
		
		for (int i = 1; i <= max; i*=10)
		{
			countSort(arr, i);
		}
	}
}
