/**
 * Insertion Sort
 * 
 * @author (Puja Badola)
 * Date (2/8/2020)
 */

public class InsertionSort implements Practice03Sort
{
	public void sort(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			int temp = a[i];
			int j = i-1;

			while (j>=0 && a[j] > temp)
			{
				a[j+1] = a[j];
				--j;
			}
			a[j+1] = temp;

		}
	}
}