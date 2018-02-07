
public class ArrayMethods2 
{
	public static String[] merge(String [] arr1, String[] arr2)
	{
		String[] result = new String[arr1.length + arr2.length];
		int index1 = 0;
		int index2 = 0;
		int indexresult = 0;
		/*while(indexresult < result.length)
		{
			if (index1 == arr1.length)
			{
				result[indexresult] = arr2[index2];
				index2++;
			}
			
			else if (index2 == arr2.length)
			{
				result[indexresult] = arr2[index1];
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
		
		while (indexresult < result.length)
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
		}
		return result;
	}
	
	public static int partition(int[] list)
	{
		int pivot = list[0];
		//int pivotpos = 0;
		//int rightpos = list.length - 1;
		/*for (int i = 1; i < list.length; i++)
		{
			if (list[i] < pivot)
			{
				int sub = list[pivotpos];
				list[i] = list[pivotpos];
				list[pivotpos] = sub;
				pivotpos = i;
				rightpos++;
			}
		}
		int sub = list[pivotpos];
		list[pivotpos] = list[rightpos];
		list[rightpos] = sub;*/
		
		int pivotpos = list.length - 1;
		for (int i = list.length - 1; i >= 0; i--)
		{
			if (list[i] > pivot)
			{
				int sub = list[pivotpos];
				list[pivotpos] = list[i];
				list[i] = sub;
				pivotpos++;
			}
		}
		return pivotpos;
	}
}
