package visual;
import java.util.Scanner;
import logica.main;


public class GUI {
	public static void main(String[] args) {
		while (true) {
			menuTienda();
			main.main(args);
			}
		}
	
public static void menuTienda() {
		System.out.println("                                  ,'\\");
		System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____");
		System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
		System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
		System.out.println(" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
		System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
		System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
		System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
		System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
		System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
		System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
		System.out.println("                                `'                            '-._|");
		System.out.println("Bienvenido a la tienda Pokemón de la Ciudad Universitaria");
		System.out.println("¿En qué te puedo ayudar?");
		System.out.println("      1. Comprar");
		System.out.println("      2. Salir");

	}

}
