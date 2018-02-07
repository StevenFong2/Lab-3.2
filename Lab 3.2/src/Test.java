
public class Test 
{
	public static void main(String[] args)
	{
		 String[] one = {"abba", "book", "cat", "dog","wow", "zoo", "zzzz"};
		 String[] two = {"bee", "die", "fall", "good", "mummy"};
		 print(ArrayMethods2.merge(one, two));
		 
		 int[] a = {5,1,2,3,4,6,7,8,9};
		 //System.out.println(ArrayMethods2.partition(a));
		 ArrayMethods2.partition(a);
		 print(a);
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
