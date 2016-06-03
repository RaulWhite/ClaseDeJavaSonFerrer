package refactorizar;
/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio18 {
	
	public static void main(String[] args) {
		
		String huecos[][][] = new String[3][3][3];
		int aleatorio;
		
		for (int i=0; i<huecos.length; i++){
			for (int j=0; j<huecos[i].length; j++){
				for (int k=0; k<huecos[i][j].length; k++){
					aleatorio = (int)(Math.random()*2 + 1);
					
					if (aleatorio==1){
						huecos[i][j][k] = "Azul";
					} else if (aleatorio==2){
						huecos[i][j][k] = "Rojo";
					}
				}
			}
		}
		
		int azules=0, rojos=0;
		
		for (int i=0; i<huecos.length; i++){
			for (int j=0; j<huecos[i].length; j++){
				for (int k=0; k<huecos[i][j].length; k++){
					if (huecos[i][j][k].equals("Azul")){
						azules++;
					} else if (huecos[i][j][k].equals("Rojo")){
						rojos++;
					}
				}
			}
		}
		
		System.out.println("Hay " + azules + " bolas azules y " + rojos + " bolas rojas.");
		
	}

}
