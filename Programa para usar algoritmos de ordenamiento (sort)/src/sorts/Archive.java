package sorts;

import java.io.*;
import java.util.Scanner;


public class Archive {
	private File file;
	private int[] lista;
	/**
	 * Es la clase constructor en la que se almacena una nueva lista
	 * @param filedir
	 * @param lista
	 */
	public Archive(File filedir, int[] lista) {
		this.file=filedir;
		this.lista=lista;
		
	}
	public Archive(String filedi) {
		/**
		 * Try and catch x los valores del texto
		 */
		try {
			
			BufferedReader read= new BufferedReader(new FileReader(filedi));
			/**
			 * Se concatena en una linea para después splitear
			 */
			String contenido = read.readLine();
			String[] tempArray= contenido.split(",");
			read.close();
			/**
			 * Se asigna la cantidad de espacios 
			 */
			this.lista=new int[tempArray.length];
			for(int k=0; k<tempArray.length;k++) {
				this.lista[k]=Integer.parseInt(tempArray[k]);
			}
		}
		catch (Exception e) {
			System.out.print("El archivo no es posible de ordenar dado que no solo posee números\n");
			this.lista=null;
		}
	}
	/**
	 * Este método sirve para verificar si existe el file.
	 * Sirve para leer el archivo.
	 * Crea una lista que almacenará los valores del texto.
	 * @param filedir
	 * @return
	 */
	public int[] text_array() {
		if (getFile().exists()) {
			try { 
				Scanner sc = new Scanner(file);
				while (sc.hasNextLine()) {
					int i = sc.nextInt();
					this.lista[lista.length+1]=i;
				}
				/**
				 * Es un verificador para que la cantidad de valores ingresados en el texto sea 10<=x<=3000
				 * Si no tira un error y la lista se queda en nulo
				 */
				less10_more3000();
		        sc.close();
		        } 
			    catch (FileNotFoundException e) {
			    e.printStackTrace();
			    System.out.print("\nEl texto contiene valores no enteros, por lo que es inválido\n");
			    setLista(null);
			    
			    }
		}
		else {
			System.out.print("No existe el archivo que introdujo");
		}
		return lista;
	}
	
	public void less10_more3000() {
		if (lista.length<10) {
			System.out.print("\nLos datos de la lista son inválidos dado que es menor de 10 elementos\n");
			setLista(null);
			Integer.parseInt("veinte");
		}
		else if(lista.length>3000) {
			System.out.print("\nLos datos del texto son inválidos dado que son mayores a 3000 elementos\n");
			setLista(null);
			Integer.parseInt("veinte");
			
		}
	}
	
	public void writeFile() {
		 try {
			 	/**
			 	 * Se crea un escritor para poder escribir en el archivo txt
			 	 */
			 	FileWriter escribir = new FileWriter(getFile(), true);
	            //Escribimos en el archivo con el metodo write 
			 	/**
			 	 * Se genera un separador por comas
			 	 */
	            for (int i = 0; i < getLista().length; i++) {
	                escribir.write(Integer.toString(getLista()[i])+",");
	            }
	            /**
	             * Se envia un mensaje de éxito
	             * Se cierra la escritura del archivo con write.
	             */
	            System.out.print("\nEl archivo fue creado exitosamente\n");
	            escribir.close();
	        } 
		 /**
		  * El catch x cualquier cosa
		  */
	        catch (Exception e) {
	            System.out.println("Error al escribir");
	        }

        }
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public int[] getLista() {
		return lista;
	}
	public void setLista(int[] lista) {
		this.lista = lista;
	}


}


