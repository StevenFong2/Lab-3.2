//Steven Fong
//Period 2


public class Test 
{
	public static void main(String[] args)
	{
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int [] test3 = {3,4,2,7,12,22,0,1};
		String[] test4 = {"death", "plunder", "chaos", "gore", "flu", "plague", "satan", "sixsixsix", "pentagon"};
		String[] test5= {"abba", "book", "cat", "dog","wow", "zoo", "zzzz"};
		String[] test6 = {"bee", "die", "fall", "good", "mummy"};
		int[] test7 = {5,1,2,3,4,6,7,8,9};
		int[] test8 = {10,8,9,35,26,48,100,104,29,5,8,3,87};
		
		int[] randomtest = arrayRandomizer(10000);
		print(randomtest);
		//int[] randomtest = {2,1,6,4,8,9,4,5};
		
		long start;
		long end;
		long time;
		
		start = System.nanoTime();
		FinalSorts.radixSort(randomtest);
		end = System.nanoTime();
		time = end - start;
		System.out.println("radix test took: " + time + " nanoseconds");
		print(randomtest);
		
		/*start = System.nanoTime();
		FinalSorts.quickSort(randomtest, 0, randomtest.length);
		end = System.nanoTime();
		time = end - start;
		System.out.println("QuickSort test took: " + time + " nanoseconds");
		print(randomtest);
		
		
		//Testing helper methods
		/*
		start = System.nanoTime();
		String [] mergeResult = ArrayMethods2.merge(test1, test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		print(mergeResult);
		
		start = System.nanoTime();
		int pivotFinalPos = ArrayMethods2.partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		print(test3);
		
		start = System.nanoTime();
		int pivotpos = FinalSorts.partition(test3, 0, test3.length);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		print(test3);
		
		
		//Testing Sorting algorithms
		
		start = System.nanoTime();
		String[] result = FinalSorts.mergeSort(test4);
		end = System.nanoTime();
		time = end - start;
		System.out.println("MergeSort test took: " + time + " nanoseconds");
		print(result);
		
		start = System.nanoTime();
		FinalSorts.quickSort(test8, 0, test8.length);
		end = System.nanoTime();
		time = end - start;
		System.out.println("QuickSort test took: " + time + " nanoseconds");
		print(test8);
		*/
		
	}
	
	public static int[] arrayRandomizer(int length)
	{
		int[] result = new int[length];
		for (int i = 0; i < length - 1; i++)
		{
			result[i] =(int)((Math.random()*10000));
		}
		return result;
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
