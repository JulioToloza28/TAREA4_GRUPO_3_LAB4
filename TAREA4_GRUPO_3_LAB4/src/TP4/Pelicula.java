package TP4;

public class Pelicula {
	
	private int id=0;
	private String Nombre;
	private Categoria Genero;
	private static int cont=1;

	public Pelicula() {
	}
	
	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Pelicula.cont = cont;
	}

	public Pelicula(String Nombre,Categoria Genero) {
		this.id=cont;
	 	this.setNombre(Nombre);
	 	this.setGenero(Genero);
	 	cont++;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Categoria getGenero() {
		return Genero;
	}

	public void setGenero(Categoria genero) {
		Genero = genero;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}	

	@Override
	public String toString() {
		return Nombre;
	}


}
