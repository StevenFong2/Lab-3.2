
public class FinalSorts 
{
	public static String[] mergeSort(String[] list1)
	{
		if (list1.length == 1) 
		{
			return list1;
		}
		int something = (int)((list1.length)/2);
		String[] left = new String[something];
		String[] right = new String[list1.length - something];
		int i = 0;
		while (i < something)
		{
			left[i] = list1[i];
			right[i] = list1[i + something];
			i++;
		}
		return(ArrayMethods2.merge(mergeSort(left), mergeSort(right)));
	}
}
