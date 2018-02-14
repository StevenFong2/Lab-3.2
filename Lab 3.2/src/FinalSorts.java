import java.util.Arrays;
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
	}
	
	public static void quickSort(int[] list, int front, int back)
	{
		if (back > front)
		{
			int pindex = partition(list, front, back);
			
			quickSort(list, front, pindex);
			quickSort(list, pindex, back);
		}
	}
}
