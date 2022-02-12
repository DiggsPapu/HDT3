/**
 * El autor de este algoritmo permanece en el anonimato, el algoritmo fue extraído de https://es.stackoverflow.com/questions/7836/cómo-funciona-el-algoritmo-de-quicksort
 */
package sorts;
public class QuickSort {
    public static void quickSort(int[] vector, int izquierda, int derecha) {
        /**
         * Creación de atributos, el pivote, el contador para movernos por el subconjunto de la izquierda y de la derecha, además , del valor para hacer intercambio.
         */
    	int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        /**
         * Ciclo while mientras el contador izquierdo sea mayor que el derecho.
         */
        while (i < j) {
        	/**
        	 * Ciclo while mientras que el vector i sea menor o igual que el vector pivote (límite) y que el i sea mayor que j entonces moverse  hacia la izquierda.
        	 */
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            /**
             * Mientras que el vector j sea mayor o igual que el pivote (límite) entonces moverse a la izquierda.
             */
            while (vector[j] > pivote) {
                j--;
            }
            /**
             * En el caso de que j sea mayor que i entonces intercambiar el vector i con el vector j mediante un apuntador aux.
             */
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        /**
         * Aquí se asigna el vector mayor i al vector menor j
         * El pivote como el menor
         */
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        /**
         * Un if para llamar recursión sí la posición de j es mayor que la
         * posición que la izquierda (i) 
         */
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        /**
         * LLamar recursión si la posición j+1 es menor que 
         * el valor de la derecha.
         */
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }
    
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
