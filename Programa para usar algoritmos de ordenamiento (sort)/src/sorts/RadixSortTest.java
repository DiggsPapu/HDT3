package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RadixSortTest {
	/**
	 * Creaci�n de la lista a ser evaluada Atributo1
	 * Creaci�n de la lista con la que se comparar� Atributo2
	 */
	int[] listaRadixSort = new int[300];
	int[] listaPrueba =new int[300];
	/**
	 * RadixSortTest()
	 * B�sicamente es un constructor
	 * Aqu� es donde se a�aden los elementos a cada lista.
	 * Para la lista de prueba se a�aden en orden ascendente.
	 * Para la lista a evaluar son a�adidos en orden descendente
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
	 * Si realmente ordena cualquier valor en cualquier posici�n ser� id�ntico.
	 */
	@Test
	public void testRadixSort() {
		Random rnd= new Random();
		int randomValue = rnd.nextInt(listaPrueba.length);
		QuickSort.quickSort(listaRadixSort, 0, listaRadixSort.length - 1);
		assertEquals(listaPrueba[randomValue],listaRadixSort[randomValue]);
	}

}
