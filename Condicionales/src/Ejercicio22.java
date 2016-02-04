import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Entre semana o fin de semana?");
		String dia = entrada.nextLine().toLowerCase();
		
		int horaDeCierre;
		horaDeCierre = (dia.equals("entre semana"))?20:0;
		horaDeCierre = (dia.equals("fin de semana"))?14:horaDeCierre;
		
		String indicarHorario = (horaDeCierre == 0)?("Error"):("Cierra a las " + horaDeCierre + " horas.");
		
		System.out.println(indicarHorario);
		
		entrada.close();
			
	}
	
}
