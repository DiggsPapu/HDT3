package sorts;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * 
 * @author Diego Andr�s Alonzo Medinilla - 20172
 * Jos� Alejandro Mart�nez de Le�n - 21430
 * Eliezer Isaac Guti�rrez Hern�ndez - 21836
 *
 */
public class Main {

    public static void main(String[] args) {
    	/**
    	 * Creaci�n de objeto scanner para abrir permitir que el usuario pueda realizar un input.
    	 */
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Bienvenidos al programa del grupo 12+1 compuesto por:\nJos� Alejandro Mart�nez de Le�n - 21430\nEliezer Isaac Guti�rrez Hern�ndez - 21836\nDiego Andr�s Alonzo Medinilla - 20172\n Ingrese el directorio del archivo texto donde se almacenar� la lista a ordenar por favor:\n ");
        String directory = scanner.nextLine();
        /**
         * Creaci�n de un file para almacenar el archivo.txt donde el usuario querr� que se almacenen los n�meros ordenados.
         */
        File archive=new File(directory);
        /**
         * Creaci�n de la variable para saber cu�ntos n�meros se generar�n y se ordenar�n en el txt.
         */
        System.out.print("El programa est� dise�ado para ordenar n�meros y almacenarlos en un archivo de texto,\n�cu�ntos n�meros (entero) desea que ordenemos en un rango de [10-3000]: \n");
        String cantidadStr = scanner.nextLine();
        try {
        	int cantidadNum = Integer.parseInt(cantidadStr);
        	
        	int[] listaQuickSort = new int[cantidadNum];
            Random rnd = new Random();
            System.out.println("Vector desordenado");
            for (int i = 0; i < listaQuickSort.length; i++) {
                listaQuickSort[i] = rnd.nextInt(3000);
                System.out.print(listaQuickSort[i] + " ");
            }
            /**
        	 * Se replicar�n las listas que se generen en el primer m�todo para comparar la misma cantidad de tama�os.
        	 */
            int[] listaMergeSort = listaQuickSort;
        	int[] listaRadixSort = listaQuickSort;
        	int[] listaGnomeSort = listaQuickSort;
        	int[] listaHeapSort = listaQuickSort;
        	/**
        	 * Se ordena mediante quickSort
        	 */
            QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length - 1);
            /**
             * Ordenamiento de una lista ya ordenada mediante quicksort
             */
            QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length-1);
            /**
             * Impresi�n del vector ordenado en quickSort
             */
            System.out.println("\nVector Ordenado en quickSort");
            for (int n : listaQuickSort) {
                System.out.print(n + " ");
            }
//            mergeSortRecursive(listaMergeSort, );
        }
        catch (Exception e) {
        	System.out.print("El valor ingresado no es un n�mero entero");
        }
        	
        
        

    }

}
