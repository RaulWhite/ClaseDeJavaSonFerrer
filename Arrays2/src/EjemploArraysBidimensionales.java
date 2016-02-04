
public class EjemploArraysBidimensionales {

	public static void main(String[] args) {

		// String temperaturas[][] = new String[7][2];

		// temperaturas[0][0] = "Lunes";
		// temperaturas[1][0] = "Martes";
		// temperaturas[2][0] = "Miércoles";
		// temperaturas[3][0] = "Jueves";
		// temperaturas[4][0] = "Viernes";
		// temperaturas[5][0] = "Sábado";
		// temperaturas[6][0] = "Domingo";
		//
		// temperaturas[0][1] = "15";
		// temperaturas[1][1] = "12";
		// temperaturas[2][1] = "11";
		// temperaturas[3][1] = "14";
		// temperaturas[4][1] = "16";
		// temperaturas[5][1] = "12";
		// temperaturas[6][1] = "13";

		String temperaturas[][] = { { "Lunes", "15" }, { "Martes", "12" }, { "Miércoles", "11" }, { "Jueves", "14" },
				{ "Viernes", "16" }, { "Sábado", "12" }, { "Domingo", "13" } };
		
		System.out.println("---------- Ejercicio 1 ----------");
		// Ejercicio: Mostrar la primera columna de la tabla
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i][0]);
		}

		System.out.println("\n---------- Ejercicio 2 ----------");
		// Ejercicio: Mostrar la segunda columna de la tabla
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i][1]);
		}

		System.out.println("\n---------- Ejercicio 3 ----------");
		// Ejercicio: Mostrar toda la tabla
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i][0] + "\t" + temperaturas[i][1]);
		}

	}

}