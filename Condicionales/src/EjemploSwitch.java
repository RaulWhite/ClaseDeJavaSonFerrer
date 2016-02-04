import java.util.Scanner;

public class EjemploSwitch {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte numeroMes;
		
		System.out.println("Número de mes: ");
		numeroMes = entrada.nextByte();
		
		switch(numeroMes){
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		default:
			System.out.println("Ni enero, ni febrero, ni marzo");
		}
		
		entrada.close();

	}

}
