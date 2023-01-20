
public class Playlist {
	
	public static final int MAX_SONGS = 100;
	
	private Cancion[] canciones;
	private int contadorCanciones;
	private int cancionActual;
	private boolean isPlaying;
	
	public Playlist() {
		this.canciones = new Cancion[MAX_SONGS];
		this.contadorCanciones = 0;
		this.cancionActual = 0;
		this.isPlaying = false;
	}
	
	public void imprimirPlaylist() {
		System.out.println("Información de la Playlist");
		int contador = 0;
		if (isPlaying) {
			System.out.println("La playlist está ejecutándose");
		} else {
			System.out.println("La playlist está detenida");
		}
		for (Cancion cancion : canciones) {
			if (cancion != null) {
				System.out.print("\t"+ contador + ": " + cancion);
				if (isPlaying && (contador == cancionActual)) {
					System.out.println("*");
				} else {
					System.out.println();
				}
				contador ++;
			}
		}
		
	} // fin del método imprimePlaylist()
	
	public void play() {
		this.isPlaying = true;
	}
	
	public void pause() {
		this.isPlaying = false;
	}
	
	public void stop() {
		pause();
		cancionActual = 0;
	}
	
	public void addCancion(Cancion cancion) {
		if (buscarCancion(cancion) == -1) {
			// la canción no existe en la playlist
			if (contadorCanciones < MAX_SONGS) {
				canciones[contadorCanciones] = cancion;
				contadorCanciones ++;
				System.out.println("La canción se ha añadido con éxito");
			} else {
				System.out.println("Se ha excedido el número máximo de canciones en el playlist");
			}
		} else {
			System.out.println("La canción ya existe en la playlist");
		}
	} // fin del método addCancion
	
//	public void deleteCancion(Cancion cancionBuscada) {
//		int index = buscarCancion(cancionBuscada);
//		int contador = 0;
//		if (index == -1) {
//			System.out.println("La canción no existe en la playlist");
//		} else {
//			Cancion[] temporal = new Cancion[MAX_SONGS];
//			for (Cancion cancion : canciones) {
//				if (cancion == null) {
//					break;
//				}
//				if (index == contador) {
//					contador --;
//					index = -1;
//				} else {
//					temporal[contador] = canciones[contador];
//				}
//				contador ++;
//			}
//			canciones = temporal;
//			contadorCanciones --;
//		}
//	} // fin del método deleteCancion
	
	
	public void deleteCancion(Cancion cancionBuscada) {
		int index = buscarCancion(cancionBuscada);
		int i = 0; // indice del arreglo actual
		int j = 0; // indice del nuevo arreglo
		if (index == -1) { // la canción no existe en la lista
			System.out.println("La canción no existe en la lista");
		} else  {
			Cancion[] temporal = new Cancion[MAX_SONGS];
			for (Cancion cancion : canciones) {
				if (cancion == null) {
					break; //se terminaron las canciones, salimos del ciclo
				}
				if (i != index) { // no es la canción, la copiamos al nuevo arreglo
					temporal[j] = cancion;
					i ++;
					j ++;
				} else { // es la canción que queremos borrar, la brincamos
					i++;
				}
			}
			canciones = temporal;
			contadorCanciones --;
		}
		
	}
	
	public void next() {
		
	}
	
	public void previous() {
		
	}
	
	private int buscarCancion(Cancion cancionBuscada) {
		int index = -1;
		int contador = 0;
		for (Cancion cancion : canciones) {
			if (cancion != null) {
				if (cancionBuscada.getNombre().equals(cancion.getNombre())) {
					index = contador;
					break;
				} else {
					contador ++;
				}
			}
		}
		return index;
	}

}//fin de la clase playlist
