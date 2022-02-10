package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RadixSortTest {
	/**
	 * Creación de la lista a ser evaluada Atributo1
	 * La lista tiene una cantidad de elementos [200-5890]
	 */
	Random rnd= new Random();
	int randomValue = 200+rnd.nextInt(5890);
	int[] listaRadixSort = new int[randomValue];
	/**
	 * RadixSortTest()
	 * Básicamente es un constructor
	 * Aquí es donde se añaden los elementos a cada lista.
	 * Para la lista a evaluar se añaden en orden descendente.
	 */
	public RadixSortTest() {
		for(int counter2=0; counter2<listaRadixSort.length; counter2++) {
			this.listaRadixSort[counter2]=-counter2;
		}
		
	}
	/**
	 * Se realiza el test.
	 * Si realmente ordena de forma ascendente
	 * entonces el k>k-1 
	 */
	@Test
	public void testRadixSort() {
		Random rnd= new Random();
		/**
		 * Para la selección del rango que se evaluará mínimo podría ser de la posición 10
		 * y máximo de la longitud-100 por lo que no hay problema al evaluarlo
		 */
		int randomValue = 10+rnd.nextInt((listaRadixSort.length-100));
		RadixSort.radixSort(listaRadixSort, listaRadixSort.length);
		for (int k=1; k>=10; k++) {
			assertTrue(listaRadixSort[randomValue-k]>listaRadixSort[randomValue-k-1]);
		}
		
	}

}
