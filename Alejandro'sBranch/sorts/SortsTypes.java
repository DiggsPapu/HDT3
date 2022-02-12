package sorts;

public class SortsTypes {
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
	  public static void quickSort(int[] vector, int izquierda, int derecha) {
	        /**
	         * Creaci�n de atributos, el pivote, el contador para movernos por el subconjunto de la izquierda y de la derecha, adem�s , del valor para hacer intercambio.
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
	        	 * Ciclo while mientras que el vector i sea menor o igual que el vector pivote (l�mite) y que el i sea mayor que j entonces moverse  hacia la izquierda.
	        	 */
	            while (vector[i] <= pivote && i < j) {
	                i++;
	            }
	            /**
	             * Mientras que el vector j sea mayor o igual que el pivote (l�mite) entonces moverse a la izquierda.
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
	         * Aqu� se asigna el vector mayor i al vector menor j
	         * El pivote como el menor
	         */
	        vector[izquierda] = vector[j];
	        vector[j] = pivote;
	        /**
	         * Un if para llamar recursi�n s� la posici�n de j es mayor que la
	         * posici�n que la izquierda (i) 
	         */
	        if (izquierda < j - 1) {
	            quickSort(vector, izquierda, j - 1);
	        }
	        /**
	         * LLamar recursi�n si la posici�n j+1 es menor que 
	         * el valor de la derecha.
	         */
	        if (j + 1 < derecha) {
	            quickSort(vector, j + 1, derecha);
	        }
	    	}
	  public static void heapSort(int arr[])
	    {
	        int n = arr.length;
	 
	       /**
		    * Crear el heap y reordenar el array
		    */
	        for (int i = n / 2 - 1; i >= 0; i--)
	            heapify(arr, n, i);
	 
	        /**
		    * Sustraer los elementos uno por uno del heap
		    */
	        for (int i = n - 1; i > 0; i--) {
	            /**
		        * Se mueve el root al final del array
		        */
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            heapify(arr, i, 0);
	        }
	    }
	 
	    /**
		 * Para hacer el heap se crea un nodo con variables i que es un indice en el array, y n que es el largo del array/heap
		 */
	    public static void heapify(int arr[], int n, int i)
	    {
	        /**
	         * Creacion de variables
		     * El numero mas grande se inicia como root
	         * El numero a la izquirda de root se settea
	         * El numero a la derecha de root se settea
		     */
	        int largest = i; 
	        int l = 2 * i + 1; 
	        int r = 2 * i + 2; 
	 
	        /**
		     * Si el child a la izquierda es mas grande que el root, cambiar el elemento mas grande a 1
		     */
	        // If left child is larger than root
	        if (l < n && arr[l] > arr[largest])
	            largest = l;
	 
	        /**
		     * Si child a la derecha es mas grande que el numero mas grande actual swappearlos
		     */
	        if (r < n && arr[r] > arr[largest])
	            largest = r;
	 
	       /**
		    * Loop if para sustituir el root si el numero mas grande no es este.
		    */
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	           /**
		        * Crear el heap recursivamente para los sub-arboles utilizados
		        */
	            heapify(arr, n, largest);
	        }
	    }
	    static void gnomeSort(int datos[], int length)
	    {
			/**
			 * Hacer el indice inicial 0
			 */
	        int index = 0;
	 
			/**
			 * crear un loop while que corre la cantidad de elementos que hay en el array
			 */
	        while (index < length) {
			/**
			 * Incrementar el indice si es igual a 0
			 */
	            if (index == 0)
	                index++;
				/**
				 * Buscar el elemento mas grande y guardar su indice
				 */
	            if (datos[index] >= datos[index - 1])
	                index++;
				/**
				 * Crear una copia temporal y hacer los cambios en el array segun el algoritmo gnome
				 */
	            else {
	                int temp = 0;
	                temp = datos[index];
	                datos[index] = datos[index - 1];
	                datos[index - 1] = temp;
	                index--;
	            }
	        }
	        return;
	    }
	  
	  
}
