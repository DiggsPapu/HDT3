package sorts;
/**
 * Importaci�n del Junit
 * Importaci�n del test
 * Importaci�n del Random para seleccionar
 * una posici�n al azar.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

/**
 * 
 * @author Diego Andr�s Alonzo Medinilla - 20172
 *
 */
public class QuickSortTest {
	/**
	 * Creaci�n de la lista a ser evaluada Atributo1
	 * Creaci�n de la lista con la que se comparar� Atributo2
	 */
	int[] listaQuickSort = new int[10];
	int[] listaPrueba =new int[10];
	/**
	 * QuickSortTest()
	 * B�sicamente es un constructor
	 * Aqu� es donde se a�aden los elementos a cada lista.
	 * Para la lista de prueba se a�aden en orden ascendente.
	 * Para la lista a evaluar son a�adidos en orden descendente
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
	 * Si realmente ordena cualquier valor en cualquier posici�n ser� id�ntico.
	 */
	@Test
	public void testQuickSort() {
		Random rnd= new Random();
		int randomValue = rnd.nextInt(listaPrueba.length);
		QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length - 1);
		assertEquals(listaPrueba[randomValue],listaQuickSort[randomValue]);
	}
	

}
