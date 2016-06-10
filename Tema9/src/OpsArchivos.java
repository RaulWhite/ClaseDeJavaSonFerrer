import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class OpsArchivos {

	public static void main(String[] args) {
		
		File carpeta1 = new File("imagenes");
		carpeta1.mkdir();
		
		File carpeta2 = new File("conf");
		boolean resultado = carpeta2.mkdir();
		
		if(resultado)
			System.out.println("Ok");
		else
			System.out.println("Mal");
		
		File rutaCompleta = new File("activos/imagenes/jpg");
		resultado = rutaCompleta.mkdirs();
		
		if(resultado)
			System.out.println("Ruta creada correctamente");
		else
			System.out.println("Ruta no creada");
		
		File rutaCompleta2 = new File("album/2015/11");
		resultado = rutaCompleta2.mkdirs();
		
		if(resultado)
			System.out.println("Ruta creada correctamente");
		else
			System.out.println("Ruta no creada");
		
		carpeta2.delete();
		
		File archivo = new File("sonidos/abrir.mp3");
		archivo.delete();
		
		File carpeta = new File("sonidos");
		carpeta.delete();
		
		File puntuaciones = new File("puntuaciones.dat");
		try {
			puntuaciones.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		puntuaciones.renameTo(new File("puntos.dat"));
		
	}
	
}