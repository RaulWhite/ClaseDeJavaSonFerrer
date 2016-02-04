import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Indicar el nombre
		System.out.print("Nombre: ");
		String nombre;
		nombre = teclado.nextLine();
		
		//Indicar la nota de la 1ª evaluación
		System.out.print("Nota 1ª evaluación: ");
		float nota1;
		nota1 = teclado.nextFloat();

		//Indicar la nota de la 2ª evaluación
		System.out.print("Nota 2ª evaluación: ");
		float nota2;
		nota2 = teclado.nextFloat();
		
		//Indicar la nota de la 3ª evaluación
		System.out.print("Nota 3ª evaluación: ");
		float nota3;
		nota3 = teclado.nextFloat();
		
		//Calcular la media
		float media = (nota1 + nota2 + nota3) / 3;
		
		//Sacar la nota media por pantalla
		System.out.println("La nota media del alumno " + nombre + " es de un: " + media + ".");
		
		teclado.close();
		
	}

}
