
public class Cancion {
	
	private String nombre;
	private double duracion;
	
	public Cancion(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public String toString() {
		String mensaje = String.format("%s (%.2f)", this.nombre,this.duracion);
		return mensaje;
	}
	
	public String getNombre() {return this.nombre;}
	

}
