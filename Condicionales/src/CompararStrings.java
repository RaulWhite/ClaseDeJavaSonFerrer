import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el gerundio del verbo dormir?");
		String respuesta = entrada.next();

		System.out.println(respuesta);

		if (respuesta.equals("durmiendo")) {
			System.out.println("HAS ACERTADO!!!");
		} else {
			System.out.println("HAS FALLADO!!!");
		}

		entrada.close();
		
	}

}
