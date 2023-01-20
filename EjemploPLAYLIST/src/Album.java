
public class Album {
	
	private String titulo;
	private String artista;
	private Cancion[] canciones;
	private int contadorCanciones;
	
	public Album (String titulo, String artista) {
		this.titulo = titulo;
		this.artista = artista;
		this.canciones = new Cancion[10];
		this.contadorCanciones = 0;
	}
	
	public String toString() {
		String mensaje = String.format("Titulo: %s\nArtista: %s\n", 
				this.titulo,this.artista);
		mensaje += "Canciones: \n";
		for (Cancion cancion : canciones) {
			if (cancion != null) {
				mensaje += "\t"+cancion.toString() +"\n";
			}
		}
		return mensaje;
	}
	
	public void añadirCancion(Cancion cancion) {
		if (contadorCanciones > 9) {
			System.out.println("No se puede añadir la canción");
		} else {
			canciones[contadorCanciones] = cancion;
			contadorCanciones ++;
			System.out.println("Canción añadida con éxito");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}// fin de la clase Album
