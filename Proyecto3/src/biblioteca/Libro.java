/**
 * @author Raúl Blanco Rama
 */
package biblioteca;

public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private Autor autor;
	private static int annoActual;
	
	// Constructores
	public Libro(){
		
	}
	
	public Libro(String titulo){
		this.titulo = titulo;
	}
	
	public Libro(String titulo, String isbn, Autor autor){
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
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
	
	public Autor getAutor(){
		return autor;
	}
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public int getAnnoActual(){
		return annoActual;
	}
	
	public void setAnnoActual(int annoActual){
		this.annoActual = annoActual;
	}
	
	public String toString(){
		return ("Título: " + titulo
			+ "\nISBN: " + isbn
			+ "\nAutor: " + autor.getNombre()
			+ "\nAño: " + annoActual);
	}
	
}
