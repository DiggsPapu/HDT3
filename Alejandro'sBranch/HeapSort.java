package sorts;
/**
 * 
 * @author Obtenido de https://www.geeksforgeeks.org/heap-sort/
 *
 */
public class HeapSort {
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
}
