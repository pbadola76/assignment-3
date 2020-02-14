/**
 * Binary Iterative Search
 * 
 * @author (Puja Badola)
 * Date (2/8/2020)
 */
public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] a, int target) 
	{
		int min = 0;
		int max = a.length-1;
		while (min <= max)
		{
			int mid = (min + max)/2;
			if (a[mid]== target)
			{
				return mid;
			}
			if (a[mid] < target)
			{
				min = mid + 1;
			}
			else
			{
				max = mid - 1;
			}
		}
		return -1;
	}
}
