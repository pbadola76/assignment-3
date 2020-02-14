/**
 * Binary Recursive Search
 * 
 * @author (Puja Badola)
 * Date (2/8/2020)
 */
public class BinaryRecursiveSearch implements Practice03Search
	{ 
		public int search(int[] a, int target)
		{
			return search(a, target, 0, a.length-1);
		}

		public int search(int[] a, int target, int min, int max)
		{
			
			if (min < max)
			{
				int mid = (min + max)/2;
				if (a[mid] == target)
				{
					return mid;
				}
				else if (a[mid] < target)
				{
					return search(a, target, mid+1,max);
				}
				else
				{
					return search(a, target, min, mid-1);
				}
			} 
			return -1;
		
		}
		
	}


