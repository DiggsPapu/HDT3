package sorts;

import java.util.Random;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.print("Bienvenidos al programa del grupo 12+1 compuesto por:\nJosé Alejandro Martínez de León - 21430\nEliezer Isaac Gutiérrez Hernández - 21836\nDiego Andrés Alonzo Medinilla - 20172\n Ingrese el directorio del archivo texto donde se almacenará la lista a ordenar por favor:\n ");
        File archivo=new File("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT 2\\datos.txt");
        int[] numeros = new int[40];
        Random rnd = new Random();
        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(3000);
            System.out.print(numeros[i] + " ");
        }   
        QuickSort.quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");
            
        }
        

    }

}
