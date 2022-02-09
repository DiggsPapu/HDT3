package sorts;

import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * 
 * @author Diego Andrés Alonzo Medinilla - 20172
 * José Alejandro Martínez de León - 21430
 * Eliezer Isaac Gutiérrez Hernández - 21836
 *
 */
public class Main {

    public static void main(String[] args) {
    	/**
    	 * Creación de objeto scanner para abrir permitir que el usuario pueda realizar un input.
    	 */
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Bienvenidos al programa del grupo 12+1 compuesto por:\nJosé Alejandro Martínez de León - 21430\nEliezer Isaac Gutiérrez Hernández - 21836\nDiego Andrés Alonzo Medinilla - 20172\n Ingrese el directorio del archivo texto donde se almacenará la lista a ordenar por favor:\n ");
        String directory = scanner.nextLine();
        /**
         * Creación de un file para almacenar el archivo.txt donde el usuario querrá que se almacenen los números ordenados.
         */
        File archive=new File(directory);
        /**
         * Creación de la variable para saber cuántos números se generarán y se ordenarán en el txt.
         */
        System.out.print("El programa está diseñado para ordenar números y almacenarlos en un archivo de texto,\n¿cuántos números (entero) desea que ordenemos en un rango de [10-3000]: \n");
        String cantidadStr = scanner.nextLine();
        try {
        	int cantidadNum = Integer.parseInt(cantidadStr);
        	
        	int[] listaQuickSort = new int[cantidadNum];
        	 int[] listaMergeSort = new int[cantidadNum];
         	int[] listaRadixSort = new int[cantidadNum];
         	int[] listaGnomeSort = new int[cantidadNum];
         	int[] listaHeapSort = new int[cantidadNum];
            Random rnd = new Random();
            System.out.println("Vector desordenado");
            for (int i = 0; i < listaQuickSort.length; i++) {
                listaQuickSort[i] = rnd.nextInt(3000);
                /**
            	 * Se replicarán las listas que se generen en el primer método para comparar la misma cantidad de tamaños.
            	 */
                listaMergeSort[i]= listaQuickSort[i];
                listaRadixSort[i]= listaQuickSort[i];
                listaGnomeSort[i]= listaQuickSort[i];
                listaHeapSort[i]= listaQuickSort[i];
                System.out.print(listaQuickSort[i] + " ");
            }
            
        	/**
        	 * Se ordena mediante quickSort
        	 */
            QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length - 1);
            /**
             * Ordenamiento de una lista ya ordenada mediante quicksort
             */
            QuickSort.quickSort(listaQuickSort, 0, listaQuickSort.length-1);
            /**
             * Impresión del vector ordenado en quickSort
             */
            System.out.println("\n\nVector ordenado en quickSort");
            for (int n : listaQuickSort) {
                System.out.print(n + " ");
            }
            /**
             * Impresión de la lista ordenada
             * Ordenamiento de la lista con MergeSort
             */
            System.out.print("\n\nVector ordenado en MergeSort\n");
            MergeSort.mergeSort(listaMergeSort, 0, listaMergeSort.length-1);
            MergeSort.mergeSort(listaMergeSort, 0, listaMergeSort.length-1);
            
            for (int n : listaMergeSort) {
                System.out.print(n + " ");
            }
            
            System.out.print("\n\nVector ordenado en GnomeSort\n");
            GnomeSort.gnomeSort(listaGnomeSort, listaGnomeSort.length);
            GnomeSort.gnomeSort(listaGnomeSort, listaGnomeSort.length);
            
            for (int n : listaGnomeSort) {
                System.out.print(n + " ");
            }
            
            System.out.print("\n\n\nVector ordenado en RadixSort\n");
            RadixSort.radixSort(listaGnomeSort, listaGnomeSort.length);
            RadixSort.radixSort(listaGnomeSort, listaGnomeSort.length);
            
            for (int n : listaGnomeSort) {
                System.out.print(n + " ");
            }
        }
        
        
        catch (Exception e) {
        	System.out.print("\nEl valor ingresado no es un número entero");
        }
        	
        
        

    }

}
