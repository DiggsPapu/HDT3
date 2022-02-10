package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class HeapSortTest {
	/**
	 * Creación de la lista a ser evaluada Atributo1
	 * Creación de la lista con la que se comparará Atributo2
	 */
	Random rnd= new Random();
	int randomValue0 = rnd.nextInt(300);
	int[] listaHeapSort = new int[randomValue0];
	/**
	 * HeapSortTest()
	 * Básicamente es un constructor
	 * Aquí es donde se añaden los elementos a cada lista.
	 * Para la lista a evaluar son añadidos en orden descendente
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
