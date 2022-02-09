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
            System.out.println("\nVector Ordenado en quickSort");
            for (int n : listaQuickSort) {
                System.out.print(n + " ");
            }

            System.out.print("\n");
            /**
             * Aquí se obtiene la mitad(redondeado a abajo) para generar dos listas trabajables en Merge
             */
//            int getmiddle=(int) Math.floor(listaMergeSort.length/2);
            /**
             * La lista suelo tendrá la misma cantidad de espacios que la mitad xq comienza en 0
             * Se añade elementos mediante for
             */
//            int[] listaMergeFloor = new int[getmiddle];
//            for (int k=0; k<=getmiddle-1; k++) {
//            	listaMergeFloor[k]=listaMergeSort[k];
//            }
            /**
             * La lista techo tendrá la misma cantidad de espacios que la diferencia entre middle y la longitud
             * Se añaden los elementos x for, donde cada elemento del techo es equivalente a l+la mitad.
             */
//            MergeSort.mergeSort(listaMergeSort, listaMergeSort.length);
            System.out.print("Vector ordenado en MergeSort\n");
            MergeSort.mergeSort(listaMergeSort, 0, listaMergeSort.length-1);
            for (int n : listaMergeSort) {
                System.out.print(n + " ");
            }

        }
        
        
        catch (Exception e) {
        	System.out.print("El valor ingresado no es un número entero");
        }
        	
        
        

    }

}
