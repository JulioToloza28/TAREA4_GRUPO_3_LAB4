package TP4;

public class Pelicula {
	
	private int id=0;
	private String Nombre;
	private Categoria Genero;
	private static int cont=0;

	public Pelicula() {
		cont++;
		id=cont;
	}
	
	public Pelicula(String Nombre,Categoria Genero) {
		cont++;
		this.id=cont;
	 	this.setNombre(Nombre);
	 	this.setGenero(Genero);
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
	
/*	public static int getCurrentId() {
		return currentId;
	}
	
	public static int setCurrentId(int Cid) {
		
	}*/
	

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", Nombre=" + Nombre + ", Genero=" + Genero + "]";
	}


}
