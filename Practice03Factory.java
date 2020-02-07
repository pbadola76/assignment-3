/**
 * Practice03Factory: A factory for building instances of classes which can search 
 * (i.e. linear search, binary search) and implementations of some basic sorting
 * algorithms (selection sort, bubble sort, insertion sort).
 * @author dbrizan
 *
 */
public class Practice03Factory {
	
	
	/**
	 * Gets a Practice03Search instance according to the parameter.
	 * @param algoName Sorting algorithm name; must contain one of: linear, binary*{recursive|iterative}.
	 * @return An instance of the search algorithm or null if not a valid algoName.
	 */
	public Practice03Search getSearchAlgorithm(String searchtype) {
		if (searchtype.contains("linear"))
			return new LinearSearch();
		else if (searchtype.contains("binary") && searchtype.contains("recursive"))
			return new BinaryRecursiveSearch();
		else if (searchtype.contains("binary") && searchtype.contains("iterative"))
			return new BinaryIterativeSearch();
		return null;
	}
	
	
	/**
	 * Gets a Practice03Sort instance according to the parameter.
	 * @param algoName Sorting algorithm name; one of: selection, bubble, insertion.
	 * @return An instance of the sorting algorithm or null if not a valid algoName
	 */
	public Practice03Sort getSortingAlgorithm(String algoName) {
		String lowercaseAlgoName = algoName.toLowerCase();
		if (lowercaseAlgoName.contains("selection")) {
			return new SelectionSort();
		}
		if (lowercaseAlgoName.contains("bubble")) {
			return new BubbleSort();
		}
		if (lowercaseAlgoName.contains("insertion")) {
			return new InsertionSort();
		}
		return null;
	}

}
