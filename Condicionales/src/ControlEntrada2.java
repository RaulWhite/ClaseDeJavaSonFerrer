import java.util.Scanner;

public class ControlEntrada2 {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.print("Edad: ");
		
		if(entrada.hasNextInt()==true) {
			
			edad = entrada.nextInt();
			System.out.println("Tienes " + edad + " años.");
			
		}else{
			
			System.out.println("Entrada no válida.");
			
		}
		
		entrada.close();
		
	}
	
}
