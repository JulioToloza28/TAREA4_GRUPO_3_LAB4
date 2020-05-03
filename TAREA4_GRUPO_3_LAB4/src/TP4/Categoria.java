package TP4;

public class Categoria {
	private int Id;
	private String Genero;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public Categoria(int id, String genero) {
		super();
		Id = id;
		Genero = genero;
	}
	@Override
	public String toString() {
		return Genero;
	}
	
}
