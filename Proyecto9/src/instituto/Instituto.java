package instituto;

/**
 * @author Raúl Blanco Rama
 */
import auxiliar.Alumno;

public class Instituto {

	// Atributos
	private final int MAX_ALUMNOS = 600;
	private Alumno alumnos[] = new Alumno[MAX_ALUMNOS];
	
	// Métodos
	public void addAlumno(Alumno alu){
		for (int i = 0; i < alumnos.length; i++){
			if (alumnos[i] == null){
				alumnos[i] = alu;
				System.out.println("Se ha añadido el alumno " + alu.getNumExpediente());
				break;
			}
		}	
	}
	
	public void delAlumno(int num){
		for (int i = 0; i < alumnos.length; i++){
			if (alumnos[i] == null){
				
			} else if (alumnos[i].getNumExpediente() == num){
				alumnos[i] = null;
				System.out.println("Se ha eliminado el alumno " + num);
				return;
			}
		}
		System.out.println("No se ha encontrado el alumno.");
	}
	
	public void muestraAlumnos(){
		int numero = 0;
		for (int i = 0; i < alumnos.length; i++){
			if (alumnos[i] != null){
				numero++;
				System.out.println(numero + ". " + alumnos[i].toString());
			}
		}
	}
	
	public void numAlumnos(){
		int total = 0;
		for (int i = 0; i < alumnos.length; i++){
			if (alumnos[i] != null){
				total++;
			}
		}
		System.out.println("Hay " + total + " alumnos en este instituto.");
	}
	
	public void buscaAlumno(int numExp){
		String resultadoBusqueda = "Alumno no encontrado.";
		for (int i = 0; i < alumnos.length; i++){
			if (alumnos[i] == null){
				break;
			} else if (alumnos[i].getNumExpediente() == numExp){
				resultadoBusqueda = "Alumno encontrado.\n"
									+ alumnos[i].toString();
				break;
			}
		}
		System.out.println(resultadoBusqueda);
	}
	
}
