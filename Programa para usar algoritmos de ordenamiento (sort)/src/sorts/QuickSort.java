/**
 * El autor de este algoritmo permanece en el anonimato, el algoritmo fue extra�do de https://es.stackoverflow.com/questions/7836/c�mo-funciona-el-algoritmo-de-quicksort
 */
package sorts;
public class QuickSort {
	
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


}
