//Steven Fong
//Period 2
//wow
public class ArrayMethods2 
{
	public static String[] merge(String [] arr1, String[] arr2)
	{
		String[] result = new String[arr1.length + arr2.length];
		int index1 = 0;
		int index2 = 0;
		int indexresult = 0;
		
		while (index1 < arr1.length && index2 < arr2.length)
		{
			if (arr1[index1].compareTo(arr2[index2]) <= 0)
			{
				result[indexresult] = arr1[index1];
				index1++;
			}
			
			else if (arr1[index1].compareTo(arr2[index2]) > 0)
			{
				result[indexresult] = arr2[index2];
				index2++;
			}
			indexresult++;
		}
		
		while (index1 < arr1.length)
		{
			result[indexresult] = arr1[index1];
			index1++;
			indexresult++;
		}
		
		while (index2 < arr2.length)
		{
			result[indexresult] = arr2[index2];
			index2++;
			indexresult++;
		}
		/*while(indexresult < result.length)
		{
			if (index1 == arr1.length)
			{
				result[indexresult] = arr2[index2];
				index2++;
			}
			
			else if (index2 == arr2.length)
			{
				result[indexresult] = arr1[index1];
				index1++;
			}
			
			else if (arr1[index1].compareTo(arr2[index2]) <= 0)
			{
				result[indexresult] = arr1[index1];
				index1++;
			}
			
			else if (arr1[index1].compareTo(arr2[index2]) > 0)
			{
				result[indexresult] = arr2[index2];
				index2++;
			}
			indexresult++;
		}*/
		
		/*while (indexresult < result.length)
		{
			while(index2 < arr2.length && index1 < arr1.length)
			{
				if (arr1[index1].compareTo(arr2[index2]) <= 0)
				{
					result[indexresult] = arr1[index1];
					index1++;
				}
				else if (arr1[index1].compareTo(arr2[index2]) > 0)
				{
					result[indexresult] = arr2[index2];
					index2++;
				}
				indexresult++;
			}
			
			if (index1 == arr1.length)
			{
				result[indexresult] = arr2[index2];
				index2++;
				indexresult++;
			}
			
			else if (index2 == arr2.length)
			{
				result[indexresult] = arr1[index1];
				index1++;
				indexresult++;
			}
		}*/
		return result;
	}
	
	public static int partition(int[] list)
	{
		/*int pivot = list[0];
		int holdpos = list.length - 1;
		for (int i = list.length - 1; i >= 1; i--)
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
		list[0] = list[holdpos];
		list[holdpos] = pivot;
		return holdpos;*/
		
		int pivot = list[0];
		int pivotpos = 0; //actual position of the pivot after being swapped
		//int direction = 1;
		int i = list.length - 1;
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
}
