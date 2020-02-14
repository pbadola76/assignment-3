/**
 * Linear Search
 * 
 * @author (Puja Badola)
 * Date (2/8/2020)
 */
public class LinearSearch implements Practice03Search
{
	public int search(int [] a, int target) 
	{
		for(int i=0; i<a.length; i++) 
		{
			if(a[i] == target)
			{
				return i;
			}
		}
		return -1;		
	}
}
	