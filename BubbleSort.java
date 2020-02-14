/**
 * Bubble Sort
 * 
 * @author (Puja Badola)
 * Date (2/8/2020)
 */
public class BubbleSort implements Practice03Sort 
{
	public void sort(int [] a)
	{
		int passes = 1;
		boolean swapped = true;

		while(swapped == true)
		{
			swapped = false;
			for(int i = 0; i<a.length-1; i++)
			{
				if(a[i+1]<a[i])
				{
					swap(i, i+1, a);
					swapped = true;
				}
			}
			passes++;
		}
	}

	public void swap(int a, int b, int [] array)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}