package sorts;
/**
 * 
 * @author Obtenido de https://www.geeksforgeeks.org/merge-sort/
 *
 */
public class MergeSort {
	/**
	 * 
	 * @param data lista desordenada
	 * @param low el valor más bajo
	 * @param middle el valor de en medio
	 * @param length la longitud de la lista
	 */
	  public static void merge(int data[], int low, int middle, int length)
	    {
	        /**
	         * Encontrar las longitudes de las sublistas
	         * Lista inferior
	         */
	        int lengthInferiorList = middle - low + 1;
	        /**
	         * Lista superior
	         */
	        int lengthSuperiorList = length - middle;
	  
	        /**
	         * Crear las listas superior e inferior
	         */
	        int listLeft[] = new int[lengthInferiorList];
	        int listRight[] = new int[lengthSuperiorList];
	  
	        /**
	         * Copiar los datos a las sublistas
	         */
	        for (int i = 0; i < lengthInferiorList; ++i)
	            listLeft[i] = data[low + i];
	        for (int j = 0; j < lengthSuperiorList; ++j)
	            listRight[j] = data[middle + 1 + j];
	  
	        /**
	         * Mezclar las sublistas
	         * índices iniciales de las sublistas
	         */
	        int i = 0, j = 0;
	        /**
	         * Index inicial de la sublista mezclada
	         */
	        int k = low;
	        /**
	         * Ciclo while, mientras que i y j 
	         * sean menores que sus respectivas longitudes de lista
	         * 
	         */
	        while (i < lengthInferiorList && j < lengthSuperiorList) {
	            /**
	             * Sí el valor de la posición de la lista de la izquierda es menor/igual
	             * al valor de la posición de la lista de la derecha
	             * asignar el valor de la lista izquierda en la posición k
	             * de la lista original.
	             */
	        	if (listLeft[i] <= listRight[j]) {
	                data[k] = listLeft[i];
	                i++;
	            }
	        	/**
	        	 * En otro caso entonces asignar el valor de la derecha en la posición k
	        	 * de la lista original
	        	 * Esto porque el valor de la derecha es menor que el de la izquierda
	        	 */
	            else {
	                data[k] = listRight[j];
	                j++;
	            }
	            k++;
	        }
	        /**
	         * Copiar los elementos restantes de la lista de la izquierda
	         */
	        while (i < lengthInferiorList) {
	            data[k] = listLeft[i];
	            i++;
	            k++;
	        }

	        /**
	         * Copiar los elementos restantes de la lista de la derecha
	         */
	        while (j < lengthSuperiorList) {
	            data[k] = listRight[j];
	            j++;
	            k++;
	        }
	    }
	  
	    /**
	     * Función mergeSort
	     */
	   public static void mergeSort(int data[], int low, int length){
		   /**
		    * Sí el menor es menor que el mayor
		    */
	        if (low < length) {
	        	/**
	        	 * Encontrar el punto medio
	        	 */
	            int middle =low+ (length-low)/2;
	            
	            /**
	             * Ordenar la primera mitad de la lista
	             * La superior
	             */
	            mergeSort(data, low, middle);
	            /**
	            * Ordenar la mitad inferior de la lista
	            */
	            mergeSort(data, middle + 1, length);
	            /**
	             * Ordenar las dos mitades
	             */
	            merge(data, low, middle, length);
	        }
	    }
}
