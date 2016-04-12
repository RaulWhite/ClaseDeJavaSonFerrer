package ejemplo1;
/**
 * @author Raúl Blanco Rama
 */
public class Cliente extends Persona {

	private String visa;
	
	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Visa: " + visa);
	}
	
	public void saluda(){
		System.out.println("Hola.");
	}

	/*@Override
	public void darDeAlta() {
		
	}*/

}