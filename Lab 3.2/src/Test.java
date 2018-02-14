//Steven Fong
//Period 2
public class Test 
{
	public static void main(String[] args)
	{
		 /*String[] one = {"abba", "book", "cat", "dog","wow", "zoo", "zzzz"};
		 String[] two = {"bee", "die", "fall", "good", "mummy"};
		 print(ArrayMethods2.merge(one, two));
		 
		 int[] a = {5,1,2,3,4,6,7,8,9};
		 int[] b = {10,8,9,35,26,48,100,104,29,5,8,3,87};
		 //System.out.println(ArrayMethods2.partition(a));
		 ArrayMethods2.partition(b);
		 print(b);*/
		
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int [] test3 = {3,4,2,7,12,22,0,1};
		String[] test4 = {"death", "plunder", "chaos", "gore", "flu", "plague", "satan", "sixsixsix", "pentagon"};
		
		long start = System.nanoTime();
		String [] mergeResult = ArrayMethods2.merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		print(mergeResult);
		
		start = System.nanoTime();
		String[] result = FinalSorts.mergeSort(test4);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		print(result);

		
		start = System.nanoTime();
		int pivotFinalPos = ArrayMethods2.partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		print(test3);
		
	}
	
	public static void print(String[] wow)
	{
		for (int i = 0; i < wow.length; i++)
		{
			System.out.println(wow[i]);
		}
	}
	
	public static void print(int [] wow)
	{
		for (int i = 0; i < wow.length; i++)
		{
			System.out.println(wow[i]);
		}
	}
}
