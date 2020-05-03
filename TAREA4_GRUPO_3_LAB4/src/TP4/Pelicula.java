package TP4;

public class Pelicula {
	
	private int id=0;
	private String Nombre;
	private Categoria Genero;

	public Pelicula() {
		
	}
	
	public Pelicula(String Nombre,Categoria Genero) {
	 	this.setNombre(Nombre);
	 	this.setGenero(Genero);
	 	this.setId(id+1);
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
		return "Pelicula [id=" + id + ", Nombre=" + Nombre + ", Genero=" + Genero + "]";
	}


}
