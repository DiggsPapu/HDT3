package sorts;
/**
 * Importación del Junit
 * Importación del test
 * Importación del Random para seleccionar
 * una posición al azar.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

/**
 * 
 * @author Diego Andrés Alonzo Medinilla - 20172
 *
 */
public class QuickSortTest {
	/**
	 * Creación de la lista a ser evaluada Atributo1
	 * Creación de la lista con la que se comparará Atributo2
	 */
	int[] listaQuickSort = new int[10];
	int[] listaPrueba =new int[10];
	/**
	 * QuickSortTest()
	 * Básicamente es un constructor
	 * Aquí es donde se añaden los elementos a cada lista.
	 * Para la lista de prueba se añaden en orden ascendente.
	 * Para la lista a evaluar son añadidos en orden descendente
	 */
	public QuickSortTest() {
		
		for(int counter=0; counter<listaPrueba.length; counter++) {
			this.listaPrueba[counter]=91*counter;
		}
		
		for(int counter2=0; counter2<listaQuickSort.length; counter2++) {
			this.listaQuickSort[counter2]=listaPrueba[listaPrueba.length-1-counter2];
		}
		
	}
	/**
	 * Se realiza el test.
	 * Si realmente ordena cualquier valor en cualquier posición será idéntico.
	 */
	@Test
	public void testQuickSort() {
		Random rnd= new Random();
		int randomValue = rnd.nextInt(listaPrueba.length);
		QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length - 1);
		assertEquals(listaPrueba[randomValue],listaQuickSort[randomValue]);
	}
	

}
