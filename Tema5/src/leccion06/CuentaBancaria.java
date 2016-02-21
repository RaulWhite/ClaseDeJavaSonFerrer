package leccion06;

/**
 * @author Raúl Blanco Rama
 */

public class CuentaBancaria {

	// Atributos: saldo
	
	private double saldo;
	
	// Métodos
	// - Constructor (tomando como parámetro el saldo)
	
	CuentaBancaria(){
		
	}
	
	CuentaBancaria(double saldo){
		this.saldo = saldo;
	}
	
	// - Depositar (toma una cantidad y la suma al saldo)
	
	void depositar (double deposito){
		saldo = deposito + saldo;
	}
	
	// - Boolean retirar (si se puede sacar esa cantidad lo hace)
		
	boolean retirar (double retiro){
		if (saldo < retiro){
			return false;
		} else {
			saldo = saldo - retiro;
			return true;
		}
	}
	
	// - Métodos de acceso para el saldo
	
	void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	double getSaldo(){
		return saldo;
	}
	
}
