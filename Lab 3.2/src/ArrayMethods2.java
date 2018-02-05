
public class ArrayMethods2 
{
	public static int[] merge(int[] arr1, int[] arr2)
	{
		int[] result = new int[arr1.length + arr2.length];
		int index1 = 0;
		int index2 = 0;
		int indexresult = 0;
		while(result[arr1.length + arr2.length - 1] == 0)
		{
			if (arr1[index1] <= arr2[index2])
			{
				result[indexresult] = arr1[index1];
				index1++;
				indexresult++;
			}
			
			
		}
		return result;
		
	}
}
