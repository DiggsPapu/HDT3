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
                    
                    if (archive2.getLista()!=null) {
                    	SortsTypes.sortsExecute(archive2);
                    }
                    
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
        
       
        
        	
        
        

