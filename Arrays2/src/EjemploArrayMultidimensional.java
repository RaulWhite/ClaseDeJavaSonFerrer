import java.util.Scanner;

public class EjemploArrayMultidimensional {

	public static void main(String[] args) {
		
		//Edificio que tiene 5 filas de 3 habitaciones cada una, y 4 plantas.
		double[][][] iluminacion = new double[5][3][4];
		Scanner entrada = new Scanner(System.in);
		
//		iluminacion[0][0][0] = 5.5;
//		iluminacion[1][0][0] = 7.2;
//		iluminacion[2][0][0] = 4.2;
//		
//		int x, y, z;
//		
//		System.out.println("Coordenadas de la habitación:");
//		System.out.print("\tFila: ");
//		x = entrada.nextInt();
//		System.out.print("\tHabitación: ");
//		y = entrada.nextInt();
//		System.out.print("\tPlanta: ");
//		z = entrada.nextInt();
//		System.out.print("\nIluminación en el despacho " + x + ", " + y + ", " + z + ": ");
//		iluminacion[x][y][z] = entrada.nextDouble();
//		
//		System.out.println();
		
		for (int i=0; i<5; i++){
			for (int j=0; j<3; j++){
				for (int k=0; k<4; k++){
					System.out.print("Iluminación del despacho " + i + ", " + j + ", " + k + ": ");
					iluminacion[i][j][k] = entrada.nextDouble();
				}
			}
		}
		
		System.out.println("\nLista de iluminación");
		System.out.println("====================");
				
		for (int i=0; i<5; i++){
			for (int j=0; j<3; j++){
				for (int k=0; k<4; k++){
					System.out.println("Iluminación del despacho " + i + ", " + j + ", " + k + " = " + iluminacion[i][j][k]);
				}
			}
		}
		
		entrada.close();
		
	}
	
}
