package logica;

import java.io.IOException;
import datos.*;
import visual.GUI;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

public class main {

    static Writer o = new PrintWriter(System.out);

    public static void main(String args[]){

        //Instancias elementos Curación Estados
        HashMap<String, CuracionEstados> CuracionEstados = new HashMap<String, CuracionEstados>();
        CuracionEstados.put("Antihielo", new CuracionEstados("Antihielo",8,"Medicina en espray que descongela a un Pokémon."));
        CuracionEstados.put("Antiparalizador", new CuracionEstados("Antiparalizador",200,"Medicina en espray que cura a un Pokémon paralizado."));
        CuracionEstados.put("Antiquemar", new CuracionEstados("Antiquemar",40,"Medicina en espray que cura las quemaduras a un Pokémon."));
        CuracionEstados.put("Antídoto",new CuracionEstados("Antídoto",20,"Medicina en espray que contrarresta los efectos del veneno en un Pokémon."));
        CuracionEstados.put("Antí-Covid19", new CuracionEstados("Antí-Covid19",100,"Te quita el covi"));
        CuracionEstados.put("Galleta Lava", new CuracionEstados("Galleta Lava",25,"Dulce típico de Pueblo Lavacalda que cura todos los problemas de estado de un Pokémon."));
        CuracionEstados.put("Galleta Yantra", new CuracionEstados("Galleta Yantra",30,"Especialidad de Ciudad Yantra. Cura los problemas de estado de un Pokémon."));
        CuracionEstados.put("Hierba Mental", new CuracionEstados("Hierba Mental",67,"El Pokémon que la lleva se libera del enamoramiento. Solo puede usarse una vez."));
        CuracionEstados.put("Polvo curación", new CuracionEstados("Polvo Curación",44,"Polvos medicinales muy amargos que curan todos los problemas de estado de un Pokémon.") );
        CuracionEstados.put("Porcehelado", new CuracionEstados("Porcehelado",32,"Especialidad de Ciudad Porcelana. Cura los problemas de estado de un Pokémon.") );
        CuracionEstados.put("Refresco", new CuracionEstados("Refresco",15,"Chispeante bebida gaseosa que restaura 60 PS de un Pokémon.") );
        CuracionEstados.put("Restaurar Todo", new CuracionEstados("Restaurar Todo",100,"Medicina que restaura todos los PS y cura todos los problemas de estado de un Pokémon."));

        //Instancias elementos Recuperar Vitalidad
        HashMap<String, RecuperarVitalidad> RecuperarVitalidad = new HashMap<String, RecuperarVitalidad>();
        RecuperarVitalidad.put("Pocion", new RecuperarVitalidad("Poción",22,"Medicina en espray que cura heridas y restaura 20 PS a un Pokémon."));
        RecuperarVitalidad.put("Revivir", new RecuperarVitalidad("Revivir", 19,"Medicina que revive a un Pokémon debilitado y le devuelve la mitad de sus PS."));
        RecuperarVitalidad.put("Superpocion", new RecuperarVitalidad("Superpoción",100,"Medicina en espray que cura heridas y restaura 50 PS de un Pokémon."));
        RecuperarVitalidad.put("Limonada", new RecuperarVitalidad("Limonada",6,"Bebida muy dulce que restaura 80 PS de un Pokémon."));
        RecuperarVitalidad.put("Leche Mu-mu", new RecuperarVitalidad("Leche Mu-mu",12,"Leche de alto valor nutritivo que restaura 100 PS de un Pokémon."));
        RecuperarVitalidad.put("Caramelo Raro", new RecuperarVitalidad("Caramelo Raro",99,"Caramelo energético que sube a un Pokémon de nivel."));
        RecuperarVitalidad.put("Agua Fresca", new RecuperarVitalidad("Agua Fresca",2,"Agua de alto contenido mineral que restaura 50 PS de un Pokémon."));
        RecuperarVitalidad.put("Hiperpoción", new RecuperarVitalidad("Hiperpoción",101,"Medicina en espray que cura heridas y restaura 200 PS de un Pokémon."));
        RecuperarVitalidad.put("Raíz Energía", new RecuperarVitalidad("Raíz Energía",105,"Raíz muy amarga que restaura 200 PS de un Pokémon."));

        //Instancias elementos Recuperar
        HashSet<CambioPP> CambioPP = new HashSet<CambioPP>();
        CambioPP.add(new CambioPP("Elixir",10,"Restaura 10 PP de todos los movimientos aprendidos por el Pokémon elegido."));
        CambioPP.add(new CambioPP("Elixir Maximo", 20,"Restaura completamente los PP de todos los movimientos aprendidos por el Pokémon elegido."));
        CambioPP.add(new CambioPP("Éter",20,"Restaura 10 PP del movimiento elegido de un Pokémon."));
        CambioPP.add(new CambioPP("Éter Maximo",30,"Restaura completamente los PP del movimiento elegido de un Pokémon."));
        CambioPP.add(new CambioPP("Más PP",38,"Aumenta ligeramente los PP máximos del movimiento elegido de un Pokémon."));
        CambioPP.add(new CambioPP("PP Máximos",56,"Aumenta hasta el límite los PP máximos del movimiento elegido de un Pokémon."));

        //Instancias Mejora de estadísticas
        HashSet<MejorarEstadisticas> MejorarEstadisticas = new HashSet<MejorarEstadisticas>();
        MejorarEstadisticas.add(new MejorarEstadisticas("Ataque X",89,"Aumenta el Ataque en combate. Al intercambiar de Pokémon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Calcio",44,"Nutritiva bebida que potencia el Ataque Especial de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Carburante",54,"Nutritiva bebida que potencia la Velocidad de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defenza Espacial X",99,"Aumenta la Defensa Especial en combate. Al cambiar de Pokémon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Defenza X",101,"Aumenta la Defensa en combate. Al cambiar de Pokémon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Velocidad X",110,"Aumenta la Velocidad en combate. Al cambiar de Pokémon, el efecto desaparece."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Precisión X",98,"Aumenta la Precisión de los ataques en combate. Al cambiar de Pokémon, el efecto desaparece.")) ;
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Mente",126,"Pluma que aumenta un poco la Defensa Especial de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Músculo",99,"Pluma que aumenta un poco el Ataque de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Vigor",100,"Pluma que aumenta un poco los PS de base de un Pokémon"));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Aguante",111,"Pluma que aumenta un poco la Defensa de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma ímpetu",113,"Pluma que aumenta un poco la Velocidad de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Pluma Intelecto",140,"Pluma que aumenta un poco el Ataque Especial de base de un Pokémon."));
        MejorarEstadisticas.add(new MejorarEstadisticas("Hierro",50,"Nutritiva bebida que potencia la Defensa de base de un Pokémon."));

        //Instancias Bayas
        TreeMap<String, Bayas> Bayas = new TreeMap<String, Bayas>();
        Bayas.put("Baya Atania",new Bayas("Baya Atania",12,"Los Pokémon pueden llevarla o usarla para despertar del sueño."));
        Bayas.put("Baya Zreza", new Bayas("Baya Zreza",16,"Los Pokémon pueden llevarla o usarla para recuperarse de los parálisis"));
        Bayas.put("Baya Meloc", new Bayas("Baya Meloc",19,"Los Pokémon pueden llevarla o usarla para curarse del envenenamiento."));
        Bayas.put("Baya Aranja", new Bayas("Baya Aranja",5,"Los Pokémon pueden llevarla o usarla para restaurar 10PS."));
        Bayas.put("Baya Peragu", new Bayas("Baya Peragu",2,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokémon de la región de Sinnoh."));
        Bayas.put("Baya Latano", new Bayas("Baya Latano",3,"Uno de los famosos ingredientes para preparar Pokochos, los dulces para Pokémon de la región de Sinnoh."));
        Bayas.put("Baya Perasi", new Bayas("Baya Perasi",10,"Los Pokémon pueden levarla o usarla para descongelarse."));
        Bayas.put("Baya Gualot", new Bayas("Baya Gualot",11,"Si la lleva un Pokémon, debilita un ataque supereficaz de tipo Eléctrico de un enemigo."));

        //Instancias Objetos Clave
        ArrayList<Obj_clave> Obj_clave = new ArrayList<Obj_clave>();
        Obj_clave.add(new Obj_clave("Bici Acrobática",89,"Bici plegable ideal para saltar y hacer caballitos y giros."));
        Obj_clave.add(new Obj_clave("Super Caña",50,"Increíble caña de pescar de alta tecnología. Pesca Pokémon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Monedero",15,"Te servirá para llevar hasta 9999 fichas."));
        Obj_clave.add(new Obj_clave("Caña Buena",20,"Caña de pescar nuevecita y de gran calidad. Pesca Pokémon salvajes en todo tipo de aguas."));
        Obj_clave.add(new Obj_clave("Busca Obejtos",31,"Detector de objetos invisibles por ondas sonoras."));
        Obj_clave.add(new Obj_clave("Camára Lucha",38,"Un fantástico dispositivo que graba combates entre amigos o celebrados en algún recinto especial."));
        Obj_clave.add(new Obj_clave("Planta Bayas",44,"Dispositivo portátil de cultivo que permite plantar Bayas en cualquier momento de forma sencilla."));
        Obj_clave.add(new Obj_clave("Regadera",10,"Objeto que contiene agua y se usa para regar las Bayas del Plantabayas."));

        //Instancias PokeBalls
        TreeMap<String, PokeBall> PokeBall = new TreeMap<String, PokeBall>();
        PokeBall.put("Ultra Ball", new PokeBall("Ultra Ball",20,"oké Ball de rendimiento superior. Tiene un índice de éxito mayor al de la Super Ball."));
        PokeBall.put("Super Ball", new PokeBall("Super Ball",9,"Poké Ball de alto rendimiento. Tiene un índice de éxito superior al de la Poké Ball."));
        PokeBall.put("Poké Ball", new PokeBall("Poké Ball",5,"Dispositivo con diseño capsular que atrapa Pokémon salvajes. Se lanza como una bola contra el blanco."));
        PokeBall.put("Máster Ball", new PokeBall("Máster Ball",11,"La Poké Ball definitiva. Atrapa cualquier Pokémon salvaje y no falla nunca."));
        PokeBall.put("Honor Ball", new PokeBall("Honor Ball",15,"Es una Poké Ball algo singular que se creó para conmemorar algún acontecimiento."));
        PokeBall.put("Lujo Ball", new PokeBall("Lujo Ball",18,"Acogedora Poké Ball que hace más amistosos a los Pokémon salvajes capturados."));


        //Instancias Objetos
        ArrayList<Objetos> Objetos = new ArrayList<Objetos>();
        Objetos.add(new Objetos("Agua Mística",67,"Gema con forma de gota de agua que fortalece los movimientos de tipo Agua. Debe lleverla un Pokémon."));
        Objetos.add(new Objetos("Diamansfera",18,"Una esfera brillante que potencia los movimientos de tipo Acero y Dragón. Debe llevarla Dialga."));
        Objetos.add(new Objetos("Gema Dragón",22,"Joya de un solo uso que potencia los movimientos de tipo Dragón. Debe llevarla un Pokémon."));
        Objetos.add(new Objetos("Huevo Suerte",15,"Es un huevo lleno de felicidad que te hace ganar Puntos de"));
        Objetos.add(new Objetos("Hierva Unica",10,"Permite el uso inmediato de cualquier movimiento en el primer turno. Es de un solo uso y debe llevarla un Pokémon.")) ;
        Objetos.add(new Objetos("Lutresfera",12,"Una bonita esfera que potencia los movimientos de tipo Dragón y Agua. Debe llevarla Palkia."));
        Objetos.add(new Objetos("Pañuelo Elegido",3,"Debe llevarlo un Pokémon. Potencia la Velocidad, pero solo permite usar un movimiento."));
        Objetos.add(new Objetos("Telescopio",80,"Debe llevarlo un Pokémon. Si se mueve después del enemigo, aumenta la Precisión del Pokémon."));
        Objetos.add(new Objetos("Roca Calor",77,"Prolonga la duración del movimiento Día Soleado que use el Pokémon que la lleva."));
        Objetos.add(new Objetos("Vidaesfera",76,"Potencia los movimientos, pero consume PS con cada ataque. Debe llevarla un Pokémon."));


        //Instancias evolución
        HashMap<String, Evolution> Evolution = new HashMap<String, Evolution>();
        Evolution.put("Colmillo Agudo", new Evolution("Colmillo Agudo",20,"Si lo lleva un Pokémon cuando inflige daño a otro, puede hacer retroceder a este último."));
        Evolution.put("Diente Marino", new Evolution("Diente Marino",30,"Tiene el brillo afilado de la plata y debe llevarlo Clamperl. Sube el Ataque Especial."));
        Evolution.put("Disco Extraño", new Evolution("Disco Extraño",12,"Dispositivo transparente que contiene datos misteriosos. Es de fabricante desconocido."));
        Evolution.put("Escama Marina", new Evolution("Escama Marina",13,"Tiene un débil brillo rosado y debe llevarla Clamperl. Sube la Defensa Especial."));
        Evolution.put("Piedra Alba", new Evolution("Piedra Alba",22,"Una piedra peculiar que hace evolucionar a algunos Pokémon. Brilla como un lucero."));
        Evolution.put("Piedra Solar", new Evolution("Piedra Solar",35,"Curiosa piedra que hace evolucionar a determinadas especies de Pokémon. Es roja como el núcleo del sol."));
        Evolution.put("Protector",new Evolution("Protector",60,"Dispositivo de protección muy pesado. Cierto Pokémon lo adora.") );
        Evolution.put("Revestimiento Metálico", new Evolution("Revestimiento Metálico",86,"Película metálica que fortalece los ataques de tipo Acero. Debe llevarlo un Pokémon."));
        Evolution.put("Magmatizador", new Evolution("Magmatizador",19,"Esta caja contiene una enorme cantidad de energía magmática. Cierto Pokémon lo adora."));
        Evolution.put("Tela Terrible", new Evolution("Tela Terrible",100,"Tela imbuida de una energía espiritual muy potente. Cierto Pokémon la adora."));


        GUI.mostrarLogo();
        int control = 1;
        while (control == 1){

            GUI.menuTienda();
            int seleccion = leerNumero();

            switch (seleccion){
                case 1:

                    GUI.mostrarProductos();
                    int escogerProducto = leerNumero();

                    switch (escogerProducto){
                        case 1:

                            GUI.mostrarBotiquin();
                            int escogerBotiquin = leerNumero();

                            switch (escogerBotiquin){
                                case 1:

                            }
                        case 2:

                    }
                    break;
                case 2:
                    control = 0;
                    System.out.println("Vuelve cuando quieras");
                    break;
            }

        }

    }

    public static int leerNumero(){
        Scanner lector = new Scanner(System.in);
        String entrada;
        while (true){
            System.out.println("Ingresa la opción:");
            entrada = lector.nextLine();
            int valorAscii = (int)entrada.charAt(0);
            if ( 48 <= valorAscii  && valorAscii <= 52){
                return Integer.parseInt(entrada);
            }else{
                System.out.println("Entrada invalida, vuelve a intentarlo");
            }
        }
    }
}


