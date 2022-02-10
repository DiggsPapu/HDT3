package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class HeapSortTest {
	/**
	 * Creaci�n de la lista a ser evaluada Atributo1
	 * Creaci�n de la lista con la que se comparar� Atributo2
	 */
	Random rnd= new Random();
	int randomValue0 = rnd.nextInt(300);
	int[] listaHeapSort = new int[randomValue0];
	/**
	 * HeapSortTest()
	 * B�sicamente es un constructor
	 * Aqu� es donde se a�aden los elementos a cada lista.
	 * Para la lista a evaluar son a�adidos en orden descendente
	 */
	public HeapSortTest() {
		Random rnd= new Random();
		int randomValue1 = rnd.nextInt(679);
		for(int counter=listaHeapSort.length-1; counter>=0; counter--) {
			this.listaHeapSort[counter]=-randomValue1*counter;
		}
		
		
	}
	/**
	 * Se realiza el test.
	 * Si realmente ordena entonces el valor k+1
	 * debe ser mayor que el valor k
	 */
	@Test
	public void testHeapSort() {
		Random rnd= new Random();
		int randomValue3 = rnd.nextInt(listaHeapSort.length-2);
		HeapSort.heapSort(listaHeapSort);
		assertTrue(listaHeapSort[randomValue3]<listaHeapSort[randomValue3+1]);
			
		
		
		
	}
}
