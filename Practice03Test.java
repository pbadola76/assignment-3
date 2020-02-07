import java.util.Random;

/**
 * Practice03Test
 * A class which manages various searching and sorting algorithms and reports the timing of them.
 * This main class contains some basic code to get started.
 * @author dgbrizan
 *
 */
public class Practice03Test {
	
	protected final int [] ARRAY_SIZES = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
	protected final int SEARCH_SIZE = 50000;
	
	protected final String [] SEARCH_TYPE = {"linear", "binary-recursive", "binary-iterative"};
	protected final String [] SORT_TYPE = {"selection", "bubble", "insertion"};
	
	protected int [] arr;
	Practice03Factory factory = new Practice03Factory();

	
	/**
	 * Default (and only) constructor. Just creates the factory.
	 */
	public Practice03Test() {
		factory = new Practice03Factory();
	}
	
	
	/**
	 * Populates the array with non-decreasing random values.
	 */
	private boolean fillSearchArray () {
		Random rand = new Random();
		int stepSize = Integer.MAX_VALUE / (arr.length * 2);
		
		arr[0] = rand.nextInt(stepSize);
		for (int i = 1; i < arr.length; i++) {
			// Generate candidates for the array. But ensure all numbers are
			// monotonically non-decreasing.
			int candidate = arr[i-1] + rand.nextInt(stepSize);
			if (candidate < arr[i-1])
				arr[i] = arr[i-1];
			else
				arr[i] = candidate;
		}
		return true;
	}


	/**
	 * Executes multiple searches for values in the arr of int[]. Reports total search time
	 * and average time (i.e. approximate time for one search).
	 */
	public void timeSearches() {
		Random rand = new Random();

		for (String searchAlgo : SEARCH_TYPE) {
			Practice03Search search = factory.getSearchAlgorithm(searchAlgo);
			for (int size : ARRAY_SIZES) {
				arr = new int[size];
				fillSearchArray();
				
				long totalTime = 0;
				
				for (int i = 0; i < SEARCH_SIZE; i++) {
					long startTime = System.currentTimeMillis();
					search.search(arr, rand.nextInt());
					totalTime += System.currentTimeMillis() - startTime;
				}
				System.out.println(searchAlgo + " search (on " + size + "-item array): total search time = " + totalTime + "ms. Average search time = " + (float)totalTime / (float)arr.length + "ms.");
			}
		}
	}
	
	
	/**
	 * Populates the array with random values.
	 */
	private void fillSortArray () {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		}
	}
	
	
	/**
	 * Executes multiple sorts on arr of int[]. Reports total time to sort the values.
	 */
	public void timeSorts() {
		for (String sortAlgo : SORT_TYPE) {
			Practice03Sort sort = factory.getSortingAlgorithm(sortAlgo);
			for (int size : ARRAY_SIZES) {
				arr = new int[size];
				fillSortArray();
				long totalTime = 0;
				long startTime = System.currentTimeMillis();
				sort.sort(arr);
				totalTime += System.currentTimeMillis() - startTime;
				System.out.println(sortAlgo + " sort (on " + size + "-item array): total sorting time = " + totalTime + "ms.");
			}
		}
	}
	

	public static void main(String[] args) {
		Practice03Test test = new Practice03Test();
		test.timeSearches();
		test.timeSorts();
	}

}
