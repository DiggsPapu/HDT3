package sorts;
/**
 * 
 * @author Obtenido del libro Java Structures.
 *
 */
public class MergeSort {
	public static void merge(int data[], int temp[], int low, int middle, int high) {
		/**
		 * 
		 */
		int resultIndex=low;
		int tempIndex= low;
		int destinationIndex= middle;
		while (tempIndex<middle && destinationIndex <= high) {
			if (data[destinationIndex]< temp[destinationIndex]) {
				data[resultIndex++]= data[destinationIndex++];
			}
			else {
				data[resultIndex++] = temp[tempIndex++];
			}
		}
		while (tempIndex<middle) {
			data[resultIndex++]=temp[tempIndex++];
		}
	}
	private static void mergeSortRecursive(int data[], int temp[], int low, int high) {
		int n=high-low+1;
		int middle= low+n/2;
		int i;
		
		if (n<2) return;
		for(i=low; i < middle; i++) {
			temp[i] = data[i];
		}
		mergeSortRecursive(temp, data, low, middle-1);
		mergeSortRecursive(data, temp, middle, high);
		merge(data, temp, low, middle, high);
	}

}
