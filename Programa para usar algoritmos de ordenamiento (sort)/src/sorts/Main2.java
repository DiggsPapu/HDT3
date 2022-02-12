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
public class Main2 {

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
         * El if es para permitir que se contin�e ejecutando si existe el directorio
         */
        if (archive.exists()==true) {

            /**
             * Creaci�n de la variable para saber cu�ntos n�meros se generar�n y se ordenar�n en el txt.
             */
            System.out.print("El programa est� dise�ado para ordenar n�meros y almacenarlos en un archivo de texto,\n�cu�ntos n�meros (entero) desea que ordenemos en un rango de [10-3000]: \n");
            String cantidadStr = scanner.nextLine();
            try {
            	FileWriter write=new FileWriter(archive,true);
            	BufferedWriter writing= new BufferedWriter(write);
            	int cantidadNum = Integer.parseInt(cantidadStr);
            	if (cantidadNum>=10 && cantidadNum<=3000) {
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
                    
                    System.out.print("\n\nVector ordenado en GnomeSort\n");
                    SortsTypes.gnomeSort(listaGnomeSort, listaGnomeSort.length);
                    SortsTypes.gnomeSort(listaGnomeSort, listaGnomeSort.length);
                    
                    for (int n : listaGnomeSort) {
                        System.out.print(n + " ");
                    }
                    
                    System.out.print("\n\n\nVector ordenado en RadixSort\n");
                    SortsTypes.radixSort(listaRadixSort, listaRadixSort.length);
                    SortsTypes.radixSort(listaRadixSort, listaRadixSort.length);
                    
                    for (int n : listaRadixSort) {
                        System.out.print(n + " ");
                    }
                    
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
        else {
        	System.out.print("El archivo ingresado no existe");
        }
        
        	
        
        

    }

}
