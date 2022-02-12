package sorts;

import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

/***
 * 
 * @author Diego Andr�s Alonzo Medinilla - 20172
 * Jos� Alejandro Mart�nez de Le�n - 21430
 * Eliezer Isaac Guti�rrez Hern�ndez - 21836
 *
 */
public class Main3 {

    public static void main(String[] args) {
    	/**
    	 * Creaci�n de objeto scanner para abrir permitir que el usuario pueda realizar un input.
    	 * El input sirve para saber qu� tantos n�meros se generar�n aleatoriamente y se guardar�n
    	 * en txt.
    	 */
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Bienvenidos al programa del grupo 12+1 compuesto por:\nJos� Alejandro Mart�nez de Le�n - 21430\nEliezer Isaac Guti�rrez Hern�ndez - 21836\nDiego Andr�s Alonzo Medinilla - 20172\n");
        

            /**
             * Creaci�n de la variable para saber cu�ntos n�meros se generar�n y se ordenar�n en el txt.
             */
            System.out.print("El programa est� dise�ado para ordenar n�meros y almacenarlos en un archivo de texto,\n�cu�ntos n�meros (entero) desea que ordenemos en un rango de [10-3000]: \n");
            String cantidadStr = scanner.nextLine();
            /**
             * El try and catch sirve en programaci�n defensiva para ver si el usuario ingres� enteros o no.
             */
            try {
            	int cantidadNum = Integer.parseInt(cantidadStr);
            	if (cantidadNum>=10 && cantidadNum<=3000) {
                	int[] listaOriginal = new int[cantidadNum];
                    
                 	Random rnd = new Random();
                    System.out.println("Estos son los elementos seleccionados al azar de forma desordenada\n");
                    for (int i = 0; i < listaOriginal.length; i++) {
                        listaOriginal[i] = rnd.nextInt(3000);
                        System.out.print(listaOriginal[i] + " ");
                    }
                    System.out.print("\nIngrese el directorio del archivo texto donde se almacenar�n los n�meros generados:\n");
                    String directory = scanner.nextLine(); 
                    File newfile= new File(directory);
                    if (!newfile.exists()) {
                    	newfile.createNewFile();
                    }
                    Archive archive= new Archive(newfile, listaOriginal);
                    archive.writeFile();
                    /**
                     * El user ingresa el directorio donde se ordenar� x sorts
                     */
                    System.out.print("\nIngrese el directorio del archivo texto de donde se ordenar� mediante sorts\n");
                    String directory1 = scanner.nextLine();
                    /**
                     * Se instancia objeto archivo para el manejo del texto
                     */
                    Archive archive2= new Archive(directory1);
                    /**
                     * Se crean los diferentes vectores desordenados para cada sort
                     */
                    int[] listaQuickSort = new int[archive2.getLista().length];
                	int[] listaMergeSort = new int[archive2.getLista().length];
                 	int[] listaRadixSort = new int[archive2.getLista().length];
                 	int[] listaGnomeSort = new int[archive2.getLista().length];
                 	int[] listaHeapSort = new int[archive2.getLista().length];
                    System.out.println("Vector desordenado");
                    for (int i = 0; i < listaQuickSort.length; i++) {
                        listaQuickSort[i] = archive2.getLista()[i];
                        /**
                    	 * Se replicar�n las listas que se generen en el primer m�todo para comparar la misma cantidad de tama�os.
                    	 */
                        listaMergeSort[i]= listaQuickSort[i];
                        listaRadixSort[i]= listaQuickSort[i];
                        listaGnomeSort[i]= listaQuickSort[i];
                        listaHeapSort[i]= listaQuickSort[i];
                        /**
                         * 
                         */
                        
                    }

                	/**
                	 * Se ordena mediante quickSort
                	 */
                    SortsTypes.quickSort(listaQuickSort, 0, listaQuickSort.length - 1);
                    /**
                     * Ordenamiento de una lista ya ordenada mediante quicksort
                     */
                    SortsTypes.quickSort(listaQuickSort, 0, listaQuickSort.length-1);
                    /**
                     * Impresi�n del vector ordenado en quickSort
                     */
                    System.out.println("\n\nVector ordenado en quickSort");
                    for (int n : listaQuickSort) {
                        System.out.print(n + " ");
                    }
                    /**
                     * Impresi�n de la lista ordenada
                     * Ordenamiento de la lista con MergeSort
                     */
                    System.out.print("\n\nVector ordenado en MergeSort\n");
                    SortsTypes.mergeSort(listaMergeSort, 0, listaMergeSort.length-1);
                    SortsTypes.mergeSort(listaMergeSort, 0, listaMergeSort.length-1);
                    
                    for (int n : listaMergeSort) {
                        System.out.print(n + " ");
                    }
                    /**
                     * Impresi�n de la lista ordenada
                     * Ordenamiento de la lista con GnomeSort
                     */
                    System.out.print("\n\nVector ordenado en GnomeSort\n");
                    SortsTypes.gnomeSort(listaGnomeSort, listaGnomeSort.length);
                    SortsTypes.gnomeSort(listaGnomeSort, listaGnomeSort.length);
                    
                    for (int n : listaGnomeSort) {
                        System.out.print(n + " ");
                    }
                    /**
                     * Impresi�n de la lista ordenada
                     * Ordenamiento de la lista con RadixSort
                     */
                    System.out.print("\n\n\nVector ordenado en RadixSort\n");
                    SortsTypes.radixSort(listaRadixSort, listaRadixSort.length);
                    SortsTypes.radixSort(listaRadixSort, listaRadixSort.length);
                    
                    for (int n : listaRadixSort) {
                        System.out.print(n + " ");
                    }
                    /**
                     * Impresi�n de la lista ordenada
                     * Ordenamiento de la lista con HeapSort
                     */
                    System.out.print("\n\n\nVector ordenado en HeapSort\n");
                    SortsTypes.heapSort(listaHeapSort);
                    SortsTypes.heapSort(listaHeapSort);
                    
                    for (int n : listaHeapSort) {
                        System.out.print(n + " ");
                    }
                    System.out.print("\n\nGracias por utilizar nuestro programa.\n");
                    
            	}
                	
            	else {
            		System.out.print("El valor ingresado no cumple con que sea entre 10 y 3000");
            	}
            	}   
            
            catch (Exception e) {
            	System.out.print("\nEl valor ingresado no es un n�mero entero");
            }
            
            
    }
}
        
       
        
        	
        
        

