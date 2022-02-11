/**
 *
 * @author Mohit Gupta_OMG
 *
 */
package sorts;

public class GnomeSort {
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
