package sorts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class MergeSortTest {
	/**
	 * Creación de la lista a ser evaluada Atributo1
	 * Creación de la lista con la que se comparará Atributo2
	 */
	Random rnd= new Random();
	int randomValue0 = rnd.nextInt(5890);
	int[] listaMergeSort = new int[randomValue0];
	int[] listaPrueba =new int[randomValue0];
	/**
	 * MergeSortTest()
	 * Básicamente es un constructor
	 * Aquí es donde se añaden los elementos a cada lista.
	 * Para la lista de prueba se añaden en orden ascendente.
	 * Para la lista a evaluar son añadidos en orden descendente
	 */
	public MergeSortTest() {
		Random rnd= new Random();
		int randomValue1 = rnd.nextInt(listaPrueba.length);
		for(int counter=0; counter<listaPrueba.length; counter++) {
			this.listaPrueba[counter]=randomValue1*counter;
		}
		
		for(int counter2=0; counter2<listaMergeSort.length; counter2++) {
			this.listaMergeSort[counter2]=listaPrueba[listaPrueba.length-1-counter2];
		}
		
	}
	/**
	 * Se realiza el test.
	 * Si realmente ordena cualquier valor en cualquier posición será idéntico.
	 */
	@Test
	public void testMergeSort() {
		Random rnd= new Random();
		
		for (int longitud=0; longitud<=listaMergeSort.length; longitud++) {
			/**
			 * Dado que seleccionamos un rango de posiciones de lista [20-(length-100)]
			 * Y entonces el garbage collector se llevará los valores random que ya no usemos.
			 */
			int randomValue3 = 20+rnd.nextInt(listaPrueba.length-100);
			MergeSort.mergeSort(listaMergeSort, 0, listaMergeSort.length - 1);
			assertEquals(listaPrueba[randomValue3],listaMergeSort[randomValue3]);
		}
		
	}
}
