
public class TestAlbum {

	public static void main(String[] args) {
		
		Playlist playlist1 = new Playlist();
		
		// Creamos un nuevo Album
		
		Album kiss1 = new Album("Dynasty", "KISS");
		
		// creamos las canciones y las añadimos al album
		Cancion cancion = new Cancion("I Was Made for Lovin You", 4.31);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("2000 Man", 4.55);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Sure Know Something", 4.01);
		playlist1.addCancion(cancion);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Dirty Living", 4.27);
		playlist1.addCancion(cancion);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Charisma", 4.25);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Magic Touch", 4.42);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Hard Times", 3.31);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("X-Ray Eyes", 3.46);
		kiss1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		
		Album dpurple1 = new Album("Deepest Purple", "Deep Purple");
		cancion = new Cancion("Black Night", 4.27);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Speed King", 5.49);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Strange Kind of Woman", 3.53);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Woman from Tokyo", 5.46);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Highway Star", 6.07);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Space Trucking", 4.52);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Burn", 4.30);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Stormbringer", 4.04);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Demons Eye", 5.22);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		cancion = new Cancion("Smoke in the Water", 5.37);
		dpurple1.añadirCancion(cancion);
		playlist1.addCancion(cancion);
		
		System.out.println(kiss1);
		System.out.println(dpurple1);
		
		playlist1.imprimirPlaylist();
		
		playlist1.addCancion(new Cancion("Smoke in the Water", 5.37));
		playlist1.deleteCancion(new Cancion("I Surrender", 3.45));
		
		playlist1.deleteCancion(new Cancion("Space Trucking", 4.52));
		
		playlist1.imprimirPlaylist();
		
		playlist1.deleteCancion(new Cancion("2000 Man",4.55));
		
		playlist1.imprimirPlaylist();
		
		playlist1.addCancion(new Cancion("Highway to Hell", 4.55));
		
		playlist1.imprimirPlaylist();
		
		

	}

}
