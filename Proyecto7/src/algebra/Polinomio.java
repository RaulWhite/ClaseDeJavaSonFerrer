package algebra;
/**
 * @author Raúl Blanco Rama
 */

public class Polinomio {

	// Atributos
	private double coeficientes[];

	// Constructores
	public Polinomio(){
		this(2);
	}
	
	public Polinomio (int grado){
		coeficientes = new double[(grado+1)];
	}
	
	public Polinomio (double[] coefs){
		coeficientes = coefs;
	}
	
	// Métodos
	public double[] getCoeficientes() {
		return coeficientes;
	}

	public void setCoeficientes(double[] coeficientes) {
		this.coeficientes = coeficientes;
	}
	
	public int getGrado(){
		return coeficientes.length - 1;
	}
	
	public double evaluar (double x){
		double resultado = coeficientes[0];
		for (int i = 1; i < coeficientes.length; i++){
			resultado = resultado + (coeficientes[i] * Math.pow(x, i));
		}
		return resultado;
	}
	
	public Polinomio sumar(Polinomio q){
		double[] coeficientesQ = q.getCoeficientes();
		double[] suma = new double[q.getGrado()+1];
		
		for (int i = 0; i < coeficientes.length; i++){
			suma[i] = coeficientes[i] + coeficientesQ[i];
		}
		
		return (new Polinomio(suma));
	}
	
	public Polinomio restar (Polinomio q){
		double[] coeficientesQ = q.getCoeficientes();
		double[] resta = new double[q.getGrado()+1];
		
		for (int i = 0; i < coeficientes.length; i++){
			resta[i] = coeficientes[i] - coeficientesQ[i];
		}
		
		return (new Polinomio(resta));
	}
	
	public String toString(){
		String imprimir = "" + coeficientes[0];;

		for (int i = 1; i < coeficientes.length; i++){	
			if (coeficientes[i]==0){ // No imprimir nada en 0
				
			}else if (coeficientes[i]==1){ // No imprimir el 1, solo la x
				imprimir = imprimir + " + " + "x^" + i;
			}else if (coeficientes[i]<0){ // Indicar resta en vez de suma en números negativos
				imprimir = imprimir + " - " + (coeficientes[i] * (-1)) + "x^" + i;
			} else {
				imprimir = imprimir + " + " + coeficientes[i] + "x^" + i;
			}
		}
		return imprimir;
	}
	
	public void finalize(){
		System.out.println("El recolector de basura está en marcha");
	}
	
}
