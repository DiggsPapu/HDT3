package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RadixSortTest {
	/**
	 * Creación de la lista a ser evaluada Atributo1
	 * Creación de la lista con la que se comparará Atributo2
	 */
	int[] listaRadixSort = new int[300];
	int[] listaPrueba =new int[300];
	/**
	 * RadixSortTest()
	 * Básicamente es un constructor
	 * Aquí es donde se añaden los elementos a cada lista.
	 * Para la lista de prueba se añaden en orden ascendente.
	 * Para la lista a evaluar son añadidos en orden descendente
	 */
	public RadixSortTest() {
		
		for(int counter=0; counter<listaPrueba.length; counter++) {
			this.listaPrueba[counter]=183*counter;
		}
		
		for(int counter2=0; counter2<listaRadixSort.length; counter2++) {
			this.listaRadixSort[counter2]=listaPrueba[listaPrueba.length-1-counter2];
		}
		
	}
	/**
	 * Se realiza el test.
	 * Si realmente ordena cualquier valor en cualquier posición será idéntico.
	 */
	@Test
	public void testRadixSort() {
		Random rnd= new Random();
		int randomValue = rnd.nextInt(listaPrueba.length);
		QuickSort.quickSort(listaRadixSort, 0, listaRadixSort.length - 1);
		assertEquals(listaPrueba[randomValue],listaRadixSort[randomValue]);
	}

}
