
public class Subsequence {
	public static void main (String [] args)
	{
		int[] array = {1,3,1,6,7,2,1,5,7,8,4,11};
		int[] copyArray = new int[100];
		int max = 0;
		int j = 0;
		int i = 1;
		
		for(i = 1; i < array.length; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (array[i] > array[j] && copyArray[i] < copyArray[j] + 1)
				{
					copyArray[i] = copyArray[i] + 1;
				}
			}	
		}
		for(i = 0; i < array.length; i++)
		{
			if(max < copyArray[i])
			{
				max = copyArray[i];
			}
		}
		System.out.println("Longest sequence is: " + (max - 1));
		for(int k = 0; k < array.length; k++)
		{
		System.out.print(array[k]);
		}
	}
	
	
}
