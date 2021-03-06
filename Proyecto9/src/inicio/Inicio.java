package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
/**
 * @author Raúl Blanco Rama
 */
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {
		
		Instituto sonFerrer = new Instituto();
		
		Grupo primeroGS = new Grupo("FPGS", 1, "A");
		Grupo terceroESOb = new Grupo("ESO", 3, "B");
		
		Grupo cuartoESOc = new Grupo();
		cuartoESOc.leeDatos();
		System.out.println();
				
		Alumno a1 = new Alumno(1, "Blanco Rama", "Raúl", primeroGS);
		Alumno a2 = new Alumno(2, "Prueba Prueba", "Carmen", terceroESOb);
		
		Alumno a4 = new Alumno();
		a4.leeDatos(cuartoESOc);
		System.out.println();
		
		sonFerrer.addAlumno(a1);
		sonFerrer.addAlumno(a2);
		sonFerrer.addAlumno(a4);
		
		System.out.println();
				
		sonFerrer.muestraAlumnos();
		System.out.println();
		sonFerrer.numAlumnos();
		
		System.out.println();
		
		sonFerrer.buscaAlumno(0002);
		System.out.println();
		sonFerrer.buscaAlumno(0003);
		
		System.out.println();
		
		sonFerrer.delAlumno(2);
		System.out.println();
		sonFerrer.delAlumno(8);
		
		System.out.println();
		
		sonFerrer.muestraAlumnos();
		
		sonFerrer.numAlumnos();
		
	}
	
}
