
public class ArrayMethods2 
{
	public static String[] merge(String [] arr1, String[] arr2)
	{
		String[] result = new String[arr1.length + arr2.length];
		int index1 = 0;
		int index2 = 0;
		int indexresult = 0;
		while(result[arr1.length + arr2.length - 1] == null)
		{
			if (arr1[index1].compareTo(arr2[index2]) <= 0)
			{
				result[indexresult] = arr1[index1];
				index1++;
				indexresult++;
			}
			
			if (index1 == arr1.length)
			{
				for (int i = index2; i < arr2.length; i++)
				{
					result[indexresult] = arr2[i];
					indexresult++;
				}
			}
			
			if (index2 == arr2.length)
			{
				for (int i = index1; i < arr1.length; i++)
				{
					result[indexresult] = arr2[i];
					indexresult++;
				}
			}
			
			else
			{
				result[indexresult] = arr2[index2];
				index2++;
				indexresult++;
			}
			
		}
		
		return result;
		
	}
	
	public static String[] partition()
}
