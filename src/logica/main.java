package logica;

import datos.*;
import visual.GUI;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class main {

    public static void main(String args[]) {

        //Instancias elementos Curaci�n Estados
        HashMap<Integer, CuracionEstados> CuracionEstados = new HashMap<Integer, CuracionEstados>();
        CuracionEstados.put(1, new CuracionEstados("Antihielo", 8, "Medicina en espray que descongela a un Pok�mon."));
        CuracionEstados.put(2, new CuracionEstados("Antiparalizador", 200, "Medicina en espray que cura a un Pok�mon paralizado."));
        CuracionEstados.put(3, new CuracionEstados("Antiquemar", 40, "Medicina en espray que cura las quemaduras a un Pok�mon."));
        CuracionEstados.put(4, new CuracionEstados("Ant�doto", 20, "Medicina en espray que contrarresta los efectos del veneno en un Pok�mon."));
        CuracionEstados.put(5, new CuracionEstados("Ant�-Covid19", 100, "Te quita el covi"));
        CuracionEstados.put(6, new CuracionEstados("Galleta Lava", 25, "Dulce t�pico de Pueblo Lavacalda que cura todos los problemas de estado de un Pok�mon."));
        CuracionEstados.put(7, new CuracionEstados("Galleta Yantra", 30, "Especialidad de Ciudad Yantra. Cura los problemas de estado de un Pok�mon."));
        CuracionEstados.put(8, new CuracionEstados("Hierba Mental", 67, "El Pok�mon que la lleva se libera del enamoramiento. Solo puede usarse una vez."));
        CuracionEstados.put(9, new CuracionEstados("Polvo Curaci�n", 44, "Polvos medicinales muy amargos que curan todos los problemas de estado de un Pok�mon."));
        CuracionEstados.put(10, new CuracionEstados("Porcehelado", 32, "Especialidad de Ciudad Porcelana. Cura los problemas de estado de un Pok�mon."));
        CuracionEstados.put(11, new CuracionEstados("Refresco", 15, "Chispeante bebida gaseosa que restaura 60 PS de un Pok�mon."));
        CuracionEstados.put(12, new CuracionEstados("Restaurar Todo", 100, "Medicina que restaura todos los PS y cura todos los problemas de estado de un Pok�mon."));

        //Instancias elementos Recuperar Vitalidad
        HashMap<Integer, RecuperarVitalidad> RecuperarVitalidad = new HashMap<Integer, RecuperarVitalidad>();
        RecuperarVitalidad.put(1, new RecuperarVitalidad("Poci�n", 22, "Medicina en espray que cura heridas y restaura 20 PS a un Pok�mon."));
        RecuperarVitalidad.put(2, new RecuperarVitalidad("Revivir", 19, "Medicina que revive a un Pok�mon debilitado y le devuelve la mitad de sus PS."));
        RecuperarVitalidad.put(3, new RecuperarVitalidad("Superpoci�n", 100, "Medicina en espray que cura heridas y restaura 50 PS de un Pok�mon."));
        RecuperarVitalidad.put(4, new RecuperarVitalidad("Limonada", 6, "Bebida muy dulce que restaura 80 PS de un Pok�mon."));
        RecuperarVitalidad.put(5, new RecuperarVitalidad("Leche Mu-mu", 12, "Leche de alto valor nutritivo que restaura 100 PS de un Pok�mon."));
        RecuperarVitalidad.put(6, new RecuperarVitalidad("Caramelo Raro", 99, "Caramelo energ�tico que sube a un Pok�mon de nivel."));
        RecuperarVitalidad.put(7, new RecuperarVitalidad("Agua Fresca", 2, "Agua de alto contenido mineral que restaura 50 PS de un Pok�mon."));
        RecuperarVitalidad.put(8, new RecuperarVitalidad("Hiperpoci�n", 101, "Medicina en espray que cura heridas y restaura 200 PS de un Pok�mon."));
        RecuperarVitalidad.put(9, new RecuperarVitalidad("Ra�z Energ�a", 105, "Ra�z muy amarga que restaura 200 PS de un Pok�mon."));

        //Instancias elementos Recuperar
        HashSet<CambioPP> CambioPP = new HashSet<CambioPP>();
        CambioPP.add(new CambioPP("Elixir", 10, "Restaura 10 PP de todos los movimientos aprendidos por el Pok�mon elegido."));
        CambioPP.add(new CambioPP("Elixir Maximo", 20, "Restaura completamente los PP de todos los movimientos aprendidos por el Pok�mon elegido."));
        CambioPP.add(new CambioPP("�ter", 20, "Restaura 10 PP del movimiento elegido de un Pok�mon."));
        CambioPP.add(new CambioPP("�ter Maximo", 30, "Restaura completamente los PP del movimiento elegido de un Pok�mon."));
        CambioPP.add(new CambioPP("M�s PP", 38, "Aumenta ligeramente los PP m�ximos del movimiento elegido de un Pok�mon."));
        CambioPP.add(new CambioPP("PP M�ximos", 56, "Aumenta hasta el l�mite los PP m�ximos del movimiento elegido de un Pok�mon."));

        //Instancias Mejora de estad�sticas
        HashSet<MejorarEstadisticas> MejorarEstadisticas = new HashSet<MejorarEstadisticas>();
        MejorarEstadisticas.add(new MejorarEstadisticas("Ataque X", 89, "Aumenta el Ataque en combate. Al intercambiar de Pok�mon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Calcio", 44, "Nutritiva bebida que potencia el Ataque Especial de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Carburante", 54, "Nutritiva bebida que potencia la Velocidad de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defensa Especial X", 99, "Aumenta la Defensa Especial en combate. Al cambiar de Pok�mon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defensa X", 101, "Aumenta la Defensa en combate. Al cambiar de Pok�mon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Velocidad X", 110, "Aumenta la Velocidad en combate. Al cambiar de Pok�mon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Precisión X", 98, "Aumenta la Precisi�n de los ataques en combate. Al cambiar de Pok�mon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Mente", 126, "Pluma que aumenta un poco la Defensa Especial de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Músculo", 99, "Pluma que aumenta un poco el Ataque de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Vigor", 100, "Pluma que aumenta un poco los PS de base de un Pok�mon"));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Aguante", 111, "Pluma que aumenta un poco la Defensa de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma ímpetu", 113, "Pluma que aumenta un poco la Velocidad de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Intelecto", 140, "Pluma que aumenta un poco el Ataque Especial de base de un Pok�mon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Hierro", 50, "Nutritiva bebida que potencia la Defensa de base de un Pok�mon."));

        //Instancias Bayas
        TreeMap<Integer, Bayas> Bayas = new TreeMap<Integer, Bayas>();
        Bayas.put(1, new Bayas("Baya Atania", 12, "Los Pok�mon pueden llevarla o usarla para despertar del sue�o."));
        Bayas.put(2, new Bayas("Baya Zreza", 16, "Los Pok�mon pueden llevarla o usarla para recuperarse de los par�lisis"));
        Bayas.put(3, new Bayas("Baya Meloc", 19, "Los Pok�mon pueden llevarla o usarla para curarse del envenenamiento."));
        Bayas.put(4, new Bayas("Baya Aranja", 5, "Los Pok�mon pueden llevarla o usarla para restaurar 10PS."));
        Bayas.put(5, new Bayas("Baya Peragu", 2, "Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pok�mon de la regi�n de Sinnoh."));
        Bayas.put(6, new Bayas("Baya Latano", 3, "Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pok�mon de la regi�n de Sinnoh."));
        Bayas.put(7, new Bayas("Baya Perasi", 10, "Los Pok�mon pueden levarla o usarla para descongelarse."));
        Bayas.put(8, new Bayas("Baya Gualot", 11, "Si la lleva un Pok�mon, debilita un ataque supereficaz de tipo El�ctrico de un enemigo."));

        //Instancias Objetos Clave
        ArrayList<Obj_clave> Obj_clave = new ArrayList<Obj_clave>();
        Obj_clave.add(new Obj_clave("Bici Acrob�tica", 89, "Bici plegable ideal para saltar y hacer caballitos y giros."));
        Obj_clave.add(new Obj_clave("Super Ca�a", 50, "Incre�ble ca�a de pescar de alta tecnolog�a. Pesca Pok�mon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Monedero", 15, "Te servir� para llevar hasta 9999 fichas."));
        Obj_clave.add(new Obj_clave("Caña Buena", 20, "Ca�a de pescar nuevecita y de gran calidad. Pesca Pok�mon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Busca Objetos", 31, "Detector de objetos invisibles por ondas sonoras."));
        Obj_clave.add(new Obj_clave("Cam�ra Lucha", 38, "Un fant�stico dispositivo que graba combates entre amigos o celebrados en alg�n recinto especial."));
        Obj_clave.add(new Obj_clave("Planta Bayas", 44, "Dispositivo port�til de cultivo que permite plantar Bayas en cualquier momento de forma sencilla."));
        Obj_clave.add(new Obj_clave("Regadera", 10, "Objeto que contiene agua y se usa para regar las Bayas del Plantabayas."));

        //Instancias PokeBalls
        TreeMap<Integer, PokeBall> PokeBall = new TreeMap<Integer, PokeBall>();
        PokeBall.put(1, new PokeBall("Ultra Ball", 20, "Poke Ball de rendimiento superior. Tiene un �ndice de �xito mayor al de la Super Ball."));
        PokeBall.put(2, new PokeBall("Super Ball", 9, "Poke Ball de alto rendimiento. Tiene un �ndice de �xito superior al de la Pok� Ball."));
        PokeBall.put(3, new PokeBall("Pok� Ball", 5, "Dispositivo con dise�o capsular que atrapa Pok�mon salvajes. Se lanza como una bola contra el blanco."));
        PokeBall.put(4, new PokeBall("M�ster Ball", 11, "La Poke Ball definitiva. Atrapa cualquier Pok�mon salvaje y no falla nunca."));
        PokeBall.put(5, new PokeBall("Honor Ball", 15, "Es una Poke Ball algo singular que se cre� para conmemorar alg�n acontecimiento."));
        PokeBall.put(6, new PokeBall("Lujo Ball", 18, "Acogedora Poke Ball que hace m�s amistosos a los Pok�mon salvajes capturados."));

        //Instancias Objetos
        ArrayList<Objetos> Objetos = new ArrayList<Objetos>();
        Objetos.add(new Objetos("Agua M�stica", 67, "Gema con forma de gota de agua que fortalece los movimientos de tipo Agua. Debe lleverla un Pok�mon."));
        Objetos.add(new Objetos("Diamansfera", 18, "Una esfera brillante que potencia los movimientos de tipo Acero y Drag�n. Debe llevarla Dialga."));
        Objetos.add(new Objetos("Gema Drag�n", 22, "Joya de un solo uso que potencia los movimientos de tipo Drag�n. Debe llevarla un Pok�mon."));
        Objetos.add(new Objetos("Huevo Suerte", 15, "Es un huevo lleno de felicidad que te hace ganar Puntos de"));
        Objetos.add(new Objetos("Hierva Unica", 10, "Permite el uso inmediato de cualquier movimiento en el primer turno. Es de un solo uso y debe llevarla un Pok�mon."));
        Objetos.add(new Objetos("Lutresfera", 12, "Una bonita esfera que potencia los movimientos de tipo Drag�n y Agua. Debe llevarla Palkia."));
        Objetos.add(new Objetos("Pa�uelo Elegido", 3, "Debe llevarlo un Pok�mon. Potencia la Velocidad, pero solo permite usar un movimiento."));
        Objetos.add(new Objetos("Telescopio", 80, "Debe llevarlo un Pok�mon. Si se mueve despu�s del enemigo, aumenta la Precisi�n del Pok�mon."));
        Objetos.add(new Objetos("Roca Calor", 77, "Prolonga la duraci�n del movimiento D�a Soleado que use el Pok�mon que la lleva."));
        Objetos.add(new Objetos("Vidaesfera", 76, "Potencia los movimientos, pero consume PS con cada ataque. Debe llevarla un Pok�mon."));

        //Instancias evoluci�n
        HashMap<Integer, Evolution> Evolution = new HashMap<Integer, Evolution>();
        Evolution.put(1, new Evolution("Colmillo Agudo", 20, "Si lo lleva un Pok�mon cuando inflige da�o a otro, puede hacer retroceder a este �ltimo."));
        Evolution.put(2, new Evolution("Diente Marino", 30, "Tiene el brillo afilado de la plata y debe llevarlo Clamperl. Sube el Ataque Especial."));
        Evolution.put(3, new Evolution("Disco Extra�o", 12, "Dispositivo transparente que contiene datos misteriosos. Es de fabricante desconocido."));
        Evolution.put(4, new Evolution("Escama Marina", 13, "Tiene un d�bil brillo rosado y debe llevarla Clamperl. Sube la Defensa Especial."));
        Evolution.put(5, new Evolution("Piedra Alba", 22, "Una piedra peculiar que hace evolucionar a algunos Pok�mon. Brilla como un lucero."));
        Evolution.put(6, new Evolution("Piedra Solar", 35, "Curiosa piedra que hace evolucionar a determinadas especies de Pok�mon. Es roja como el n�cleo del sol."));
        Evolution.put(7, new Evolution("Protector", 60, "Dispositivo de protecci�n muy pesado. Cierto Pok�mon lo adora."));
        Evolution.put(8, new Evolution("Revestimiento Met�lico", 86, "Pel�cula met�lica que fortalece los ataques de tipo Acero. Debe llevarlo un Pok�mon."));
        Evolution.put(9, new Evolution("Magmatizador", 19, "Esta caja contiene una enorme cantidad de energ�a magm�tica. Cierto Pok�mon lo adora."));
        Evolution.put(10, new Evolution("Tela Terrible", 100, "Tela imbuida de una energ�a espiritual muy potente. Cierto Pok�mon la adora."));


        GUI.mostrarLogo();
        int control = 1;

        while (control == 1) {

            GUI.mostrarElemento("MENU");
            GUI.menuTienda();
            int seleccion = leerNumero("1", "2");

            switch (seleccion) {
                case 1:
                    GUI.mostrarElemento("PRODUCTOS");
                    GUI.mostrarProductos();
                    int escogerProducto = leerNumero("1", "6");

                    switch (escogerProducto) {
                        case 1:
                            GUI.mostrarElemento("BOTIQUIN");
                            GUI.mostrarBotiquin();
                            int escogerBotiquin = leerNumero("1", "4");

                            switch (escogerBotiquin) {
                                case 1:
                                    GUI.mostrarElemento("CURACIÓN ESTADOS");
                                    CuracionEstados.forEach((k, v) -> System.out.println("       " + k + ". " + v.getNombre() + "\n" + "        Precio: " + v.getPrecio() + "\n" + "        Descripción: " + v.getDescription()));
                                    int numeroCuracionEstados = leerNumeroAgain(12);
                                    switch (numeroCuracionEstados) {
                                        case 1:
                                            comprar("Antihielo", 8);
                                            break;
                                        case 2:
                                            comprar("antiparalizador", 200);
                                            break;
                                        case 3:
                                            comprar("Antiquemar", 40);
                                            break;
                                        case 4:
                                            comprar("Antídoto", 20);
                                            break;
                                        case 5:
                                            comprar("Anti-Covid19", 100);
                                            break;
                                        case 6:
                                            comprar("Galleta Lava", 25);
                                            break;
                                        case 7:
                                            comprar("Galleta Vantra", 30);
                                            break;
                                        case 8:
                                            comprar("Hierba Mental", 67);
                                            break;
                                        case 9:
                                            comprar("Polvo Curación", 44);
                                            break;
                                        case 10:
                                            comprar("Porcehelado", 32);
                                            break;
                                        case 11:
                                            comprar("Refresco", 15);
                                            break;
                                        case 12:
                                            comprar("Restaurar Todo", 100);
                                            break;
                                    }
                                    break;


                                case 2:
                                    GUI.mostrarElemento("RECUPERAR VITALIDAD");
                                    RecuperarVitalidad.forEach((k, v) -> System.out.println("       " + k + ". " + v.getNombre() + "\n" + "        Precio: " + v.getPrecio() + "\n" + "        Descripción: " + v.getDescription()));
                                    int numeroRecuperarVitalidad = leerNumero("1", "9");
                                    switch (numeroRecuperarVitalidad){
                                        case 1:
                                            comprar("Poción", 22);
                                            break;
                                        case 2:
                                            comprar("Revivir", 19);
                                            break;
                                        case 3:
                                            comprar("Superpoción", 100);
                                            break;
                                        case 4:
                                            comprar("Limonada", 6);
                                            break;
                                        case 5:
                                            comprar("Leche Mu-mu", 12);
                                            break;
                                        case 6:
                                            comprar("Carameloraro", 99);
                                            break;
                                        case 7:
                                            comprar("Agua fresca", 2);
                                            break;
                                        case 8:
                                            comprar("Hiperpoción", 101);
                                            break;
                                        case 9:
                                            comprar("Raíz Energía", 105);
                                            break;
                                    }
                                    break;
                                case 3:
                                    GUI.mostrarElemento("CAMBIO PP");
                                    AtomicInteger i = new AtomicInteger(1);
                                    CambioPP.forEach(element -> System.out.println("     " + (i.getAndIncrement()) + ". " + element.getNombre()));
                                    int numeroCambioPP = leerNumero("1", "6");
                                    switch (numeroCambioPP){
                                        case 1:
                                            comprar("Elixir", 10);
                                            break;
                                        case 2:
                                            comprar("Elixir máximo", 20);
                                            break;
                                        case 3:
                                            comprar("Eter", 20);
                                            break;
                                        case 4:
                                            comprar("Eter máximo", 30);
                                            break;
                                        case 5:
                                            comprar("Más PP", 38);
                                            break;
                                        case 6:
                                            comprar("PP máximos", 56);
                                            break;
                                    }
                                    break;
                                case 4:
                                    GUI.mostrarElemento("MEJORAR ESTADISTICAS");
                                    AtomicInteger j = new AtomicInteger(1);
                                    MejorarEstadisticas.forEach(element -> System.out.println("      " + (j.getAndIncrement()) + ". " + element.getNombre() + "\n" + "        Precio: " + element.getPrecio() + "\n" + "        Descripción: " + element.getDescription()));
                                    int numeroMejorarEstadisticas = leerNumeroAgain(14);
                                    switch (numeroMejorarEstadisticas){
                                        case 1:
                                            comprar("Ataque X", 89);
                                            break;
                                        case 2:
                                            comprar("Calcio", 44);
                                            break;
                                        case 3:
                                            comprar("Carburante", 54);
                                            break;
                                        case 4:
                                            comprar("Defensa Especial X", 99);
                                            break;
                                        case 5:
                                            comprar("Defensa X", 101);
                                            break;
                                        case 6:
                                            comprar("Velocidad X", 110);
                                            break;
                                        case 7:
                                            comprar("Presición X", 98);
                                            break;
                                        case 8:
                                            comprar("Pluma Mente", 126);
                                            break;
                                        case 9:
                                            comprar("Pluma Músculo", 99);
                                            break;
                                        case 10:
                                            comprar("Pluma vigor", 100);
                                            break;
                                        case 11:
                                            comprar("Pluma Aguante", 111);
                                            break;
                                        case 12:
                                            comprar("Pluma ímpetu", 113);
                                            break;
                                        case 13:
                                            comprar("Pluma intelecto", 140);
                                            break;
                                        case 14:
                                            comprar("Hierro", 50);
                                            break;
                                    }
                                    break;
                                default:
                                    GUI.entradaErronea();
                                    break;
                            }
                            break;
                        case 2:
                            GUI.mostrarElemento("BAYAS");
                            Bayas.forEach((k, v) -> System.out.println("       " + k + ". " + v.getNombre() + "\n" + "        Precio: " + v.getPrecio() + "\n" + "        Descripción: " + v.getDescription()));
                            int numeroBayas = leerNumero("1", "8");
                            switch (numeroBayas){
                                case 1:
                                    comprar("Baya Atania", 12);
                                    break;
                                case 2:
                                    comprar("Baya Zreza", 16);
                                    break;
                                case 3:
                                    comprar("Baya Meloc", 19);
                                    break;
                                case 4:
                                    comprar("Baya Aranja", 5);
                                    break;
                                case 5:
                                    comprar("Baya Peragu", 2);
                                    break;
                                case 6:
                                    comprar("Baya Latano", 3);
                                    break;
                                case 7:
                                    comprar("Baya Perasi", 10);
                                    break;
                                case 8:
                                    comprar("Baya Gualot", 11);
                                    break;
                            }

                            break;
                        case 3:
                            GUI.mostrarElemento("OBJETOS CLAVE");
                            AtomicInteger i = new AtomicInteger(1);
                            Obj_clave.forEach(j -> System.out.println("      " + (i.getAndIncrement()) + ". " + j.getNombre() + "\n" + "        Precio: " + j.getPrecio() + "\n" + "        Descripción: " + j.getDescription()));
                            int numeroObjClave = leerNumero("1", "8");
                            switch (numeroObjClave){
                                case 1:
                                    comprar("Bici Acrobática", 89);
                                    break;
                                case 2:
                                    comprar("Super Caña", 50);
                                    break;
                                case 3:
                                    comprar("Monedero", 15);
                                    break;
                                case 4:
                                    comprar("Caña Buena", 20);
                                    break;
                                case 5:
                                    comprar("Busca Objetos", 31);
                                    break;
                                case 6:
                                    comprar("Cámara Lucha", 38);
                                    break;
                                case 7:
                                    comprar("Planta Bayas", 44);
                                    break;
                                case 8:
                                    comprar("Regadera", 10);
                                    break;
                            }
                            break;
                        case 4:
                            GUI.mostrarElemento("POKEBALLS");
                            PokeBall.forEach((k, v) -> System.out.println("       " + k + ". " + v.getNombre() + "\n" + "        Precio: " + v.getPrecio() + "\n" + "        Descripción: " + v.getDescription()));
                            int numeroPokeBall = leerNumero("1", "6");
                            switch (numeroPokeBall){
                                case 1:
                                    comprar("Ultra Ball", 20);
                                    break;
                                case 2:
                                    comprar("Super Ball", 9);
                                    break;
                                case 3:
                                    comprar("Poke Ball", 5);
                                    break;
                                case 4:
                                    comprar("Máster Ball", 11);
                                    break;
                                case 5:
                                    comprar("Honor Ball", 15);
                                    break;
                                case 6:
                                    comprar("Lujo Ball", 18);
                            }
                            break;
                        case 5:
                            GUI.mostrarElemento("OBJETOS COMUNES");
                            AtomicInteger w = new AtomicInteger(1);
                            Objetos.forEach(j -> System.out.println("      " + (w.getAndIncrement()) + ". " + j.getNombre() + "\n" + "        Precio: " + j.getPrecio() + "\n" + "        Descripción: " + j.getDescription()));
                            int numeroObjetos = leerNumeroAgain(10);
                            switch (numeroObjetos){
                                case 1:
                                    comprar("Agua Mística", 67);
                                    break;
                                case 2:
                                    comprar("Diamansfera", 18);
                                    break;
                                case 3:
                                    comprar("Gema Dragón", 22);
                                    break;
                                case 4:
                                    comprar("Huevo Suerte", 15);
                                    break;
                                case 5:
                                    comprar("Hierva única", 10);
                                    break;
                                case 6:
                                    comprar("Lutresfera", 12);
                                    break;
                                case 7:
                                    comprar("Pañuelo Elegido", 3);
                                    break;
                                case 8:
                                    comprar("Telescopio", 80);
                                    break;
                                case 9:
                                    comprar("Roca Calor", 77);
                                    break;
                                case 10:
                                    comprar("Vidaesfera", 76);
                                    break;
                            }
                            break;
                        case 6:
                            GUI.mostrarElemento("EVOLUCIÓN");
                            Evolution.forEach((k, v) -> System.out.println("       " + k + ". " + v.getNombre() + "\n" + "        Precio: " + v.getPrecio() + "\n" + "        Descripción: " + v.getDescription()));
                            int numeroEvolution = leerNumeroAgain(10);
                            switch (numeroEvolution){
                                case 1:
                                    comprar("Colmillo Agudo", 20);
                                    break;
                                case 2:
                                    comprar("Diente Marino", 30);
                                    break;
                                case 3:
                                    comprar("Disco Extraño", 12);
                                    break;
                                case 4:
                                    comprar("Escama Marina", 13);
                                    break;
                                case 5:
                                    comprar("Piedra Alba", 22);
                                    break;
                                case 6:
                                    comprar("Piedra solar", 35);
                                    break;
                                case 7:
                                    comprar("Protector", 60);
                                    break;
                                case 8:
                                    comprar("Revestimiento Metálico", 86);
                                    break;
                                case 9:
                                    comprar("Magmatizador", 19);
                                    break;
                                case 10:
                                    comprar("Tela Terrible", 100);
                                    break;
                            }
                            break;

                        default:
                            GUI.entradaErronea();
                            break;
                    }
                    break;
                case 2:
                    control = 0;
                    System.out.println("Vuelve cuando quieras");
                    break;
                default:
                    GUI.entradaErronea();
                    break;
            }
        }
    }

    public static int leerNumero(String l1, String l2) {
        Scanner lector = new Scanner(System.in);
        String entrada;
        int l1As = (int) l1.charAt(0);
        int l2As = (int) l2.charAt(0);
        while (true) {
            System.out.println("Ingresa la opción:");
            System.out.print("      ");
            entrada = lector.nextLine();
            int valorAscii = (int) entrada.charAt(0);
            if (l1As <= valorAscii && valorAscii <= l2As) {
                return Integer.parseInt(entrada);
            } else {
                GUI.entradaErronea();
            }
        }
    }

    public static int leerNumeroAgain(int limite) {
        Scanner lector = new Scanner(System.in);
        int entrada;
        while (true) {
            System.out.println("Ingresa la opción:");
            System.out.print("      ");
            entrada = lector.nextInt();
            if (1 <= entrada && entrada <= limite) {
                return entrada;
            } else {
                GUI.entradaErronea();
            }
        }
    }

    public static int darPrecio() {
        Scanner lector = new Scanner(System.in);
        String entrada;
        while (true) {
            System.out.println("       Buena elección \n        ¿Cuántas unidades quieres?");
            System.out.print("       ");
            entrada = lector.nextLine();
            int valorAscii = (int) entrada.charAt(0);
            return Integer.parseInt(entrada);
        }
    }

    public static boolean aceptar() {
        boolean acepta = false;
        System.out.println("       1. Aceptar");
        System.out.println("       2. Cancelar");
        System.out.print("       ");
        Scanner lector = new Scanner(System.in);
        int entrada;
        entrada = lector.nextInt();
        if (entrada == 1) {
            acepta = true;
        }else {
            System.out.println("Está bien");
        }
        return acepta;

    }

    public static void comprar(String compra, int vaLor) {
        GUI.mostrarElemento(compra);
        int costo = (darPrecio() * vaLor);
        System.out.println("     Eso serían: " + costo + "$" + " ¿Está bien?");
        if (aceptar() == true) {
            System.out.println("      Aquí tienes, vuelve cuando quieras");

        }
    }
}
