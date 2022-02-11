package sorts;
/**
 *
 * @author Obtenido de https://www.programiz.com/dsa/radix-sort
 *
 */
public class RadixSort {
	// Radix Sort in Java Programming
	/**
	 * Se utiliza counting sort para determinar los elementos en los lugares significantes.
	 */
	  public static void countingSort(int array[], int size, int place) {
	    int[] output = new int[size + 1];
	    int max = array[0];
		/**
		* Determinar si hay elementos más grandes que el valor en i
		*/
	    for (int i = 1; i < size; i++) {
	      if (array[i] > max)
	        max = array[i];
	    }
	    int[] count = new int[max + 1];

	    for (int i = 0; i < max; ++i)
	      count[i] = 0;

	    /**
		* Obtener la cantidad total de elementos
		*/
	    for (int i = 0; i < size; i++)
	      count[(array[i] / place) % 10]++;

	    /**
		* Calcular la cuenta cumulativa de los elementos
		*/
	    for (int i = 1; i < 10; i++)
	      count[i] += count[i - 1];

		/**
		 * Colocar los elementos en sus respectivos lugares ya ordenados
		*/	   
	    for (int i = size - 1; i >= 0; i--) {
	      output[count[(array[i] / place) % 10] - 1] = array[i];
	      count[(array[i] / place) % 10]--;
	    }

		/**
		* Loop for para copiar el array
		*/
	    for (int i = 0; i < size; i++)
	      array[i] = output[i];
	  }

		/**
		 * Obtencion del elemento más grande en el array.
		 */
	  public static int getMax(int array[], int n) {
	    int max = array[0];
	    for (int i = 1; i < n; i++)
	      if (array[i] > max)
	        max = array[i];
	    return max;
	  }

	  public static void radixSort(int array[], int size) {
		  int max = getMax(array, size);
		
	    /**
		* Utilizar counting sort de nuevo para colocar los elementos en sus respectivos lugares
		*/
	    for (int place = 1; max / place > 0; place *= 10)
	      countingSort(array, size, place);
	  }

	  
}