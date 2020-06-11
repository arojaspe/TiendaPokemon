package visual;
import java.util.Scanner;
import logica.main;


public class GUI {

	public static void mostrarLogo() {
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
	}

	public static void menuTienda(){
		System.out.println("Bienvenido a la tienda Pokemon de la Ciudad Universitaria");
		System.out.println("En que te puedo ayudar?");
		System.out.println("      1. Comprar");
		System.out.println("	  2. Pago");
		System.out.println("      3. Ya vengo(salir)");
	}

	public static void mostrarProductos(){
		System.out.println("Escoge un tipo producto:");
		System.out.println("      1. Botiquin");
		System.out.println("      2. Bayas");
		System.out.println("      3. Objetos Clave");
		System.out.println("	  4. PokeBalls" );
		System.out.println("	  5. Objetos Comunes");
		System.out.println(" 	  6. Evolución");
	}

	public static void mostrarBotiquin(){
		System.out.println("Tenemos muchos productos de Botiquin:");
		System.out.println("	  1. Curación de estados");
		System.out.println("	  2. Recuperar vitalidad");
		System.out.println("	  3. Restauración cambio de PP");
		System.out.println("	  4. Mejora de estadísticas");
	}
	public static void mostrarMediosDePago(){
		System.out.println("	  1. Efectivo");
		System.out.println("	  2. Tarjeta débito o crédito (Sin IVA)");
		System.out.println("	  3. Pago en especie");
	}
	public static void mostrarMenuBolsaPlastica(){
		System.out.println("	  1. Sí");
		System.out.println("	  2. No es necesario, gracias");
	}

	public static void mostrarElemento(String e){
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("							  "+e);
		System.out.println("---------------------------------------------------------------------------");
	}

	public static void entradaErronea(){
		System.out.println("****************************************************************************");
		System.out.println("					Entrada invalida, vuelve a intentarlo");
		System.out.println("****************************************************************************");
	}
}
