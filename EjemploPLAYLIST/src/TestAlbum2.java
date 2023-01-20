
public class TestAlbum2 {

	public static void main(String[] args) {
		
		// Vamos a crear dos albums y añadir las canciones a cada
		// uno
		
		Album kiss1 = new Album("Dinasty", "KISS");
		
		Cancion cancion = new Cancion("I Was Made for Lovin You",4.31);
		kiss1.añadirCancion(cancion);	
		cancion = new Cancion("2000 Man",4.55);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Sure Know Something",4.01);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Dirty Livin",4.27);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Charisma",4.25);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Magic Touch",4.42);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Hard Times",3.31);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("X-Ray Eyes",3.46);
		kiss1.añadirCancion(cancion);
		cancion = new Cancion("Save Your Love",4.40);
		kiss1.añadirCancion(cancion);
		
		Album dpurple = new Album("Deepest Purple", "Deep Purple");
		
		cancion = new Cancion("Black Night",3.27);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Speed King",5.49);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Fireball",3.23);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Strange Kind of Woman",3.53);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Woman from Tokyo",5.46);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Highway Star",6.07);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Space Truckin",4.32);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Burn",4.30);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Stormbringer",4.04);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Smoke in the Water",5.37);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Demons Eye",5.22);
		dpurple.añadirCancion(cancion);
		cancion = new Cancion("Stormbringer",4.04);
		dpurple.añadirCancion(cancion);
		
		
		System.out.println(kiss1);
		System.out.println(dpurple);
		
		

	}

}
