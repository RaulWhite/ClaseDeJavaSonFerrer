/**
 * @author Raúl Blanco Rama
 */
package biblioteca;

public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private Autor autores[];
	private static int annoActual;
	
	// Constructores
	public Libro(){
		
	}
	
	public Libro(String titulo){
		this.titulo = titulo;
	}
	
	public Libro(String titulo, String isbn, Autor[] autores){
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}
	
	// Métodos
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public Autor[] getAutor(){
		return autores;
	}
	
	public void setAutor(Autor[] autores){
		this.autores = autores;
	}
	
	public int getAnnoActual(){
		return annoActual;
	}
	
	public void setAnnoActual(int annoActual){
		this.annoActual = annoActual;
	}
	
	public String toString(){
		String varios;
		if (autores.length == 1){
			varios = autores[0].getNombre();
		} else {
			varios = "Varios autores";
		}
		
		return ("Título: " + titulo
			+ "\nISBN: " + isbn
			+ "\nAutor: " + varios
			+ "\nAño: " + annoActual);
	}
	
	public String muestraAutores(){
		String muestra = "- " + autores[0].getNombre();
		for (int i = 1; i < autores.length; i++){
			muestra = muestra + "\n- " + autores[i].getNombre();
		}
		
		return muestra;
	}
	
}
